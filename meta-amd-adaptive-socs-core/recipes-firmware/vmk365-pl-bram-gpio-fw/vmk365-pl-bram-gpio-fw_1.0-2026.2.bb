SUMMARY = "VMK365 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VMK365 Segemented Configuration(DFx Full) PL AXI BRAM and AXI GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/11030216/external/fwapp/vmk365-pl-bram-gpio-fw_2026.2_1103_1_11030216.tar.gz"

SRC_URI[sha256sum] = "3e9b24da4bb2eea9a016b725f37589223707316fb982b69bbf253ade9c91b719"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-2ve-2vm-vmk365-sdt-seg = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vmk365-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vmk365/pl/${FW_DIR}"
