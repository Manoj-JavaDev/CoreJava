package corejava.assessment2;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("src/corejava/assessment2/FileWriteroutput.txt")) {

           writer.write("Hi \n");
           writer.write("Hello \n");
           writer.write("FileWriter is used to Write Unicode characters !!\n");
           writer.write("It is mostly used class to write data!\n");

        }
        catch (IOException e) {
                e.printStackTrace();
        }
    }
}

