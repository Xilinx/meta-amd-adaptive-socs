SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-vrk165-revb-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10080546/external/openamp-zephyr-demo/versal-vrk165-revb-multidomain_openamp-zephyr-demo_10080546.tar.gz"
SRC_URI[sha256sum] = "7cb039657fadd7031ef85b3baf96c752dc6362fde4ccd45d1a13cf2ce4eb1749"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

OPENAMPFW_BOARD = "vrk165-revb"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
