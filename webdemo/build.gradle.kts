plugins {
    war
    id("org.gretty") version "3.0.1"
}

repositories {
    jcenter()
}

gretty {
    integrationTestTask = "test"  
}

dependencies {
    providedCompile("javax.servlet:javax.servlet-api:3.1.0") 
    testCompile("junit:junit:4.12")
    testCompile("org.mockito:mockito-core:3.3.3") 
    testCompile("io.github.bonigarcia:webdrivermanager:3.8.1") 
    testCompile("org.seleniumhq.selenium:selenium-java:3.14.0")
}
