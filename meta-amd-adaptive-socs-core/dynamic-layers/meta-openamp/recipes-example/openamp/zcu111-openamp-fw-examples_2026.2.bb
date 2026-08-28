SUMMARY = " Zephyr OpenAMP RPU firmware demo "
DESCRIPTION = " RPU SIDE OpenAMP RPU FW for Zehyr Demo "
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu111-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08281142/external/openamp-zephyr-demo/zynqmp-zcu111-multidomain_openamp-zephyr-demo_08281142.tar.gz"
SRC_URI[sha256sum] = "f0f35a433f69ded052ddede1efbf3b0e32c2a9f94b6713aac355acaad1d33d29"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu111"
OPENAMPFW_PKGDIR_SUFFIX:zynqmp = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
