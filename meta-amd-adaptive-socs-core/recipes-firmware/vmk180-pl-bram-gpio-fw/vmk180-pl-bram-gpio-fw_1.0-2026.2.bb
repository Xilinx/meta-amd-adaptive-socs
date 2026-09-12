SUMMARY = "VMK180 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VMK180 Segemented Configuration(DFx Full) PL AXI BRAM, AXI GPIO and AXI UART firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09120607/external/fwapp/vmk180-pl-bram-gpio-fw_2026.2_0912_1_09120607.tar.gz"

SRC_URI[sha256sum] = "66fb65f88555029aaf3bb95b48ff50dbc3ee4836a3162f93fffada1f22ec4bfd"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vmk180-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vmk180/pl/${FW_DIR}"
