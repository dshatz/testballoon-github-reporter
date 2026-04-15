plugins {
    alias(libs.plugins.jvm)
    alias(libs.plugins.serial)
    alias(libs.plugins.shadow)
}

group = "com.dshatz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(libs.xml)
    implementation(libs.xml.serial)
    implementation(libs.datetime)
    implementation(libs.cli)
    implementation(libs.json)
    implementation(libs.bundles.ktor)
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}

tasks.shadowJar {
    mainClass.set("com.dshatz.tbreport.MainKt")
    destinationDirectory.set(project.layout.projectDirectory.dir("dist"))
    archiveFileName.set("testballoon-all.jar")
}