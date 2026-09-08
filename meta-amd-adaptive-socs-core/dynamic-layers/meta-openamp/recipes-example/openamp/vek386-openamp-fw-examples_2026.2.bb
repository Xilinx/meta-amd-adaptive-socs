SUMMARY = "OpenAMP RPU firmware demo payloads (echo, matrix multiply, \
rpc_demo) for the AMD VEK386 board."
DESCRIPTION = "Pre-built Cortex-R5 OpenAMP firmware demo payloads \
(echo, matrix-multiply, rpc_demo) that the APU-side OpenAMP example \
applications load onto the RPU on the AMD VEK386 board."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${S}/versal-2ve-2vm-vek386-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09080452/external/openamp-zephyr-demo/versal-2ve-2vm-vek386-multidomain_openamp-zephyr-demo_09080452.tar.gz"
SRC_URI[sha256sum] = "6e915a9e511dc4bc20d2e005694dd23961ae1fc42418360283be8ac6e57be0d0"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa78-common = "${MACHINE}"
COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"

require conf/includes/openamp-fw-example.inc
OPENAMPFW_BOARD = "vek386"
