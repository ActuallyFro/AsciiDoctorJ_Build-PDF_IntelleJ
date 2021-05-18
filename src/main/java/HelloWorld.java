// https://www.programiz.com/java-programming/hello-world -- Your First Program
// Merged with: https://www.baeldung.com/asciidoctor

import static org.asciidoctor.Asciidoctor.Factory.create;
import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Attributes;
import org.asciidoctor.Options;

import javax.xml.stream.events.Attribute;
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
        Attributes attributes = Attributes.builder().backend("docbook").icons("font").build(); //COMPLETELY GUESSING!!!
        Options options = Options.builder().inPlace(true).attributes(attributes).build(); //COMPLETELY GUESSING!!!

        //String output = asciidoctor.convertFile(new File("basic-example.adoc"), new HashMap<String, Object>());
        //String output = asciidoctor.convertFile(new File("basic-example.adoc"), options); //Attempt from the Docs pages
        String output = asciidoctor.convertFile(new File("basic-example.adoc"), options); //COMPLETELY GUESSING!!!

    }

}
