# Setup

## Gradle Init

```shell
sdk current gradle
gradle init
./gradlew --version
```

## java sdk

```shell
sdk current java
sdk install java 25.0.1-amzn
sdk env init
```

## IntelliJ IDEA settings

- File > Project Structure > Project SDK > java 25
    - `File > Invalidate Caches / Restart`
- IntelliJ IDEA > Settings > Build Tools > Gradle > Gradle JVM > Project SDK

