SUMMARY = "VEK280 SDT Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = " \
	file://${BSPLAYERDIR_amd-vek280-versal-sdt}/sdtgen/vek280_noAIE_SegConfig-vek280-sdtws-2024.1/vek280_noAIE_SegConfig_pld.pdi \
	file://${BSPLAYERDIR_amd-vek280-versal-sdt}/conf/dts/xlnx-versal-vek280-revb/pl-overlay-full/pl.dtsi \
	"

COMPATIBLE_MACHINE:versal = "versal"

# CR-1196945 - 2024.1 dfx_user_dts workaround
# Due to bug in dfx_user_dts bbclass it failes to install PDI file if absolute
# path PDI is used as input to firmware recipe SRC_URI
do_install:append() {
	if [ -f ${BSPLAYERDIR_amd-vek280-versal-sdt}/sdtgen/vek280_noAIE_SegConfig-vek280-sdtws-2024.1/vek280_noAIE_SegConfig_pld.pdi ]; then
        install -Dm 0644 ${BSPLAYERDIR_amd-vek280-versal-sdt}/sdtgen/vek280_noAIE_SegConfig-vek280-sdtws-2024.1/vek280_noAIE_SegConfig_pld.pdi ${D}/${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.pdi
    else
        bbnote "A PDI file with '.pdi' expected but not found"
    fi
}