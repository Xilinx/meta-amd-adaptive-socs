SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-vrk160-revb-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08230755/external/openamp-zephyr-demo/versal-vrk160-revb-multidomain_openamp-zephyr-demo_08230755.tar.gz"
SRC_URI[sha256sum] = "5751cefc5545eabdba58219b6d275fddf085cee11a9a0b7571a4ef5ee968f0df"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

OPENAMPFW_BOARD = "vrk160-revb"
OPENAMPFW_PKGDIR_SUFFIX:versal = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
