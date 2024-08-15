# Build Instructions

This section describes how to get your build host ready to work with meta-amd-adaptive-socs
layers.

The following instructions require OE-Core meta and BitBake. Poky provides these
components, however they can be acquired separately.

> **Pre-requisites:** See [Preparing Build Host](https://docs.yoctoproject.org/5.0.1/singleindex.html#preparing-the-build-host) documentation.

1. Follow [Building Instructions](https://github.com/Xilinx/meta-xilinx/blob/master/README.building.md)
   upto step 2.

2. Clone meta-amd-adaptive-socs and dependency repository.
```
$ git clone -b <rel-version> https://github.com/Xilinx/meta-openamp
$ git clone -b <rel-version> https://gitenterprise.xilinx.com/Yocto/meta-amd-adaptive-socs
```

3. Initialize a build environment using the `oe-init-build-env` script. 
```
$ source ./<path-to-layer>/poky/oe-init-build-env
```

4. Once initialized configure `bblayers.conf` by adding dependency layers as shown
   below using `bitbake-layers` command.
> **Note:** From step 3 by default `meta-yocto-bsp` will be included in bblayers.conf
> file and this can be removed using `$ bitbake-layers remove-layer meta-yocto-bsp`
> command.
```
$ bitbake-layers add-layer ./<path-to-layer>/meta-openembedded/meta-oe
$ bitbake-layers add-layer ./<path-to-layer>/meta-openembedded/meta-python
$ bitbake-layers add-layer ./<path-to-layer>/meta-openembedded/meta-filesystems
$ bitbake-layers add-layer ./<path-to-layer>/meta-openembedded/meta-networking
$ bitbake-layers add-layer ./<path-to-layer>/meta-virtualization
$ bitbake-layers add-layer ./<path-to-layer>/meta-xilinx/meta-xilinx-core
$ bitbake-layers add-layer ./<path-to-layer>/meta-xilinx/meta-xilinx-standalone
$ bitbake-layers add-layer ./<path-to-layer>/meta-xilinx/meta-xilinx-standalone-sdt
$ bitbake-layers add-layer ./<path-to-layer>/meta-xilinx/meta-microblaze
$ bitbake-layers add-layer ./<path-to-layer>/meta-amd-adaptive-socs/meta-amd-adaptive-socs-core
$ bitbake-layers add-layer ./<path-to-layer>/meta-amd-adaptive-socs/meta-amd-adaptive-socs-bsp
```

5. Set hardware `MACHINE` configuration variable in build/conf/local.conf
   file for a specific target which can boot and run the in the board or QEMU.
```
MACHINE = "<target_machine_name>"
```
* For list of available target machines see meta layer conf/machine/*.conf file.

 * [meta-amd-adaptive-socs-bsp machine conf file](meta-amd-adaptive-socs-bsp/conf/machine)

6. Continue [Building Instructions](https://github.com/Xilinx/meta-xilinx/blob/master/README.building.md)
   from step 6.
