#ifndef __CONFIG_EDF_VERSAL_H
#define __CONFIG_EDF_VERSAL_H

#include <configs/xilinx_versal.h>
#include <configs/amd_edf_common.h>

#define ENV_MEM_LAYOUT_SETTINGS \
    "fdt_addr_r=0x1000\0" \
    "fdt_size_r=0x400000\0" \
    "pxefile_addr_r=0x10000000\0" \
    "kernel_addr_r=0x200000\0" \
    "kernel_size_r=0x10000000\0" \
    "kernel_comp_addr_r=0x30000000\0" \
    "kernel_comp_size=0x3C00000\0" \
    "ramdisk_addr_r=0x02100000\0" \
    "script_size_f=0x80000\0"

/* Initial environment variables */
#undef CFG_EXTRA_ENV_SETTINGS
#define CFG_EXTRA_ENV_SETTINGS \
    ENV_MEM_LAYOUT_SETTINGS \
    ENV_EDF_SETTINGS \
    BOOTENV

/* Define image type guid, this should match with the capsule-metadata recipe value*/
#define XILINX_BOOT_IMAGE_GUID \
	EFI_GUID(0xf1c0d5e8, 0x7a23, 0x4b91, 0xb0, 0xf8, \
		 0x3e, 0x5c, 0x6a, 0x2d, 0x97, 0xf3)
#endif /* __CONFIG_EDF_VERSAL_H */
