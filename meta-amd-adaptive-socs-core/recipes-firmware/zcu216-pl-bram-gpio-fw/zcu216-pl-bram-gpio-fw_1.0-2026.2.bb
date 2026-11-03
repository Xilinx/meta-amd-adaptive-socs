SUMMARY = "ZCU216 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU216 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/11030216/external/fwapp/zcu216-pl-bram-gpio-fw_2026.2_1103_1_11030216.tar.gz"

SRC_URI[sha256sum] = "1c7ed30ef6494432557335ffc35e6b53ac037bf417ae82d83229cc00e6ef1a66"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu216-sdt-full = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu216-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zcu216/pl/${FW_DIR}"
