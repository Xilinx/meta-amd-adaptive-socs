SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-vrk160-revb-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/11030216/external/openamp-zephyr-demo/versal-vrk160-revb-multidomain_openamp-zephyr-demo_11030216.tar.gz"
SRC_URI[sha256sum] = "73af70ff2a22e730d406d5256be6273f4fe0cbd493720f3f574ce06524bae9b7"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

OPENAMPFW_BOARD = "vrk160-revb"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
