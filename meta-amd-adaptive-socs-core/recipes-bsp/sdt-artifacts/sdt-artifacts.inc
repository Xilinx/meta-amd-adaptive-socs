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

SDT_PROT[xlnx-versal-vek280-revb] = 'https://'
SDT_FILE_NAME[xlnx-versal-vek280-revb] = 'vek280_noAIE_SegConfig-vek280-sdtws-2024.2'
SDT_PATH[xlnx-versal-vek280-revb] = 'artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/misc/${SDT_VERSION}/${SDT_MACHINE}/${SDT_FILE_NAME}.tar.gz'
SDT_BRANCHARG[xlnx-versal-vek280-revb] = 'name=xlnx-versal-vek280-revb'
SRC_URI[xlnx-versal-vek280-revb.sha256sum] = '6b3d752a53bf39755b7a635a86107e85811664cc74a6d14995a2300cd1a4d3a9'

SDT_PROT[xlnx-versal-vek280-revb-ospi] = 'https://'
SDT_FILE_NAME[xlnx-versal-vek280-revb-ospi] = 'vek280_noAIE_SegConfig-vek280-sdtws-2024.2'
SDT_PATH[xlnx-versal-vek280-revb-ospi] = 'artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/misc/${SDT_VERSION}/xlnx-versal-vek280-revb/${SDT_FILE_NAME}.tar.gz'
SDT_BRANCHARG[xlnx-versal-vek280-revb-ospi] = 'name=xlnx-versal-vek280-revb'
SRC_URI[xlnx-versal-vek280-revb-ospi.sha256sum] = '6b3d752a53bf39755b7a635a86107e85811664cc74a6d14995a2300cd1a4d3a9'
