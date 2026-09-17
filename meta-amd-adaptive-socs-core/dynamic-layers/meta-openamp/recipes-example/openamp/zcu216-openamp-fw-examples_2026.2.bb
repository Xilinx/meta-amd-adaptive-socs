SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu216-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09170543/external/openamp-zephyr-demo/zynqmp-zcu216-multidomain_openamp-zephyr-demo_09170543.tar.gz"
SRC_URI[sha256sum] = "30c7d6aca325ee9fcc11638295e9ff2b4547c1853bb1c7ff976a691ad76db52e"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu216"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
