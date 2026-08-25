SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-vrk165-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08250736/external/openamp-zephyr-demo/versal-vrk165-multidomain_openamp-zephyr-demo_08250736.tar.gz"
SRC_URI[sha256sum] = "0c5ff5460f9c308f8cdd8ba062b107b8fa93e5db303b6125c295915ad213429d"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

OPENAMPFW_BOARD = "vrk165"
OPENAMPFW_PKGDIR_SUFFIX:versal = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
