SUMMARY = "ZCU106 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU106 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08240939/external/fwapp/zcu106-pl-bram-gpio-fw_2026.2_0824_1_08240939.tar.gz"

SRC_URI[sha256sum] = "30e6359a38b547f5ee1e741e8a33fe7d4319de0981b82e2b3d9490300053f374"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu106-sdt-full = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu106-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zcu106/pl/${FW_DIR}"
