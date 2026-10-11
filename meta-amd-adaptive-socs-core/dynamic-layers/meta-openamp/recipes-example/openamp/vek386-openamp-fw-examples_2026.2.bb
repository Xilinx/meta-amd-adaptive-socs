SUMMARY = "OpenAMP RPU firmware demo payloads (echo, matrix multiply, \
rpc_demo) for the AMD VEK386 board."
DESCRIPTION = "Pre-built Cortex-R5 OpenAMP firmware demo payloads \
(echo, matrix-multiply, rpc_demo) that the APU-side OpenAMP example \
applications load onto the RPU on the AMD VEK386 board."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${S}/versal-2ve-2vm-vek386-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10110607/external/openamp-zephyr-demo/versal-2ve-2vm-vek386-multidomain_openamp-zephyr-demo_10110607.tar.gz"
SRC_URI[sha256sum] = "861f4cbc438ac7ffab40a71917092d2591be4e0f385c93dfc0415db198fdcdd8"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa78-common = "${MACHINE}"
COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"

require conf/includes/openamp-fw-example.inc
OPENAMPFW_BOARD = "vek386"
