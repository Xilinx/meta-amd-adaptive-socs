# meta-amd-adaptive-socs-core

This layer enables AMD Adaptive SoC's core features. This layer enables AMD adaptive
socs core metadata features such as recipes for cache output of system device tree
generator(sdtgen), system device tree files, boot pdi and common image features
etc.

This layer provides components that are optional, not required to boot, for a
BSP.  Most of the items in this repository will consist of examples of some
type, including loadable firmware files.

## Dependencies

This layer depends on:

	URI: https://git.openembedded.org/openembedded-core
	layers: meta
	branch: wrynose

	URI:
        https://git.yoctoproject.org/meta-xilinx (official version)
        https://github.com/Xilinx/meta-xilinx (development and AMD release)
	layers: meta-xilinx-core.
	branch: wrynose or AMD release version (e.g. rel-v2026.2)

	URI:
        https://github.com/OpenAMP/meta-openamp (official version)
        https://github.com/Xilinx/meta-openamp (development and AMD release)
	branch: wrynose or AMD release version (e.g. rel-v2026.2)

	URI: https://git.yoctoproject.org/meta-arm
	layers: meta-arm, meta-arm-toolchain
	branch: wrynose

## Note: 

* **dynamic-layers vs. LAYERRECOMMENDS**

`conf/layer.conf` in this layer defines one or more `BBFILES_DYNAMIC` entries
of the form `<collection>:<path>/*.bb(append)`. Each entry only takes effect
if `<collection>` is already enabled in the current build (i.e. some other
layer providing that BitBake collection is present in `bblayers.conf`); if it
isn't, the corresponding recipes/bbappends under that path are silently
skipped.

Not every `<collection>` referenced this way is also listed in
`LAYERDEPENDS`/`LAYERRECOMMENDS` for this layer. A `LAYERDEPENDS` entry means
the collection is required for this layer to parse; a `LAYERRECOMMENDS` entry
is a soft suggestion that `bitbake-layers` will offer to add automatically.
Some `BBFILES_DYNAMIC` hooks are neither: this layer will opportunistically
augment its recipes with extra content *if* the collection happens to
already be part of the build, but it does not require, and does not
recommend, adding that collection just to satisfy the hook. There is no
formal BitBake term for this "augment-if-present, don't-recommend"
relationship, so it is called out here to avoid confusion when auditing
`LAYERDEPENDS`/`LAYERRECOMMENDS` completeness against `BBFILES_DYNAMIC`.

Currently, the `dynamic-layers/meta-openamp` hook in this layer's `conf/layer.conf` reacts to the `openamp-layer` collection, which is also covered by `LAYERRECOMMENDS`.
