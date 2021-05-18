// https://www.programiz.com/java-programming/hello-world -- Your First Program
// Merged with: https://www.baeldung.com/asciidoctor

import static org.asciidoctor.Asciidoctor.Factory.create;
import org.asciidoctor.Asciidoctor;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //System.out.println("I AM HERE -- '" + System.getProperty("user.dir") + "'" );
        // Default PWD for fresh Ubuntu is: '/home/hippo/IdeaProjects/Example_AsciiDoctorJ'

        Asciidoctor asciidoctor = create();

        // //With retrieved instance, we can convert AsciiDoc document very easily:
        // String output = asciidoctor.convert("Hello _Baeldung_!", new HashMap<String, Object>());

        //https://raw.githubusercontent.com/asciidoctor/asciidoctor-pdf/main/examples/basic-example.adoc
        //String output = asciidoctor.convertFile(new File("baeldung.adoc"), new HashMap<String, Object>());

        //TODO: String output = asciidoctor.convertFile(new File("asic-example.adoc"), new HashMap<String, Object>());
    }

}
