
# compatible = "xlnx,microblaze_v";
TUNE_FEATURES:tune-microblaze-v = "${@oe.tune.riscv_isa_to_tune("rv64imafdcb_zicsr_zifencei_zbc_zicbom")}"
