BOOTBIN_INC ?= ""
BOOTBIN_INC:versal-vrk160-sdt-seg = "versal-hello-world.inc"
BOOTBIN_INC:versal-vrk165-sdt-seg = "versal-hello-world.inc"
BOOTBIN_INC:emb-plus-ve2302-amr = "versal-hello-world.inc"
BOOTBIN_INC:versal-2ve-2vm-vek385-sdt-seg = "versal-2ve-2vm-hello-world-r52-1-baremetal.inc"
BOOTBIN_INC:versal-2ve-2vm-vek385-revb-sdt-seg = "versal-2ve-2vm-hello-world-r52-1-baremetal.inc"

include ${@d.getVar('BOOTBIN_INC') if d.getVar('BB_CURRENT_MC') != 'xilinx-image-recovery' else ''}
