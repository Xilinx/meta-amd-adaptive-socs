# compatible = "xlnx,asu-microblaze_riscv";
TUNEVALID[rv32imac_zicsr_zifencei] = "Enable-march=rv32imac_zicsr_zifencei"
TUNE_CCARGS:append = "${@bb.utils.contains('TUNE_FEATURES', 'rv32imac_zicsr_zifencei', ' -march=rv32imac_zicsr_zifencei', ' ', d)}"
AVAILTUNES += "microblaze-riscv-asu"
TUNE_FEATURES:tune-microblaze-riscv-asu = "riscv32nf rv32imac_zicsr_zifencei"
TUNE_ARCH:tune-microblaze-riscv-asu = "riscv32"
TUNE_PKGARCH:tune-microblaze-riscv-asu = "riscv32nf"
PACKAGE_EXTRA_ARCHS:tune-microblaze-riscv-asu = "${TUNE_PKGARCH}"

require conf/machine/include/riscv/tune-riscv.inc
