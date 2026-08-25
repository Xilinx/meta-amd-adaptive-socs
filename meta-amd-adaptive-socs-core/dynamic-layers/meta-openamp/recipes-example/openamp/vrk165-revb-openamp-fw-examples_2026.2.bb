SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-vrk165-revb-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08250736/external/openamp-zephyr-demo/versal-vrk165-revb-multidomain_openamp-zephyr-demo_08250736.tar.gz"
SRC_URI[sha256sum] = "b6e78740f4bb9bede10e268be95b67d4fa7403efb50920aca7e38e8e1aa07c54"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

OPENAMPFW_BOARD = "vrk165-revb"
OPENAMPFW_PKGDIR_SUFFIX:versal = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
