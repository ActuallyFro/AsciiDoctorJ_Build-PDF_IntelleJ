Tutorial
=======

https://www.baeldung.com/asciidoctor


OLD POM:
--------
```
<dependency>
    <groupId>org.asciidoctor</groupId>
    <artifactId>asciidoctorj</artifactId>
    <version>1.5.5</version>
</dependency>
<dependency>
    <groupId>org.asciidoctor</groupId>
    <artifactId>asciidoctorj-pdf</artifactId>
    <version>1.5.0-alpha.15</version>
</dependency>
```

New POM:
```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.EFHSOCK</groupId>
    <artifactId>Example_AsciiDoctorJ</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>org.asciidoctor</groupId>
            <artifactId>asciidoctorj</artifactId>
            <version>2.5.1</version>
        </dependency>

        <dependency>
            <groupId>org.asciidoctor</groupId>
            <artifactId>asciidoctorj-pdf</artifactId>
            <version>1.6.0</version>
        </dependency>
    </dependencies>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>

</project>
```

Websites:
---------
https://search.maven.org/classic/#search%7Cga%7C1%7Cg%3A%22org.asciidoctor%22
https://search.maven.org/classic/#search%7Cgav%7C1%7Cg%3A%22org.asciidoctor%22%20AND%20a%3A%22asciidoctorj-pdf%22


Pro Tips
--------
1. In the POM for IntelleJ -- Press Alt+Insert to add the Dependencies.
2. IF "cannot find dependencies" hits, THEN go back to POM -- Right click, Scroll to MAVEN, then Reload (it should NOW pull the dependencies) [THEN EXTERNAL Libraries EXPLODE]


MUST
----
1. Install Git + TMUX
2. git config --global init.defaultBranch master

