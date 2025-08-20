FILESEXTRAPATHS:prepend:versal-2ve-2vm-vek385-sdt-seg := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS:prepend:versal-2ve-2vm-vek385-revb-sdt-seg := "${THISDIR}/u-boot-xlnx:"

SRC_URI:append:versal-2ve-2vm-vek385-sdt-seg = "\
    file://u-boot-misc.cfg \
    "
SRC_URI:append:versal-2ve-2vm-vek385-revb-sdt-seg = "\
    file://u-boot-misc.cfg \
    "
