buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.5.31")
        classpath("com.android.tools.build:gradle:4.2.2")
        classpath ("com.squareup.sqldelight:gradle-plugin:1.5.2")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.39.1")
    }
}

group = "com.spaceapps"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}