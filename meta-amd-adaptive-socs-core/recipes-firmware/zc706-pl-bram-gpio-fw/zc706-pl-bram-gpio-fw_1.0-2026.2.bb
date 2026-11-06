SUMMARY = "ZC706 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZC706 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/11060111/external/fwapp/zc706-pl-bram-gpio-fw_2026.2_1106_1_11060111.tar.gz"

SRC_URI[sha256sum] = "edf703868d71cb9946f011e26c095a9a6ca37a58a66278a336d11c20da3267f1"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa9thf-neon-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynq-zc706-sdt-full = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zc706-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zc706/pl/${FW_DIR}"
