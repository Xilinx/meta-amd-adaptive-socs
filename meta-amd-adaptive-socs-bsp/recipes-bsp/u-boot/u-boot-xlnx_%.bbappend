# Make the local files directory searchable for all machines. This only adds
# the directory to the search path; the override-scoped variables below
# control which machines actually consume each .cfg/.env file.
FILESEXTRAPATHS:prepend := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:mbv64-scu200-revb-sdt := "${THISDIR}/u-boot-xlnx:"

# One variable per independent condition: the machine overrides are
# mutually exclusive among themselves, but a MicroBlaze-V machine matches
# both the tune override and its own machine override.
ASOCS_UBOOT_MISC_CFG = ""
ASOCS_UBOOT_MISC_CFG:versal-2ve-2vm-vek385-sdt-seg = "file://u-boot-misc.cfg"
ASOCS_UBOOT_MISC_CFG:versal-2ve-2vm-vek385-revb-sdt-seg = "file://u-boot-misc.cfg"
ASOCS_UBOOT_MISC_CFG:versal-2ve-2vm-vek386-sdt-seg = "file://u-boot-misc.cfg"
ASOCS_UBOOT_MISC_CFG:zynq-zc702-sdt-full = "file://u-boot-misc_zynq.cfg"
ASOCS_UBOOT_MISC_CFG:zynq-zc706-sdt-full = "file://u-boot-misc_zynq.cfg"

ASOCS_UBOOT_MBV_SRC = ""
ASOCS_UBOOT_MBV_SRC:microblaze-v = "file://u-boot-misc_mbv64.cfg file://mbv64.env"

ASOCS_UBOOT_SCU200_CFG = ""
ASOCS_UBOOT_SCU200_CFG:mbv64-scu200-revb-sdt = "file://u-boot-misc_mbv64-scu200-revb.cfg"

# EFI variable storage on SPI flash - for machines with the UEFI
# variables partition in their OSPI layout (offset 0x1580000)
ASOCS_UBOOT_EFI_SF_CFG = ""
ASOCS_UBOOT_EFI_SF_CFG:versal-vek280-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-vhk158-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-2ve-2vm-vek385-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-2ve-2vm-vek385-revb-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-vrk160-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-vrk160-revb-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-vrk165-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-vrk165-revb-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-2ve-2vm-vek386-multidomain = "file://efi-variable-sf.cfg"
ASOCS_UBOOT_EFI_SF_CFG:versal-2vp-vpk360-multidomain = "file://efi-variable-sf.cfg"

SRC_URI += "\
    ${ASOCS_UBOOT_MISC_CFG} \
    ${ASOCS_UBOOT_MBV_SRC} \
    ${ASOCS_UBOOT_SCU200_CFG} \
    ${ASOCS_UBOOT_EFI_SF_CFG} \
    "

do_unpack:append:microblaze-v() {
    bb.build.exec_func('do_env_config', d)
}

# scriptaddr must live in DDR, whose base differs per board (RevA
# 0x80000000, RevB 0x100000000). Derive it from DDR_BASEADDR like meta-amd-edf does.
MBV_SCRIPTADDR_OFFSET ?= "0x04000000"
MBV_SCRIPTADDR = "${@'0x%x' % (int(d.getVar('DDR_BASEADDR') or '0x80000000', 16) + int(d.getVar('MBV_SCRIPTADDR_OFFSET'), 16))}"

do_env_config() {
    if [ -f "${UNPACKDIR}/mbv64.env" ]; then
        sed -e 's/@@SCRIPTADDR@@/${MBV_SCRIPTADDR}/' \
            ${UNPACKDIR}/mbv64.env > ${S}/board/xilinx/mbv/mbv64.env
    fi
}
