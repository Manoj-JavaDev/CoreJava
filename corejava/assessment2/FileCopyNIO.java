package corejava.assessment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyNIO {

    public static void main(String[] args) {


        Path sourcePath = Paths.get("src/corejava/assessment2/source.txt");
        Path destination = Paths.get("src/corejava/assessment2/destination.txt");

        try {
            Files.copy(sourcePath, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully using NIO Package");
        }

        catch (IOException io) {
            io.printStackTrace();
        }

    }

}
