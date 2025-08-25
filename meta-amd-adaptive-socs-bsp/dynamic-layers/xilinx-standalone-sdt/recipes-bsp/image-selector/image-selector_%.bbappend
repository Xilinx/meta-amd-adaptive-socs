# This is a Workaround till CR-1247650 is fixed and will revert this as part of CR-1248113

do_configure:prepend:versal-vck190-sdt-seg() {
    sed -i 's|^//\(#define XIS_QSPI_FLSH\)|\1|' ${S}/../image-selector/src/common/xis_config.h
    sed -i 's|^\(#define XIS_OSPI_FLSH\)|//\1|' ${S}/../image-selector/src/common/xis_config.h
}
