FILESEXTRAPATHS:prepend:versal-2ve-2vm-vek385-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-2ve-2vm-vek385-revb-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:zynq-zc702-sdt-full := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:zynq-zc706-sdt-full := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:microblaze-v := "${THISDIR}/u-boot-xlnx:"

SRC_URI:append:versal-2ve-2vm-vek385-sdt-seg = "\
    file://u-boot-misc.cfg \
    "
SRC_URI:append:versal-2ve-2vm-vek385-revb-sdt-seg = "\
    file://u-boot-misc.cfg \
    "
SRC_URI:append:zynq-zc702-sdt-full = "\
    file://u-boot-misc_zynq.cfg \
    "
SRC_URI:append:zynq-zc706-sdt-full = "\
    file://u-boot-misc_zynq.cfg \
    "
SRC_URI:append:microblaze-v = "\
    file://u-boot-misc_mbv64.cfg \
    "
