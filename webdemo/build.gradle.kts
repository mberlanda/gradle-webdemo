plugins {
    war
}

repositories {
    jcenter()
}

dependencies {
    providedCompile("javax.servlet:javax.servlet-api:3.1.0") 
    testCompile("junit:junit:4.12")
}
