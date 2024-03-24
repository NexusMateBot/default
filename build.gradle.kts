plugins {
    id("java")
}

group = "fr.nexusmate"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("fr.enimaloc.wss:core:0.0.1")
    implementation("fr.enimaloc.wss:server:0.0.1")

    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.electronwill.night-config:toml:3.6.7")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}