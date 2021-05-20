import static org.asciidoctor.Asciidoctor.Factory.create;
import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Attributes;
import org.asciidoctor.Options;
import org.asciidoctor.jruby.AsciiDocDirectoryWalker;


import java.io.File;
import java.text.DecimalFormat;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class HelloWorld {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long stopTime;

        String directory=".";

        if(args.length > 0){
            directory = args[0];
            Path path = Paths.get(directory);
            if (!Files.isDirectory(path)){
                path = Paths.get(".");
            }
            directory = path.toString();
        }

        String backendStr = "pdf";
        if(args.length > 1) {
            backendStr = args[1];
        }
        System.out.println("Generating "+backendStr+"(s) from an .adoc File(s)!");

        Asciidoctor asciidoctor = create();

        //File Settings/Options
        Attributes attributes = Attributes.builder().icons("font").build(); //No idea what this does...
        Options options = Options.builder().inPlace(true).backend(backendStr).attributes(attributes).build(); //TRY-CATCH!?!?!

//        String[] result = asciidoctor.convertDirectory(new AsciiDocDirectoryWalker(directory), options);
        //https://www.codota.com/code/java/methods/org.asciidoctor.Asciidoctor/convertDirectory
//        public String[] convertDirectory(String baseDir) {
//            final AsciiDocDirectoryWalker directoryWalker = new AsciiDocDirectoryWalker(baseDir);
//            return asciidoctor.convertDirectory(directoryWalker, options);
//        }

        asciidoctor.convertDirectory(new AsciiDocDirectoryWalker(directory), options); //ALL files within a directory
        //asciidoctor.convertFile(new File("basic-example.adoc"), options); //single file

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
