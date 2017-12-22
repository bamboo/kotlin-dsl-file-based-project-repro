plugins {
    application
    kotlin("jvm") version "1.2.10"
    idea
}

application {
    mainClassName = "samples.HelloWorldKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}
