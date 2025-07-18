#! /bin/bash -e

### The following table controls the automatic generated of the machine .conf files (lines start with #M#)
### Machine                 MULTICONFIGS  OVERLAY  DOMAIN   PRE   POST
#M# versal-vek280-sdt-seg   --add-config\ CONFIG_YOCTO_BBMC_CORTEXR5_0_FREERTOS=y        full     openamp-overlay-versal.yaml  none  QB_MEM = \"-m 12G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-versal-ps-vek280.dtb\"\\nQEMU_HW_DTB_PMC = \"${QEMU_HW_DTB_PATH}/board-versal-pmc-virt.dtb\"\\nQEMU_HW_BOOT_MODE ?= \"5\"\\nQEMU_FLASH_TYPE ?= \"ospi\"\\nQEMU_HW_SD_FILE ?= \"qemu-ospi-${MACHINE}.bin\"\\nQB_OPT_APPEND:append := \" -drive file=@DEPLOY_DIR_IMAGE@/${QEMU_HW_SD_FILE},if=mtd,format=raw,index=4\"\\n
#M# zynqmp-zcu104-sdt-full  default       full     default  none  QB_MEM = \"-m 4G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-zynqmp-zcu104.dtb\"\\nQEMU_HW_DTB_PMU = \"${QEMU_HW_DTB_PATH}/zynqmp-pmu.dtb\"\\n
#M# zynqmp-zcu111-sdt-full  default       full     default  none  QB_MEM = \"-m 4G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-zynqmp-zcu102.dtb\"\\nQEMU_HW_DTB_PMU = \"${QEMU_HW_DTB_PATH}/zynqmp-pmu.dtb\"\\n
#M# versal-vck190-sdt-seg   --add-config\ CONFIG_YOCTO_BBMC_CORTEXR5_0_FREERTOS=y        full     openamp-overlay-versal.yaml  none  QB_MEM = \"-m 8G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-versal-ps-vck190.dtb\"\\nQEMU_HW_DTB_PMC = \"${QEMU_HW_DTB_PATH}/board-versal-pmc-virt.dtb\"\\nQB_ROOTFS_OPT = \"-drive \if=sd\\,\index=1\\,\file=@ROOTFS@\\,\format=raw\"\\n
#M# versal-l20-sdt-seg      default       full     default  none  QB_MEM = \"-m 8G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-versal-ps-vm-p-m1369-00.dtb\"\\nQEMU_HW_DTB_PMC = \"${QEMU_HW_DTB_PATH}/board-versal-pmc-virt.dtb\"\\nQB_ROOTFS_OPT = \"-drive \if=sd\\,\index=1\\,\file=@ROOTFS@\\,\format=raw\"\\n
#M# versal-v80-sdt-seg      default       full     default  none  QB_MEM = \"-m 8G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-versal-ps-v80.dtb\"\\nQEMU_HW_DTB_PMC = \"${QEMU_HW_DTB_PATH}/board-versal-pmc-virt.dtb\"\\nQEMU_HW_BOOT_MODE = \"8"\\nQEMU_HW_OSPI_FILE = \"qemu-ospi-${MACHINE}.bin\"\\nQB_OPT_APPEND:append := \" -drive file=@DEPLOY_DIR_IMAGE@/\${QEMU_HW_OSPI_FILE}\\,\if=mtd\\,\format=raw\\,\index=4\"\\nQB_ROOTFS_OPT = \"-drive \if=sd\\,\index=2\\,\file=@ROOTFS@\\,\format=raw\"\\n
#M# versal-2ve-2vm-vek385-sdt-seg --add-config\ CONFIG_YOCTO_BBMC_CORTEXR52_1_BAREMETAL=y\ --add-config\ CONFIG_YOCTO_BBMC_MICROBLAZE_RISCV_ASU=disable   full    default   none    QEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-versal2-psxc-vek385.dtb\"\\nQEMU_HW_BOOT_MODE = \"8"\\nQEMU_HW_SERIAL = \"-serial null -serial null -serial null -serial mon:stdio\"\\nQEMU_HW_OSPI_FILE = \"qemu-ospi-${MACHINE}.bin\"\\nQB_OPT_APPEND:append := \" -drive file=@DEPLOY_DIR_IMAGE@/\${QEMU_HW_OSPI_FILE}\\,\if=mtd\\,\format=raw\\,\index=0\"\\nQB_DEFAULT_FSTYPE = \"wic.ufs\"\\nQB_ROOTFS_OPT = \"-device scsi-hd\\,drive=d1\\,bus=scsi.0\\,channel=0\\,scsi-id=0\\,lun=0\\,logical_block_size=4096\\,physical_block_size=4096 -drive file=@ROOTFS@\\,if=none\\,id=d1\\,format=raw\"
#M# zynq-zc702-sdt-full     default       full     default  none  QB_MEM = \"-m 1024\"\\nQEMU_HW_SERIAL = \"-serial null -serial mon:stdio\"\\n
#M# zynqmp-zcu106-sdt-full  default       full     default  none  QB_MEM = \"-m 4G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-zynqmp-zcu102.dtb\"\\nQEMU_HW_DTB_PMU = \"${QEMU_HW_DTB_PATH}/zynqmp-pmu.dtb\"\\n

this=$(realpath $0)

