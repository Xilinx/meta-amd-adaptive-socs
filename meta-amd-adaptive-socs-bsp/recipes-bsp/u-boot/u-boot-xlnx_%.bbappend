FILESEXTRAPATHS:prepend:versal-2ve-2vm := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-vek280-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-vrk160-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-vrk165-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:zynq-zc702-sdt-full := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:zynq-zc706-sdt-full := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:microblaze-v := "${THISDIR}/u-boot-xlnx:"

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

# EFI variable storage on SPI flash - for machines with the UEFI
# variables partition in their OSPI layout (offset 0x1580000)
SRC_URI:append:versal-vek280-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-2ve-2vm-vek385-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-2ve-2vm-vek385-revb-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-vrk160-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-vrk165-multidomain = " file://efi-variable-sf.cfg"
SRC_URI:append:versal-2ve-2vm-vek386-multidomain = " file://efi-variable-sf.cfg"

do_unpack:append:microblaze-v() {
    bb.build.exec_func('do_env_config', d)
}

do_env_config() {
    if [ -f "${WORKDIR}/mbv64.env" ]; then
        cp ${WORKDIR}/mbv64.env ${S}/board/xilinx/mbv/mbv64.env
    fi
}
