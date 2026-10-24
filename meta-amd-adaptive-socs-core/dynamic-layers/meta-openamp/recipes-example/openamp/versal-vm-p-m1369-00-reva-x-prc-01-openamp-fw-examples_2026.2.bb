SUMMARY = "OpenAMP RPU firmware demo payloads (echo, matrix multiply, \
rpc_demo) for the AMD Versal VM-P-M1369-00 Rev A SOM on the X-PRC-01 \
carrier."
DESCRIPTION = "Pre-built Cortex-R5 OpenAMP firmware demo payloads \
(echo, matrix-multiply, rpc_demo) that the APU-side OpenAMP example \
applications load onto the RPU on the AMD Versal VM-P-M1369-00 Rev A \
SOM mounted on the X-PRC-01 carrier."

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/versal-vm-p-m1369-00-reva-x-prc-01-reva-multidomain_openamp-zephyr-demo/LICENSE.md;md5=0b96a4c07d631aa5141bd3f058ba43b0"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10240546/external/openamp-zephyr-demo/versal-vm-p-m1369-00-reva-x-prc-01-reva-multidomain_openamp-zephyr-demo_10240546.tar.gz"
SRC_URI[sha256sum] = "f35ee4162a765b66a1ffbc89b71e1f69bdbf9bccb8d11ab223707dcd99bcc72f"

OPENAMPFW_BOARD = "versal-vm-p-m1369-00-reva-x-prc-01"
OPENAMPFW_PKGDIR_SUFFIX = "openamp-zephyr-demo"
require conf/includes/openamp-fw-example.inc
