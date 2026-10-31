SUMMARY = "VMK365 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VMK365 Segemented Configuration(DFx Full) PL AXI BRAM and AXI GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10310614/external/fwapp/vmk365-pl-bram-gpio-fw_2026.2_1031_1_10310614.tar.gz"

SRC_URI[sha256sum] = "687cb43d79312b8b19ab5543d854241ce299e49278fc6043f951eceb88f81938"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-2ve-2vm-vmk365-sdt-seg = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vmk365-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vmk365/pl/${FW_DIR}"
