# design-patterns
Learning Design Patterns

Gradle based repository to practice design-patterns in `Java` language.
- Java `25.0.1` managed by [sdkman](https://sdkman.io/install/) using [sdkmanrc](.sdkmanrc)
- Gradle `9.3.1` with [gradle wrapper](gradle/wrapper/gradle-wrapper.properties) - [Compatibility Matrix](https://docs.gradle.org/current/userguide/compatibility.html#java_runtime)

Structured in 4 Modules
- `common` : common classes used by other 3 modules (currently empty)
- `creational` : Creational Design Patterns
- `behavioral` : Behavioral Design Patterns
- `structural` : Structural Design Patterns

<!-- TOC -->
* [design-patterns](#design-patterns)
* [Setup](#setup)
* [References](#references)
<!-- TOC -->

# Setup

```bash
scripts/localhost.sh git;
scripts/localhost.sh install;
```

```bash
scripts/localhost.sh list;
```

`buildSrc` has the plugins where we have defined common dependencies like lombok.
```bash
# we can also pass the variable as parameter
./gradlew clean build -PlombokVersion=1.18.30
```

```shell
./gradlew :behavioral:run
./gradlew :creational:run
./gradlew :structural:run
```

# References
- [setup](docs/setup.md)
- Website :arrow_upper_right:
    - [Refactoring Guru](https://refactoring.guru/design-patterns)
    - [geeksforgeeks](https://www.geeksforgeeks.org/system-design/software-design-patterns/)
    - [howtodoinjava](https://howtodoinjava.com/design-patterns/)
    - [DigitalOcean](https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial)
    - [Baeldung](https://www.baeldung.com/design-patterns-series)
    - [Baeldung - Spring Framework](https://www.baeldung.com/spring-framework-design-patterns)
    - [oo design](https://www.oodesign.com)
- Books :arrow_upper_right:
    - [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/)
    - [Head First Design Patterns, 2nd Edition](https://www.oreilly.com/library/view/head-first-design/9781492077992/)
