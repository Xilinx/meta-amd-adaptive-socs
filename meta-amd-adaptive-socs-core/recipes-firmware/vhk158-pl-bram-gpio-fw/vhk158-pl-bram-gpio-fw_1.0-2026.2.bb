SUMMARY = "VHK158 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VHK158 Segemented Configuration(DFx Full) PL AXI BRAM, AXI GPIO and AXI UART firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08250736/external/fwapp/vhk158-pl-bram-gpio-fw_2026.2_0825_1_08250736.tar.gz"

SRC_URI[sha256sum] = "698719489ce002d5ec99c689b1d6727a0714d86f6e662b9afb3e1da50bf172fe"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vhk158-sdt-seg = "${MACHINE}"

FW_DIR = "vhk158-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vhk158/pl/${FW_DIR}"
