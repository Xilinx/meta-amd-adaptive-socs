SUMMARY = "Zephyr OpenAMP RPU firmware demo for the AMD Versal Gen 2 VMK365 evaluation kit"
DESCRIPTION = "Pre-built Cortex-R52 Zephyr OpenAMP firmware demo payload for the AMD Versal Gen 2 VMK365 evaluation kit."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-2ve-2vm-vmk365-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/11040130/external/openamp-zephyr-demo/versal-2ve-2vm-vmk365-multidomain_openamp-zephyr-demo_11040130.tar.gz"
SRC_URI[sha256sum] = "c5e14b356e73f185a587c9aee13bd4882a73e96afe0704c6f36bb2114f2902f7"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa78-common = "${MACHINE}"
COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "vmk365"
require conf/includes/openamp-fw-example.inc
