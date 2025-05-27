#! /bin/bash -e

### The following table controls the automatic generated of the machine .conf files (lines start with #M#)
### Machine                 MULTICONFIGS  OVERLAY  DOMAIN   PRE   POST
#M# versal-vek280-sdt-seg   default       full     default  none  QB_MEM = \"-m 12G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-versal-ps-vek280.dtb\"\\nQEMU_HW_DTB_PMC = \"${QEMU_HW_DTB_PATH}/board-versal-pmc-virt.dtb\"\\n
#M# zynqmp-zcu104-sdt-full  default       full     default  none  QB_MEM = \"-m 4G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-zynqmp-zcu104.dtb\"\\nQEMU_HW_DTB_PMU = \"${QEMU_HW_DTB_PATH}/zynqmp-pmu.dtb\"\\n
#M# zynqmp-zcu111-sdt-full  default       full     default  none  QB_MEM = \"-m 4G\"\\nQEMU_HW_DTB_PS = \"\${QEMU_HW_DTB_PATH}/board-zynqmp-zcu102.dtb\"\\nQEMU_HW_DTB_PMU = \"${QEMU_HW_DTB_PATH}/zynqmp-pmu.dtb\"\\n

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
    domain=" --domain-file ${domain} "
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

  set -x
  rm -rf output
  gen-machineconf parse-sdt --hw-description ${URLS[${mach}]} -c ${conf_path} --machine-name ${MACHINES[${mach}]} ${MULTICONFIGS[${mach}]} ${OVERLAYS[${mach}]} ${DOMAINS[${mach}]}
  set +x

  ######### Post gen-machineconf changes
  #
  if [ -n "${PRE[${mach}]}" ]; then
    sed -i ${conf_path}/machine/${MACHINES[${mach}]}.conf -e 's!\(# Required generic machine inclusion\)!'"${PRE[${mach}]}"'\n\1!'
  fi

  if [ -n "${POST[${mach}]}" ]; then
    sed -i ${conf_path}/machine/${MACHINES[${mach}]}.conf -e 's!\(^require conf/machine/.*\.conf\)!\1\n\n'"${POST[${mach}]}"'!'
  fi
done
