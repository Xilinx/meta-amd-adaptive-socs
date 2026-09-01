SCU200_KERNEL_PATCHES = " \
	file://0001-riscv-configs-amd-enable-dp83867.patch \
	file://0002-net-axienet-reset-core-before-64bit-dma.patch \
	file://0003-riscv-remove-coherent-dma-default.patch \
	file://0004-net-axienet-invalidate-bd-cache.patch \
"

FILESEXTRAPATHS:prepend:mbv64-scu200-sdt := "${THISDIR}/linux-xlnx:"
SRC_URI:append:mbv64-scu200-sdt = "${SCU200_KERNEL_PATCHES}"

FILESEXTRAPATHS:prepend:mbv64-scu200-revb-sdt := "${THISDIR}/linux-xlnx:"
SRC_URI:append:mbv64-scu200-revb-sdt = "${SCU200_KERNEL_PATCHES}"
