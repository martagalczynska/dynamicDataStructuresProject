package fileCreator;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public FileWrite() {
    }

    public void writeToFile(String string) {
        try {
            FileWriter myWriter = new FileWriter("report.txt", true);
            myWriter.write(string + System.lineSeparator());
            myWriter.close();
        } catch (IOException var3) {
            System.out.println("An error occurred.");
            var3.printStackTrace();
        }

    }
}
