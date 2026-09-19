SUMMARY = "OpenAMP RPU firmware demo payloads (echo, matrix multiply, \
rpc_demo) for the AMD Versal VPK360 board."
DESCRIPTION = "Pre-built Cortex-R5 OpenAMP firmware demo payloads \
(echo, matrix-multiply, rpc_demo) that the APU-side OpenAMP example \
applications load onto the RPU on the AMD Versal VPK360 board."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-2vp-vpk360-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/09190402/external/openamp-zephyr-demo/versal-2vp-vpk360-multidomain_openamp-zephyr-demo_09190402.tar.gz"
SRC_URI[sha256sum] = "336f0421fc544235b07b56fd851803b54f99fc479c804a6224c494af9b10e7b4"

OPENAMPFW_BOARD = "versal-vpk360"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
