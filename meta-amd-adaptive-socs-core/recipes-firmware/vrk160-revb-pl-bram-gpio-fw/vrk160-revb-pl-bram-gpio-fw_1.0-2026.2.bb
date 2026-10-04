SUMMARY = "VRK160 REVB Segmented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VRK160 REVB Segmented Configuration(DFx Full) PL AXI BRAM and AXI GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10040624/external/fwapp/vrk160-revb-pl-bram-gpio-fw_2026.2_1004_1_10040624.tar.gz"
SRC_URI[sha256sum] = "98c9297b7c276603df706d80786c767f0fe34ca736003caf4b9548cdbbdd6184"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vrk160-revb-sdt-seg = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vrk160-revb-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vrk160-revb/pl/${FW_DIR}"

