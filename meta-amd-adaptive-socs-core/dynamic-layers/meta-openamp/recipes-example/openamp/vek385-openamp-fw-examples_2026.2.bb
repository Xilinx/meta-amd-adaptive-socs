SUMMARY = "OpenAMP RPU firmware demo payloads (echo, matrix multiply, \
rpc_demo) for the AMD Versal Series Gen 2 VEK385 evaluation kit."
DESCRIPTION = "Pre-built Cortex-R52 OpenAMP firmware demo payloads \
(echo, matrix-multiply, rpc_demo) that the APU-side OpenAMP example \
applications load onto the RPU on the AMD Versal Series Gen 2 VEK385 \
evaluation kit."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-2ve-2vm-vek385-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10080546/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-multidomain_openamp-zephyr-demo_10080546.tar.gz"
SRC_URI[sha256sum] = "c9e1899930101e3d1850c42e24292594d3360d77589206bf35a47f8552c92408"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa78-common = "${MACHINE}"
COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"

OPENAMPFW_BOARD = "vek385"
require conf/includes/openamp-fw-example.inc
