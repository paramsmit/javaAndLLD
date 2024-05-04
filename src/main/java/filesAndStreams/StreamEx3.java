package filesAndStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx3 {
    public static void main(String[] args) {
        // Create File objects for source and destination files
        File sourceFile = new File("/Users/psanghani/javaAndLLD/src/main/java/filesAndStreams/photo1.jpeg");
        File destinationFile = new File("/Users/psanghani/javaAndLLD/src/main/java/filesAndStreams/photo2.jpeg");

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

            // Use a buffer to read and write data in chunks

            byte[] buffer = new byte[4096];
            int bytesRead;
            int count = 0;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                System.out.println(bytesRead);
                count++;
            }

            System.out.println(count);

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
