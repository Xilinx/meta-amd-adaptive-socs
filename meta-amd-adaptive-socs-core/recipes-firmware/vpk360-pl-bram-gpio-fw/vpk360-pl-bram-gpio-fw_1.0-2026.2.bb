SUMMARY = "Vpk360 Segmented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "Vpk360 Segmented Configuration(DFx Full) PL AXI BRAM and AXI GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10060656/external/fwapp/vpk360-pl-bram-gpio-fw_2026.2_1006_1_10060656.tar.gz"

SRC_URI[sha256sum] = "c877711883721fb0deb1d43e9b9db73679270a2e866a0c9c79fd253b9c072fa8"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vpk360-sdt-seg = "${MACHINE}"
# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vpk360-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vpk360/pl/${FW_DIR}"
