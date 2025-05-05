import java.io.*;

public class file {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Sudeep Gouda\\Downloads\\Jspider\\JavaM50\\FileHandling\\file.xls");

        FileWriter writer = new FileWriter(file);
        writer.write("Hello, this is a test file.");
        writer.flush();
        writer.close();

    }
}