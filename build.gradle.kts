import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.spring") version "1.5.10"
    kotlin("plugin.jpa") version "1.5.10"
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
    id("com.github.ben-manes.versions") version "0.36.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val jaxws by configurations.creating

dependencies {
    jaxws("jakarta.xml.ws:jakarta.xml.ws-api:3.0.1")
    jaxws("jakarta.xml.bind:jakarta.xml.bind-api:3.0.1")
    jaxws("jakarta.activation:jakarta.activation-api:2.0.1")
    jaxws("com.sun.xml.ws:jaxws-rt:3.0.1")
    jaxws("jakarta.xml.soap:jakarta.xml.soap-api:2.0.1")
    jaxws("com.sun.xml.messaging.saaj:saaj-impl:2.0.1")
    jaxws("com.sun.xml.ws:jaxws-ri:3.0.1")

    implementation("jakarta.xml.ws:jakarta.xml.ws-api:3.0.1")
    implementation("jakarta.xml.bind:jakarta.xml.bind-api:3.0.1")
    implementation("jakarta.activation:jakarta.activation-api:2.0.1")
    implementation("jakarta.xml.soap:jakarta.xml.soap-api:2.0.1")
    implementation("com.sun.xml.messaging.saaj:saaj-impl:2.0.1")
    implementation("com.sun.xml.ws:jaxws-rt:3.0.1")
    implementation("com.sun.xml.ws:jaxws-ri:3.0.1")
}

task("wsimport-gbgid3") {
    group = BasePlugin.BUILD_GROUP
    val sourcedestdir = file("$projectDir/src/main/java")
    sourcedestdir.mkdirs()
    System.setProperty("javax.xml.accessExternalSchema", "all")

    doLast {
        ant.withGroovyBuilder {
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to jaxws.asPath
            )

            "wsimport"(
                "keep" to true,
                "Xnocompile" to true,
                "extension" to true,
                "sourcedestdir" to sourcedestdir,
                "wsdl" to "$projectDir/src/main/resources/META-INF/wsdl/GBGID3Service.wsdl",
                "wsdlLocation" to "https://pilot.id3global.com/ID3gWS/ID3global.svc?wsdl",
                "package" to "com.starlix.service.id3"
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}