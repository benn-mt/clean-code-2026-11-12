plugins {
    kotlin("jvm") version "2.2.20"
    application
}

group = "org.madetech"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
    testLogging.showStandardStreams = true
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("org.madetech.MainKt")
}