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

