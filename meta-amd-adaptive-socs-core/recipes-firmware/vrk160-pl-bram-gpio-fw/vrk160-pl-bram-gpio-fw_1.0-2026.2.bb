SUMMARY = "VRK160 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VRK160 Segemented Configuration(DFx Full) PL AXI BRAM and AXI GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10280834/external/fwapp/vrk160-pl-bram-gpio-fw_2026.2_1028_1_10280834.tar.gz"

SRC_URI[sha256sum] = "952d290f2999a68903dca4fda9aa4c5f1ba20b7b55e4208648a035b64e6483d8"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vrk160-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vrk160/pl/${FW_DIR}"
