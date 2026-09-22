SUMMARY = "OpenAMP RPU firmware demo payloads (echo, matrix multiply, \
rpc_demo) for the AMD Versal Series Gen 2 VEK385 (Rev B) evaluation \
kit."
DESCRIPTION = "Pre-built Cortex-R52 OpenAMP firmware demo payloads \
(echo, matrix-multiply, rpc_demo) that the APU-side OpenAMP example \
applications load onto the RPU on the AMD Versal Series Gen 2 VEK385 \
(Rev B) evaluation kit."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09220532/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_09220532.tar.gz"
SRC_URI[sha256sum] = "d5f44991e126d569d677dff61a565d6f0f0b2b78401cbe7def12dbcabd20b85c"

COMPATIBLE_MACHINE = "^$"                                                          
COMPATIBLE_MACHINE:amd-cortexa78-common = "${MACHINE}"
COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
