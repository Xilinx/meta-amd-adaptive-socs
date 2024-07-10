# meta-amd-adaptive-socs-core

This layer enables AMD Adaptive SoC's core features. This layer enables AMD adaptive
socs core metadata features such as recipes for cache output of system device tree
generator(sdtgen), system device tree files, boot pdi and common image features
etc.

## Dependencies

This layer depends on:

	URI: https://git.yoctoproject.org/poky
	layers: meta, meta-poky
	branch: langdale

	URI: https://git.openembedded.org/meta-openembedded
	layers: meta-oe, meta-python, meta-filesystems, meta-networking.
	branch: langdale

	URI:
        https://git.yoctoproject.org/meta-xilinx (official version)
        https://github.com/Xilinx/meta-xilinx (development and amd xilinx release)
	layers: meta-xilinx-core, meta-xilinx-standalone, meta-xilinx-standalone-sdt,
	        meta-microblaze.
	branch: langdale or amd xilinx release version (e.g. rel-v2024.1)

	URI: https://git.yoctoproject.org/meta-security
	layers: meta-tpm
	branch: langdale

	URI:
        https://git.yoctoproject.org/meta-virtualization (official version)
        https://github.com/Xilinx/meta-virtualization (development and amd xilinx release)
	branch: langdale or amd xilinx release version (e.g. rel-v2024.1)

	URI:
        https://github.com/OpenAMP/meta-openamp (official version)
        https://github.com/Xilinx/meta-openamp (development and amd xilinx release)
	branch: langdale or amd xilinx release version (e.g. rel-v2024.1)
---