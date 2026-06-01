APP = "libmetal-demo-remote"
FHW_DEPENDS = ""

PROC ?= ""
PROC:zynqmp = "cortexr5-1"
PROC:versal = "cortexr5-1"
PROC:versal-net = "cortexr52-1"
PROC:versal-2ve-2vm = "cortexr52-1"

FHW_MCDEPENDS = "mc::${MACHINE}-${PROC}-baremetal:${APP}:do_deploy"
# For multiconfig apps depends does not work and default for xilinx-bootbin depends got added
DEPENDS:remove = "${APP}"
do_compile[mcdepends] += "${FHW_MCDEPENDS}"
FHW_DEPLOY_DIR = "${TMPDIR}-${MACHINE}-${PROC}-baremetal/deploy/images/${MACHINE}"
BIF_PARTITION_ATTR:append = " ${APP}"

PARTITON_TARGET ?= ""
PARTITON_TARGET:zynqmp = "destination_cpu=r5-1"
PARTITON_TARGET:versal = "destination_cpu=r5-1"
PARTITON_TARGET:versal-net = "core=r52-1, cluster=0, tcmboot"
PARTITON_TARGET:versal-2ve-2vm = "core=r52-1, cluster=0, tcmboot"

BIF_PARTITION_ATTR[libmetal-demo-remote] = "${PARTITON_TARGET}"
BIF_PARTITION_IMAGE[libmetal-demo-remote] = "${FHW_DEPLOY_DIR}/irq_shmem_demo.elf"
BIF_PARTITION_ID[libmetal-demo-remote] = "0x1c000000"
