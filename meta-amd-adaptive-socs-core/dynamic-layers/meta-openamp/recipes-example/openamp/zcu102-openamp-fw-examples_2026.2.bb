SUMMARY = "Zephyr OpenAMP RPU firmware demo for the AMD ZCU102 evaluation kit"
DESCRIPTION = "Pre-built Cortex-R5 Zephyr OpenAMP firmware demo payload for the AMD ZCU102 evaluation kit."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu102-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09060734/external/openamp-zephyr-demo/zynqmp-zcu102-multidomain_openamp-zephyr-demo_09060734.tar.gz"
SRC_URI[sha256sum] = "b08d5e43ad041f6b2d57f06905d363ad3b91f0540439c749a36ce2bc658ba664"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu102"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
