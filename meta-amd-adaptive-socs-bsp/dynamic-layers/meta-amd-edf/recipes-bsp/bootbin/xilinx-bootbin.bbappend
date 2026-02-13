BOOTBIN_INC ?= ""

include ${@d.getVar('BOOTBIN_INC') if d.getVar('BB_CURRENT_MC') != 'xilinx-image-recovery' else ''}
