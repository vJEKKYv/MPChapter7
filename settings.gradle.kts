pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "MPChapter7"
include(":app")
include(":ch08EventTest")
include(":app:ch7_layout")
include(":Ch7_Layout")
include(":ch08")
include(":ch08keyEvent")
include(":ch08ChangeHandler")
include(":ch08_Event")
include(":ch09")
include(":ch11")
include(":ch13")
include(":ch10")
include(":ch13anrtest")
include(":ch11-2")
