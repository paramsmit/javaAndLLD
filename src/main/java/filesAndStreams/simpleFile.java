package filesAndStreams;

import java.io.File;
import java.io.IOException;

public class simpleFile {

    public static void main(String [] args) throws IOException {
        File file = new File("/Users/psanghani/javaAndLLD/src/main/java/filesAndStreams/hello");
        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        System.out.println("***" + file.toString());
    }

}
