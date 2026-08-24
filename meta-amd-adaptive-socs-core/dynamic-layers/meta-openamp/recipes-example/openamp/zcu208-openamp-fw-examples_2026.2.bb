SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu208-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08230755/external/openamp-zephyr-demo/zynqmp-zcu208-multidomain_openamp-zephyr-demo_08230755.tar.gz"
SRC_URI[sha256sum] = "58136d480437ffdce3291fa5932775a6afcc05c8c36d8faf894c8f1d99d59a9f"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu208"
OPENAMPFW_PKGDIR_SUFFIX:zynqmp = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
