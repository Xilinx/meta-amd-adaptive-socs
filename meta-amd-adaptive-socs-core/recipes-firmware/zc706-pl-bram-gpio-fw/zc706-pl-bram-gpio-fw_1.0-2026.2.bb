SUMMARY = "ZC706 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZC706 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09160614/external/fwapp/zc706-pl-bram-gpio-fw_2026.2_0916_1_09160614.tar.gz"

SRC_URI[sha256sum] = "ffd95af444b358da66d0722450f4ce6c04ae036d6f75ad398902eea1ab5e2b24"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa9thf-neon-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynq-zc706-sdt-full = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zc706-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zc706/pl/${FW_DIR}"
