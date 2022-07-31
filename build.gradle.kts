import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "13"
    }
}

group = "org.nezu"
version = "0.1.0-SNAPSHOT"

subprojects {
    apply(plugin = "maven-publish")
    apply(plugin = "java")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenLocal()
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
        maven { url = uri("https://jcenter.bintray.com/") }
        maven { url = uri("https://repo.maven.apache.org/maven2") }
        maven { url = uri("https://jitpack.io/") }
    }
}