FILESEXTRAPATHS:prepend:versal-2ve-2vm := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-vek280-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-vrk160-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-vrk160-revb-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-vrk165-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-vrk165-revb-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-2vp-vpk360-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:zynq-zc702-sdt-full := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:zynq-zc706-sdt-full := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:microblaze-v := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:mbv64-scu200-revb-sdt := "${THISDIR}/u-boot-xlnx:"

SRC_URI:append:versal-2ve-2vm = "\
    file://u-boot-misc.cfg \
    "
SRC_URI:append:zynq-zc702-sdt-full = "\
    file://u-boot-misc_zynq.cfg \
    "
SRC_URI:append:zynq-zc706-sdt-full = "\
    file://u-boot-misc_zynq.cfg \
    "
SRC_URI:append:microblaze-v = "\
    file://u-boot-misc_mbv64.cfg \
    file://mbv64.env \
    "
SRC_URI:append:mbv64-scu200-revb-sdt = "\
    file://u-boot-misc_mbv64-scu200-revb.cfg \
    "

# EFI variable storage on SPI flash - for machines with the UEFI
# variables partition in their OSPI layout (offset 0x1580000)
SRC_URI:append:versal-vek280-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-2ve-2vm-vek385-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-2ve-2vm-vek385-revb-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-vrk160-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-vrk160-revb-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-vrk165-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-vrk165-revb-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-2ve-2vm-vek386-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-2vp-vpk360-multidomain = " file://efi-variable-sf.cfg"

do_unpack:append:microblaze-v() {
    bb.build.exec_func('do_env_config', d)
}

# scriptaddr must live in DDR, whose base differs per board (reva 0x80000000,
# revb 0x100000000). Derive it from DDR_BASEADDR like meta-amd-edf does.
MBV_SCRIPTADDR_OFFSET ?= "0x04000000"
MBV_SCRIPTADDR = "${@'0x%x' % (int(d.getVar('DDR_BASEADDR') or '0x80000000', 16) + int(d.getVar('MBV_SCRIPTADDR_OFFSET'), 16))}"

do_env_config() {
    if [ -f "${WORKDIR}/mbv64.env" ]; then
        sed -e 's/@@SCRIPTADDR@@/${MBV_SCRIPTADDR}/' \
            ${WORKDIR}/mbv64.env > ${S}/board/xilinx/mbv/mbv64.env
    fi
}
