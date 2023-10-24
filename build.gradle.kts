plugins {
    id("java")
}

group = "net.salig"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.cucumber:cucumber-java:7.14.0")
    testImplementation("io.cucumber:cucumber-junit:7.14.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.7.2")
}

tasks {
    test {
        useJUnitPlatform()
    }
}