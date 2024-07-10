#
# Copyright (C) 2024, Advanced Micro Devices, Inc.  All rights reserved.
#
# SPDX-License-Identifier: MIT
#

SDT_PROT_DEFAULT := '${SDT_PROT}'
SDT_PATH_DEFAULT := '${SDT_PATH}'
SDT_FILE_DEFAULT := '${SDT_FILE_NAME}'
SDT_BRANCHARG_DEFAULT := '${SDT_BRANCHARG}'
SDT_PROT ??= "${@d.getVarFlag('SDT_PROT', d.getVar('SDT_MACHINE')) or '${SDT_PROT_DEFAULT}'}"
SDT_PATH ??= "${@d.getVarFlag('SDT_PATH', d.getVar('SDT_MACHINE')) or '${SDT_PATH_DEFAULT}'}"
SDT_FILE_NAME ??= "${@d.getVarFlag('SDT_FILE_NAME', d.getVar('SDT_MACHINE')) or '${SDT_PATH_DEFAULT}'}"
SDT_BRANCHARG ??= "${@d.getVarFlag('SDT_BRANCHARG', d.getVar('SDT_MACHINE')) or '${SDT_BRANCHARG_DEFAULT}'}"

VALIDATE_SDT_CHECKSUM ?= '1'
VALIDATE_SDT_CHECKSUM[doc] = "Ignore the checksum when set to 0"

SDT_PROT[versal-vek280-sdt-seg] = 'https://'
SDT_FILE_NAME[versal-vek280-sdt-seg] = 'vek280_pl_bram_uart_gpio-vek280-sdtws-2024.2'
SDT_PATH[versal-vek280-sdt-seg] = 'artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/misc/${SDT_VERSION}/${SDT_MACHINE}/${SDT_FILE_NAME}.tar.gz'
SDT_BRANCHARG[versal-vek280-sdt-seg] = 'name=versal-vek280-sdt-seg'
SRC_URI[versal-vek280-sdt-seg.sha256sum] = '83deb84f67b7fdc5936f4c0c298ab4a33edd9c9d6bfc2c87c2df9452e32faa7f'

SDT_PROT[versal-vek280-sdt-seg-ospi] = 'https://'
SDT_FILE_NAME[versal-vek280-sdt-seg-ospi] = 'vek280_pl_bram_uart_gpio-vek280-sdtws-2024.2'
SDT_PATH[versal-vek280-sdt-seg-ospi] = 'artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/misc/${SDT_VERSION}/versal-vek280-sdt-seg/${SDT_FILE_NAME}.tar.gz'
SDT_BRANCHARG[versal-vek280-sdt-seg-ospi] = 'name=versal-vek280-sdt-seg'
SRC_URI[versal-vek280-sdt-seg-ospi.sha256sum] = '83deb84f67b7fdc5936f4c0c298ab4a33edd9c9d6bfc2c87c2df9452e32faa7f'
