SUMMARY = "VHK158 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VHK158 Segemented Configuration(DFx Full) PL AXI BRAM, AXI GPIO and AXI UART firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09070710/external/fwapp/vhk158-pl-bram-gpio-fw_2026.2_0907_1_09070710.tar.gz"

SRC_URI[sha256sum] = "ee180dd2d1fad85a3001266840696439fb6b517cc5f2bc97faa302c87798293d"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vhk158-sdt-seg = "${MACHINE}"

FW_DIR = "vhk158-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vhk158/pl/${FW_DIR}"
