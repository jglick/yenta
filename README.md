NetBeans module system hack allowing you to retroactively declare your module a “friend” of another module offering a restricted API.

# Usage

If using Maven, just add a dependency on `org.netbeans.contrib.yenta:api` to your module project (`nbm` packaging). If using Ant you will need to download the NBM from Maven Central and make an external cluster.

To activate Yenta, see the Javadoc for `org.netbeans.contrib.yenta.Yenta`.

# Background

For discussion of why this tool is necessary, see: [NBM Package Stability: Usage from external modules](http://wiki.netbeans.org/NbmPackageStability#Usage_from_external_modules)
