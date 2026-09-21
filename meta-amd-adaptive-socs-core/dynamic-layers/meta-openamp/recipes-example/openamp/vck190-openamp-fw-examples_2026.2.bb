SUMMARY = "OpenAMP RPU firmware demo payloads (echo, matrix multiply, \
rpc_demo) for the AMD Versal AI Core VCK190 evaluation kit."
DESCRIPTION = "Pre-built Cortex-R5 OpenAMP firmware demo payloads \
(echo, matrix-multiply, rpc_demo) that the APU-side OpenAMP example \
applications load onto the RPU on the AMD Versal AI Core VCK190 \
evaluation kit."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-vck190-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09210704/external/openamp-zephyr-demo/versal-vck190-multidomain_openamp-zephyr-demo_09210704.tar.gz"

SRC_URI[sha256sum] = "7a2e1a5022c1ec45d97cf957a549c3acd4d9f8cf8298c811dfd331af6d5451ff"

OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
