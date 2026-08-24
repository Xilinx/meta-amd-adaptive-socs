SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu104-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08230755/external/openamp-zephyr-demo/zynqmp-zcu104-multidomain_openamp-zephyr-demo_08230755.tar.gz"
SRC_URI[sha256sum] = "e84573b2dea611ed94ad340e8e5401f2272946bbd4b33dd0c7f436b35e43642c"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu104"
OPENAMPFW_PKGDIR_SUFFIX:zynqmp = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
