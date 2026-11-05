SUMMARY = "VRK165 RevB Segmented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VRK165 RevB Segmented Configuration(DFx Full) PL AXI BRAM and AXI GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/11042350/external/fwapp/vrk165-revb-pl-bram-gpio-fw_2026.2_1105_1_11042350.tar.gz"

SRC_URI[sha256sum] = "8fccf11f6e3c248fac6efc60a7e5e43f94def326cc1e8f90fd0f5b9ae6729463"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vrk165-revb-sdt-seg = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vrk165-revb-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vrk165-revb/pl/${FW_DIR}"
