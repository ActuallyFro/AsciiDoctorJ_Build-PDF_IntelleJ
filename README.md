Example AsciiDoctorJ PDF Generation (IntelleJ Project)
======================================================
So in this repo is a hack of several sources online to get the AsciiDocJ to generate a PDF from a .adoc file.

The majority of the source came from: https://www.baeldung.com/asciidoctor. 
However, much of the hooks are depricated to the current version of AsciiDoctorJ.
IntelleJ screams less, and not at all for Depricated Methods, in this example.
I have attempted to simply it as much as possible, but the activities of the Attributes, Options, and Directory Conversion (i.e., batch file processing) is left to the reader.


Websites:
---------
1. https://www.programiz.com/java-programming/hello-world [B/c I'm a C guy...]
2. Merged with: https://www.baeldung.com/asciidoctor [MAIN Example!]
3. Other example -- https://github.com/asciidoctor/asciidoctorj#running-asciidoctorj-on-wildfly-as [From the main team]
4. https://search.maven.org/classic/#search%7Cga%7C1%7Cg%3A%22org.asciidoctor%22 [Maven repo/versions]
5. https://search.maven.org/classic/#search%7Cgav%7C1%7Cg%3A%22org.asciidoctor%22%20AND%20a%3A%22asciidoctorj-pdf%22 [Maven repo/versions]

The AsciiDoc Example Source
---------------------------
1. https://raw.githubusercontent.com/asciidoctor/asciidoctor-pdf/main/examples/basic-example.adoc

Pro Tips
--------
1. In the POM for IntelleJ -- Press Alt+Insert to add the Dependencies.
2. IF "cannot find dependencies" hits, THEN go back to POM -- Right click, Scroll to MAVEN, then Reload (it should NOW pull the dependencies) [THEN EXTERNAL Libraries EXPLODE]

MUST
----
1. Install Git + TMUX
2. Install IntelleJ
3. Install Oracle's JDK 8 (don't cheap out on OpenJDK!)

On a Clean Ubuntu
-----------------
1. git config --global init.defaultBranch master
2. git config --global user.email "actuallyfro@github.com" 
3. git config --global user.name "actuallyfro"

Build to Jar
------------
https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html#package
