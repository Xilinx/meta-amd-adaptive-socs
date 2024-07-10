# meta-amd-adaptive-socs

Collection of layers to enable AMD Apdative SoC's bsp cache metadata.

> **See:** AMD Xilinx devices:
	https://www.xilinx.com/products/silicon-devices.html

Please see the respective READMEs and docs in the layer subdirectories.

## Maintainers, Mailing list, Patches

Please send any patches, pull requests, comments or questions for this layer to
the [meta-xilinx mailing list](https://lists.yoctoproject.org/g/meta-xilinx)
with ['meta-amd-adaptive-socs'] in the subject:

	meta-xilinx@lists.yoctoproject.org

When sending patches, please make sure the email subject line includes
`[meta-amd-adaptive-socs][<BRANCH_NAME>][PATCH]` and cc'ing the maintainers.

For more details follow the OE community patch submission guidelines, as described in:

https://www.openembedded.org/wiki/Commit_Patch_Message_Guidelines
https://www.openembedded.org/wiki/How_to_submit_a_patch_to_OpenEmbedded

`git send-email --to meta-xilinx@lists.yoctoproject.org *.patch`

> **Note:** When creating patches, please use below format. To follow best practice,
> if you have more than one patch use `--cover-letter` option while generating the
> patches. Edit the 0000-cover-letter.patch and change the title and top of the
> body as appropriate.

**Syntax:**
`git format-patch -s --subject-prefix="meta-amd-adaptive-socs][<BRANCH_NAME>][PATCH" -1`

**Example:**
`git format-patch -s --subject-prefix="meta-amd-adaptive-socs][langdale][PATCH" -1`

**Maintainers:**

	Mark Hatle <mark.hatle@amd.com>
	Sandeep Gundlupet Raju <sandeep.gundlupet-raju@amd.com>
	John Toomey <john.toomey@amd.com>
    Trevor Woerner <trevor.woerner@amd.com>
---

## Additional Documentation

* [Building Instructions](README.build.md)
* [AMD Xilinx Yocto layers](https://github.com/Xilinx/meta-xilinx/blob/master/README.md)
