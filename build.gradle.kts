import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform") version "2.2.20" // kotlin_version
    kotlin("plugin.serialization") version "2.2.20" // kotlin_version
    id("com.vanniktech.maven.publish") version "0.30.0"
}

group = "io.github.femimarket"
version = "4.3.0"

mavenPublishing {
    publishToMavenCentral(com.vanniktech.maven.publish.SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
    coordinates("io.github.femimarket", "kotlinapi", project.version.toString())
    pom {
        name.set("kotlinapi")
        description.set("Kotlin client for api.earnfemi.com")
        url.set("https://github.com/femimarket/kotlinapi")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("femimarket")
                name.set("femi")
            }
        }
        scm {
            url.set("https://github.com/femimarket/kotlinapi")
            connection.set("scm:git:https://github.com/femimarket/kotlinapi.git")
            developerConnection.set("scm:git:ssh://git@github.com/femimarket/kotlinapi.git")
        }
    }
}

val kotlin_version = "2.2.20"
val coroutines_version = "1.10.2"
val serialization_version = "1.9.0"
val ktor_version = "3.2.3"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    js {
        browser()
        nodejs()
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$serialization_version")

                api("io.ktor:ktor-client-core:$ktor_version")
                api("io.ktor:ktor-client-serialization:$ktor_version")
                api("io.ktor:ktor-client-content-negotiation:$ktor_version")
                api("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")

                api("org.jetbrains.kotlinx:kotlinx-datetime:0.7.1")
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
                implementation("io.ktor:ktor-client-mock:$ktor_version")
            }
        }

        jvmMain {
            dependencies {
                implementation(kotlin("stdlib-jdk7"))
                implementation("io.ktor:ktor-client-cio-jvm:$ktor_version")
            }
        }

        jvmTest {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        iosMain {
            dependencies {
                api("io.ktor:ktor-client-ios:$ktor_version")
            }
        }

        jsMain {
            dependencies {
                api("io.ktor:ktor-client-js:$ktor_version")
            }
        }

        all {
            languageSettings {
                optIn("kotlin.time.ExperimentalTime")
                optIn("kotlin.uuid.ExperimentalUuidApi")
            }
        }
    }
}

tasks {
    register<Exec>("iosTest") {
        val device = project.findProperty("device")?.toString() ?: "iPhone 8"
        dependsOn("linkDebugTestIosX64")
        group = JavaBasePlugin.VERIFICATION_GROUP
        description = "Execute unit tests on ${device} simulator"
        val binary = kotlin.targets.getByName<KotlinNativeTarget>("iosX64").binaries.getTest("DEBUG")
        commandLine("xcrun", "simctl", "spawn", device, binary.outputFile)
    }
    register("test") {
        dependsOn("allTests")
    }
}
