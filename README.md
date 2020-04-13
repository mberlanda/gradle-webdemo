# Building Java Web Applications

<https://guides.gradle.org/building-java-web-applications/>

## What you’ll need

### Install Java distribution on Ubuntu

* <https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-on-ubuntu-18-04>

```sh
$ sudo apt install default-jre default-jdk
$ java --version
$ javac --version
$ sudo update-alternatives --config java
$ sudo update-alternatives --config javac
$ sudo echo 'JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64/bin/"' >> /etc/environment
```

### Install Gradle distribution

* <https://sdkman.io/install>
* <https://gradle.org/install/>

```sh
$ curl -s "https://get.sdkman.io" | bash
$ sdk version
SDKMAN 5.7.4+362
$ sdk install gradle 6.3
```

## Create the structure of a web application

<https://docs.gradle.org/4.10.3/userguide/war_plugin.html>

```sh
mkdir -p src/main/java
mkdir -p src/main/webapp
mkdir -p src/test/java
```

## Add a Gradle build file

```sh
$ touch webdemo/build.gradle.kts
$ gradle wrapper --gradle-version=4.10.3
```

## Run the application

* Add a servlet and metadata to the project
* JSP pages to the demo application
* Add `gretty` plugin and run the app

<https://github.com/gradle/gradle/issues/11843>
