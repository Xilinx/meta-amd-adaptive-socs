SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-vrk165-revb-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/11030216/external/openamp-zephyr-demo/versal-vrk165-revb-multidomain_openamp-zephyr-demo_11030216.tar.gz"
SRC_URI[sha256sum] = "484e78fca28b2183af1a53ae34fce7e4d1d5ef9e0a790048aa29864464fc81ce"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

OPENAMPFW_BOARD = "vrk165-revb"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
