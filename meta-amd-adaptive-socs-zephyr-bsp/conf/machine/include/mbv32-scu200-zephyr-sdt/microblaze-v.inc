
require conf/machine/include/xilinx-microblaze-v.inc

# compatible = "xlnx,microblaze_v";
TUNE_FEATURES:tune-microblaze-v = "${@oe.tune.riscv_isa_to_tune("rv32imac_zicsr_zifencei_zicbom")}"
