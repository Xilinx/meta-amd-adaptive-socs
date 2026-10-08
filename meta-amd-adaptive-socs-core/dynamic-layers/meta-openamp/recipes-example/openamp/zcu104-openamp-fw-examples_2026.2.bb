SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu104-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10080546/external/openamp-zephyr-demo/zynqmp-zcu104-multidomain_openamp-zephyr-demo_10080546.tar.gz"
SRC_URI[sha256sum] = "4a326291763c7994ffe3c93377eacc95f060f13d412a3cf7c142ec4747e0e9df"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu104"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
