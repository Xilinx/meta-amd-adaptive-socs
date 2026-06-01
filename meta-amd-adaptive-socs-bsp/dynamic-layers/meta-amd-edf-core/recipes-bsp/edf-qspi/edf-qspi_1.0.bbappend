COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"

# vck190 has smaller QSPI (128MB) - SPI_IMAGE_SIZE set in machine config
# Boot B offset is different due to smaller flash
SPI_BOOTBIN_OFFSET:versal-vck190-sdt-seg = "0x15C_0000 0x47C_0000"
SPI_USER_SCRATCH_OFFSET:versal-vck190-sdt-seg = "0x7A0_0000"
SPI_MANIFEST_OFFSET:versal-vck190-sdt-seg = "0x7FF_0000"
