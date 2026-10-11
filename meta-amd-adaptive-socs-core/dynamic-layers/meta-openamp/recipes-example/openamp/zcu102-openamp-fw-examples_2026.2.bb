SUMMARY = "Zephyr OpenAMP RPU firmware demo for the AMD ZCU102 evaluation kit"
DESCRIPTION = "Pre-built Cortex-R5 Zephyr OpenAMP firmware demo payload for the AMD ZCU102 evaluation kit."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu102-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10110607/external/openamp-zephyr-demo/zynqmp-zcu102-multidomain_openamp-zephyr-demo_10110607.tar.gz"
SRC_URI[sha256sum] = "8e0a42867da5f77a7d0f5ca92bb1a5b82aac01db2369627d6dc5243ecee89fde"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu102"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
