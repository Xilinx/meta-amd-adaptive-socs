# TEMPORARY WORKAROUND: Remove once the axienet DMA Rx error is root-caused.
FILESEXTRAPATHS:prepend:mbv64-scu200-revb-sdt := "${THISDIR}/${PN}:"
SRC_URI:append:mbv64-scu200-revb-sdt = " file://disable-axienet.cfg"
