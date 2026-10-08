SUMMARY = "OpenAMP RPU firmware demo payloads (echo, matrix multiply, \
rpc_demo) for the AMD Versal VPK360 board."
DESCRIPTION = "Pre-built Cortex-R5 OpenAMP firmware demo payloads \
(echo, matrix-multiply, rpc_demo) that the APU-side OpenAMP example \
applications load onto the RPU on the AMD Versal VPK360 board."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-2vp-vpk360-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10080546/external/openamp-zephyr-demo/versal-2vp-vpk360-multidomain_openamp-zephyr-demo_10080546.tar.gz"
SRC_URI[sha256sum] = "f88d41e07ac4c7c2d8da7bf3bd909741df5229e21f1745ec76133d0442ecbeb2"

OPENAMPFW_BOARD = "versal-vpk360"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
