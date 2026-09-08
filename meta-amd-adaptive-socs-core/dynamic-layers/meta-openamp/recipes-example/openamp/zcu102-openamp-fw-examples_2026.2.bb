SUMMARY = "Zephyr OpenAMP RPU firmware demo for the AMD ZCU102 evaluation kit"
DESCRIPTION = "Pre-built Cortex-R5 Zephyr OpenAMP firmware demo payload for the AMD ZCU102 evaluation kit."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/zynqmp-zcu102-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09080452/external/openamp-zephyr-demo/zynqmp-zcu102-multidomain_openamp-zephyr-demo_09080452.tar.gz"
SRC_URI[sha256sum] = "157d6ad71b80517b1aba882e064332f97b3c4a52a9ebcfbeddddb2bea1f647f2"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "zcu102"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
