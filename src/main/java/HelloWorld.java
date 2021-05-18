import static org.asciidoctor.Asciidoctor.Factory.create;
import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Attributes;
import org.asciidoctor.Options;

import java.io.File;
import java.text.DecimalFormat;

class HelloWorld {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long stopTime;
        System.out.println("Generating an example PDF from an .adoc File!");

        Asciidoctor asciidoctor = create();

        //File Settings/Options
        Attributes attributes = Attributes.builder().icons("font").build(); //No idea what this does...
        Options options = Options.builder().inPlace(true).backend("pdf").attributes(attributes).build();

        asciidoctor.convertFile(new File("basic-example.adoc"), options);

        stopTime = System.currentTimeMillis();
        long timeElapsed = stopTime - startTime;
        Float timeSecs = new Float ((float)timeElapsed/1000.0);
        System.out.println("Generating an example PDF from an .adoc File! (elapsed time: " + DecimalFormat.getNumberInstance().format(timeSecs) + " secs )");
    }
}

//References:
//-----------
// https://www.programiz.com/java-programming/hello-world
// Merged with: https://www.baeldung.com/asciidoctor
// Other example -- https://github.com/asciidoctor/asciidoctorj#running-asciidoctorj-on-wildfly-as

// Import: https://www.geeksforgeeks.org/file-class-in-java/
// File: https://raw.githubusercontent.com/asciidoctor/asciidoctor-pdf/main/examples/basic-example.adoc
