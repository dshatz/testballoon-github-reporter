@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.tasks.KotlinTest

plugins {
    alias(libs.plugins.mp)
    alias(libs.plugins.test)
}

kotlin {
    jvmToolchain(21)
    jvm()
    linuxX64()
    wasmJs {
        browser {
            testTask {
                useKarma {
                    useFirefoxHeadless()
                }
            }
        }
        nodejs()
        binaries.executable()
    }
    js {
        browser {
            testTask {
                useKarma {
                    useFirefoxHeadless()
                }
            }
        }
        binaries.executable()
    }

    sourceSets {
        commonTest.dependencies {
            implementation(libs.test.core)
            implementation(libs.test.kotest)
        }
    }
}

tasks.withType<KotlinTest>() {
    failOnNoDiscoveredTests = false
    reports.junitXml.required = true
}

tasks.withType<Test>() {
    failOnNoDiscoveredTests = false
    reports.junitXml.required = true
}