if [ $# -lt 2 ]; then
  echo "$0: <conf_path> <machine_url_index> [machine]" >&2
  exit 1
fi

gmc=`which gen-machineconf`
if [ -z "${gmc}" ]; then
  echo "ERROR: This script must be run in a configured Yocto Project build with gen-machineconf in the environment." >&2
  exit 1
fi

conf_path=$(realpath $1)
if [ ! -d ${conf_path} ]; then
  mkdir -p ${conf_path}
fi


mach_index=$(realpath $2)
count=0
while read mach_id mach_url; do
  if [ ${mach_id} = '#' ]; then
      continue
  fi

  MACHINE_ID[$count]=${mach_id}
  MACHINE_URL[$count]=${mach_url}

  count=$(expr $count + 1)
done < ${mach_index}


# Load in the arrays from this script
count=0
while read marker machine multiconfigs overlay domain pre post ; do
  if [ "${marker}" != "#M#" ]; then
      continue
  fi

  # machines
  MACHINES[$count]=${machine}

  # multiconfigs
  if [ "$multiconfigs" = "full" ]; then
    multiconfigs=" --multiconfigfull "
  elif [ "$multiconfigs" = "default" ]; then
    multiconfigs=""
  fi
  MULTICONFIGS[$count]=${multiconfigs}

  # overlays
  if [ "$overlay" = "full" ]; then
    overlay=" -g full "
  else
    overlay=""
  fi
  OVERLAYS[$count]=${overlay}

  # domains
  if [ "$domain" = "default" ]; then
    domain=""
  else
    dir=$(dirname $this)
    domain=" --domain-file ${dir}/${domain} "
  fi
  DOMAINS[$count]=${domain}

  # URLs
  for mach in ${!MACHINE_ID[@]}; do
    if [ ${MACHINE_ID[${mach}]} = ${machine} ]; then
      URLS[$count]=${MACHINE_URL[${mach}]}
      break
    fi
  done
  if [ -z "${URLS[$count]}" ]; then
    echo "ERROR: Unable to find ${machine} in ${mach_index}" >&2
    exit 1
  fi

  # pre
  if [ "$pre" = "none" ]; then
    pre=
  fi
  PRE[$count]=${pre}

  # post
  POST[$count]=${post}

  count=$(expr $count + 1)
done < ${this}


for mach in ${!MACHINES[@]}; do
  if [ -n "$3" -a "$3" != "${MACHINES[${mach}]}" ]; then
    continue
  fi

  echo "Machine:      ${MACHINES[${mach}]}"
  echo "Multiconfigs: ${MULTICONFIGS[${mach}]}"
  echo "Overlay:      ${OVERLAYS[${mach}]}"
  echo "Domain:       ${DOMAINS[${mach}]}"
  echo "URL:          ${URLS[${mach}]}"
  echo "Pre:          ${PRE[${mach}]}"
  echo "Post:         ${POST[${mach}]}"
  echo

  if [ ${MACHINES[${mach}]} = "versal-2ve-2vm-vek385-sdt-seg" ]; then
    add_args="--add-config CONFIG_SUBSYSTEM_TF-A_SERIAL_SERIAL1_SELECT=y \
     --add-config CONFIG_SUBSYSTEM_SERIAL_TF-A_IP_NAME="pl011_1" \
     --add-config CONFIG_SUBSYSTEM_OP-TEE_SERIAL_SERIAL1_SELECT=y \
     --add-config CONFIG_SUBSYSTEM_SERIAL_OP-TEE_IP_NAME="1" \
     --add-config CONFIG_SUBSYSTEM_OPTEE=y \
     --add-config CONFIG_SUBSYSTEM_TF-A_MEMORY_SETTINGS=y \
     --add-config CONFIG_SUBSYSTEM_TF-A_MEM_BASE=0x1600000 \
     --add-config CONFIG_SUBSYSTEM_TF-A_MEM_SIZE=0x200000 \
     --add-config CONFIG_SUBSYSTEM_UBOOT_APPEND_BASEADDR=disable \
     "
  else
    add_args=""
  fi

  set -x
  rm -rf output
  gen-machineconf parse-sdt --hw-description ${URLS[${mach}]} -c ${conf_path} --machine-name ${MACHINES[${mach}]} ${MULTICONFIGS[${mach}]} ${OVERLAYS[${mach}]} ${DOMAINS[${mach}]} ${add_args}
  set +x

  ######### Post gen-machineconf changes
  #
  if [ -n "${PRE[${mach}]}" ]; then
    sed -i ${conf_path}/machine/${MACHINES[${mach}]}.conf -e 's!\(# Required generic machine inclusion\)!'"${PRE[${mach}]}"'\n\1!'
  fi

  if [ -n "${POST[${mach}]}" ]; then
    sed -i ${conf_path}/machine/${MACHINES[${mach}]}.conf -e 's!\(^require conf/machine/.*\.conf\)!\1\n\n'"${POST[${mach}]}"'!'
  fi

  # Manipulate configuration variables
  case ${MACHINES[${mach}]} in
    versal-2ve-2vm-vek385-sdt-seg)
      sed -i ${conf_path}/machine/${MACHINES[${mach}]}.conf \
        -e 's,UBOOT_ENTRYPOINT  ?= "0x200000",UBOOT_ENTRYPOINT  ?= "0x20200000",' \
        -e 's,UBOOT_LOADADDRESS ?= "0x200000",UBOOT_LOADADDRESS ?= "0x20200000",' \
      ;;
  esac
done
