plugins {
    kotlin("jvm")
    kotlin("kapt")
    kotlin("plugin.serialization")
    id("java")
    signing
    `maven-publish`
    id("com.jfrog.bintray")
}

dependencies {
    implementation(project(":kotlin-jvm-blocking-bridge"))
    compileOnly("org.jetbrains.kotlin:kotlin-compiler-embeddable:${Versions.kotlin}")

    kapt("com.google.auto.service:auto-service:1.0-rc7")
    compileOnly("com.google.auto.service:auto-service-annotations:1.0-rc7")

    testImplementation(project(":kotlin-jvm-blocking-bridge"))

    testImplementation(kotlin("reflect"))

    testImplementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:${Versions.kotlin}")
    testImplementation("com.github.tschuchortdev:kotlin-compile-testing:1.2.6")

    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}")

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit5"))

    testImplementation("com.github.tschuchortdev:kotlin-compile-testing:1.2.9")
    testImplementation("org.assertj:assertj-core:3.11.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
}

setupPublishing(
    groupId = "net.mamoe",
    artifactId = "kotlin-jvm-blocking-bridge-compiler"
)