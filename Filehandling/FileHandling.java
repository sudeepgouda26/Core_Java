import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
class FileHandling{
  public static void main(String[] args) throws IOException {
    File f = new File("C:\\Users\\Sudeep Gouda\\Downloads\\Jspider\\JavaM50\\FileHandling\\fileHandeling.text");
    f.createNewFile();
   boolean b = f.exists();
    System.out.println(b);
    FileWriter fw = new FileWriter("C:\\Users\\Sudeep Gouda\\Downloads\\Jspider\\JavaM50\\FileHandling\\fileHandeling.text",true);
    // fw.write("Hello, this is a test file.");
    // fw.flush();
    // fw.close();
    // System.out.println("File created and written successfully.");
    FileReader fr = new FileReader("C:\\Users\\Sudeep Gouda\\Downloads\\Jspider\\JavaM50\\FileHandling\\fileHandeling.text");
    BufferedReader br = new BufferedReader(fr);
   
   BufferedWriter bw = new BufferedWriter(fw);
    bw.write("Hello, this is a test file.");
    bw.flush();
    bw.close();

    // System.out.println("File created and written successfully.");
    BufferedReader br1 = new BufferedReader(fr);
    for(int i =0 ; i<f.length(); i++){
        System.out.print((char)br1.read());
    }
    System.out.println( "\n");
   
   
   
    for(int i =0 ; i<f.length(); i++){
        System.out.print((char)fr.read());

 


    }
    System.out.println( "\n");

   
  }
}