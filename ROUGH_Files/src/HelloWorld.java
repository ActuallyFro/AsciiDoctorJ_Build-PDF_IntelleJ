// https://www.programiz.com/java-programming/hello-world -- Your First Program
// Merged with: https://www.baeldung.com/asciidoctor

//Other example -- https://github.com/asciidoctor/asciidoctorj#running-asciidoctorj-on-wildfly-as

import static org.asciidoctor.Asciidoctor.Factory.create;
import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Attributes;
import org.asciidoctor.Options;

//import javax.xml.stream.events.Attribute;
import java.io.File; //https://www.geeksforgeeks.org/file-class-in-java/
import java.util.HashMap; //https://www.w3schools.com/java/java_hashmap.asp

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //System.out.println("I AM HERE -- '" + System.getProperty("user.dir") + "'" );
        // Default PWD for fresh Ubuntu is: '/home/hippo/IdeaProjects/Example_AsciiDoctorJ'

        Asciidoctor asciidoctor = create();

        // //With retrieved instance, we can convert AsciiDoc document very easily:
        // String output = asciidoctor.convert("Hello _Baeldung_!", new HashMap<String, Object>());

        //String output = asciidoctor.convertFile(new File("baeldung.adoc"), new HashMap<String, Object>());

        //https://raw.githubusercontent.com/asciidoctor/asciidoctor-pdf/main/examples/basic-example.adoc
        //String output = asciidoctor.convertFile(new File("basic-example.adoc"), new HashMap<String, Object>());

        //https://docs.asciidoctor.org/asciidoctorj/latest/conversion-examples DEPRICATED!
        //Map<String, Object> attributes = Attributes.builder().backend("docbook").icons("font").asMap();
        //Map<String, Object> options = Options.builder().inPlace(true).attributes(attributes).asMap();
        //Attributes attributes = Attributes.builder().backend("docbook").icons("font").build(); //COMPLETELY GUESSING!!!

        //Baeldung -- "We'll set the in_place option to true so that our file is automatically generated and saved to the file system:"
        //Attributes attributes = Attributes.builder().backend("html").build(); //.icons("font").build(); //Works!
        Attributes attributes = Attributes.builder().icons("font").build(); //.build();

        //TODO: THIS: https://github.com/asciidoctor/asciidoctorj-pdf/issues/7#issuecomment-324979355 says pdf's CANT be a backend...

        //Attributes attributes = Attributes.builder().backend("coderay").icons("font").build(); //https://github.com/asciidoctor/asciidoctor-maven-examples/blob/main/asciidoctor-pdf-example/pom.xml
        Options options = Options.builder().inPlace(true).backend("pdf").attributes(attributes).build(); //COMPLETELY GUESSING!!!

        //String output = asciidoctor.convertFile(new File("basic-example.adoc"), new HashMap<String, Object>());
        //String output = asciidoctor.convertFile(new File("basic-example.adoc"), options); //Attempt from the Docs pages
        String output = asciidoctor.convertFile(new File("basic-example.adoc"), options); //COMPLETELY GUESSING!!!

        //TODO: Multi-file generation!
        // From Baeldun page:
        //        For converting multiple files, the convertFiles method accepts List object as a first parameter and returns arrays of String objects.
        //                More interesting is how to convert a whole directory with AsciidoctorJ.
        //
        //        As mentioned above, to convert a whole directory – we should call the convertDirectory method. This scans the provided path and searches for all files with AsciiDoc extensions (.adoc, .ad, .asciidoc, .asc) and converts them. To scan all files, an instance of the DirectoryWalker should be provided to the method.
        //
        //        Currently, Asciidoctor provides two built-in implementations of mentioned interface:
        //
        //        AsciiDocDirectoryWalker – converts all files of given folder and its subfolders. Ignores all files starting with “_”
        //        GlobDirectoryWalker – convert all files of given folder following a glob expression
        //
        //        String[] result = asciidoctor.convertDirectory(
        //                new AsciiDocDirectoryWalker("src/asciidoc"),
        //                new HashMap<String, Object>());


    }

}
