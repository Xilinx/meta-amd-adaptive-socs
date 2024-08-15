# meta-amd-adaptive-socs-bsp

This layer enables AMD Adaptive SoC's bsp features such as evaluation board
system device tree build metadata such as machine configurations files, multiconfig
files, system device tree files, boot pdi, kernel configuration fragments, series
configuration compiler(.scc) files etc. This layer also supports to enable Xen
hypervisor.

---

## AMD Adaptive SoC's Evaluation Boards SDT BSP Machines files

The following boards are supported by the meta-amd-adaptive-socs-bsp layer:

> **SDT BSP Machine nomenclature:**
>
> 1. Machine Configuration file nomenclature: `<soc-family>-<eval-board-name>-sdt-<design-name>`
> * Example: `MACHINE = "versal-vek280-sdt-seg"`
>
> 2. BSP Reference design name:
> * `full` - ZynqMP full bitstream loading Vivado design.
> * `seg` - Versal Segmented Configuration Vivado design.
>
> **Note:** In machine file nomencalutre `<soc-family>-<eval-board-name>-sdt-<design-name>`
> If design-name suffix is not set or defined then it is treated as flat design
> without dynamic PL configuration.

| Devices | Evaluation Board  | Machine Configuration file | Reference Design | QEMU tested | HW tested |
|---------|-------------------|----------------------------|------------------|-------------|-----------|
| ZynqMP  | [ZCU104](https://www.xilinx.com/products/boards-and-kits/zcu104.html) | [zynqmp-zcu104-sdt-full](conf/machine/zynqmp-zcu104-sdt-full.conf) | `full`| Yes | Yes |
| Versal  | [VEK280](https://www.xilinx.com/products/boards-and-kits/vek280.html) | [versal-vek280-sdt-seg](conf/machine/versal-vek280-sdt-seg.conf)   | `seg` | Yes | Yes |


> **Note:** Additional information on Xilinx architectures can be found at:
	https://www.xilinx.com/products/silicon-devices.html
---

## Dependencies

This layer depends on:

	URI: https://git.yoctoproject.org/poky
	layers: meta, meta-poky
	branch: scarthgap

	URI: https://git.openembedded.org/meta-openembedded
	layers: meta-oe, meta-python, meta-filesystems, meta-networking.
	branch: scarthgap

	URI:
        https://git.yoctoproject.org/meta-xilinx (official version)
        https://github.com/Xilinx/meta-xilinx (development and amd xilinx release)
	layers: meta-xilinx-core, meta-xilinx-standalone, meta-xilinx-standalone-sdt,
	        meta-microblaze.
	branch: scarthgap or amd xilinx release version (e.g. rel-v2024.2)

	URI: https://git.yoctoproject.org/meta-security
	layers: meta-tpm
	branch: scarthgap

	URI:
        https://git.yoctoproject.org/meta-virtualization (official version)
        https://github.com/Xilinx/meta-virtualization (development and amd xilinx release)
	branch: scarthgap or amd xilinx release version (e.g. rel-v2024.2)

	URI:
        https://github.com/OpenAMP/meta-openamp (official version)
        https://github.com/Xilinx/meta-openamp (development and amd xilinx release)
	branch: scarthgap or amd xilinx release version (e.g. rel-v2024.2)

	URI:
        https://github.com/Xilinx/meta-amd-adaptive-socs (development and amd xilinx release)
	layers: meta-amd-adaptive-socs-core
	branch: scarthgap or amd xilinx release version (e.g. rel-v2024.2)
---
