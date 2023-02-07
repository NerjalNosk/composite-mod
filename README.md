# Multi Mod Template

This is an example for a multi-mod builder.

It allows for you to make a mod, with multiple nested mods,
all built separately and nested in the main mod's file.

## builds locations

The main mod's build directory is the default `build/` folder,
while the submods will all be built in the `builds/` folder, then
sorted by name.

---

## How to build

### Subproject requirements

All subproject needs to be added in the `settings.gradle` file.

All subproject only needs at least a `build.gradle` file, but may
as well include a `gradle.properties` file.

### How to set up

All the subprojects' gradle need to contain are the following properties:
* the mod version, by the name of `mod_version`
* the mod's maven group, by the name of `maven_group`
* the build's archive base name, by the name of `archive_base_name`
* the mod id, by the name of `mod_id`
* the mod's name, by the name of `mod_name`

The root project will take care of adding all needed groovy
dependencies for the whole build, including dependencies to
Minecraft, Fabric, and such.

You may add all needed dependency to one of all subproject
respectively in the subproject's `build.gradle` or in the
root project's build script, within the `allprojects { dependencies }`
closure.

You may as well add all additional tasks or configuration in the
root project's build script, such as for example any
modrinth/curseforge/git automatic release.

### Parallel dependencies

If you want to set a parallel dependency between two subprojects
of the whole mod, a script is already there to help you with that.
Just give a look at the example subprojects' `build.gradle` files
to copy-paste it to your needs. You then only need to edit the
`parallelDependencies` map (A String-boolean map) variable in order
to have all the dependencies set up, as well as the `fabric.mod.json`
dynamically updated

### Test run dependencies

If you want to make a mod with some specific other mod' dependency,
you might wish to have those included in your test run folders. But
at the same time, having those in your git repo quickly eats a lot
of place, and becomes annoying to update.

Instead, I propose you to only keep updated some download links to
the desired mods' jar files, all in your properties' files.
In the root project and all of its subprojects, Gradle will
automatically look for an eventual `run_mods` property, and if it
exists _(which is not required!)_, it will parse it as an array of
semicolon-separated URLs, and download each of those (if absent)
to the project's run mods folder before any test run task is
executed.

That way, you can keep all of those annoying `run` folders out of
your git history.

---

## Licensing

The build script will add the license header, located in the root
`HEADER` file, at the top of all `*.java` file in all source
directories of all projects.

The license is located in the root `LICENSE` header, and likewise
will be used for all subprojects as well as the main one.

---

## Thanks

Thank you for using my template, while it is registered as
licensed under the Unlicense, I will only ask of you to add
some reference to the original Git repository within your own
project (making it a fork would be enough). You may then change
at will all of the licensing within your own projects.

Thanks to the [Fabric API](https://github.com/FabricMC/fabric)'s
build scripts for the idea and helping me figure out how to make
it all work right.
