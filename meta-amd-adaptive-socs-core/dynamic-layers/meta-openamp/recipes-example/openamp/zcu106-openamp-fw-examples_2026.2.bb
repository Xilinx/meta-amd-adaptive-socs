SUMMARY = "Zephyr OpenAMP RPU firmware demo for the AMD ZCU106 evaluation kit"
DESCRIPTION = "Pre-built Cortex-R5 Zephyr OpenAMP firmware demo payload for the AMD ZCU106 evaluation kit."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu106-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09280533/external/openamp-zephyr-demo/zynqmp-zcu106-multidomain_openamp-zephyr-demo_09280533.tar.gz"
SRC_URI[sha256sum] = "3fef5f8fed9af060ab104bdfb1d3b7b416299f374ee91e2cf7592fedc3641161"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu106"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
