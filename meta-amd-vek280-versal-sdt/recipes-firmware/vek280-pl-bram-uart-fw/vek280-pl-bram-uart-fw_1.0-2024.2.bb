SUMMARY = "VEK280 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK280 Segemented Configuration(DFx Full) PL AXI BRAM and AXI UART IP firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = " \
    https://artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/misc/2024.2/xlnx-versal-vek280-revb/vek280-sdt-seg-cfg-fw.tar.gz \
    "

SRC_URI[sha256sum] = "59eb6d1f83de34736740ba8b0704fb38f9e81c33d2badd777c1e64e6242f789a"
COMPATIBLE_MACHINE:versal = "versal"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek280-sdt-seg-cfg-fw"
