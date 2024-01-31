pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "helloWorld"
include(":app")
include(":mod2demo1")
include(":mod2demo2")
include(":mod3demo1")
include(":mod3tp")
include(":mod4demo1")
include(":mod4demo2")
include(":mod4demo3")
