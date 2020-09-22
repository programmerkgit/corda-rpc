plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
    maven("https://ci-artifactory.corda.r3cev.com/artifactory/corda-releases")
    maven("https://ci-artifactory.corda.r3cev.com/artifactory/corda")
    maven("https://repo.gradle.org/gradle/libs-releases")
    maven("https://jitpack.io")
    mavenLocal()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.11.2")
    implementation("net.corda:corda-core:4.5")
    implementation("net.corda:corda-jackson:4.5")
    implementation("net.corda:corda-rpc:4.5")
    implementation("net.corda:corda:4.5")
    implementation(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}