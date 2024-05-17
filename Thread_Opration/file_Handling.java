import java.io.*;
import java.util.*;

class file_Handling {
    public static void main(String[] args) throws IOException {
        // Create a new file object for "file1.txt"
        File f = new File("file1.txt");
        
        // Create a new file object for "file2.txt"
        File f2 = new File("file2.txt");
        
        // Create a new file object for "output.txt"
        File o = new File("output.txt");
        
        // Create a FileWriter object to write to "file1.txt"
        FileWriter fw = new FileWriter(f);
        
        // Create a BufferedWriter object to write to "file1.txt" in a buffered manner
        BufferedWriter bw = new BufferedWriter(fw);
        
        // Write "abc" to "file1.txt"
        bw.write("abc");
        
        // Write "10.5" to "file1.txt"
        bw.write("10.5");
        
        // Write "6" to "file1.txt"
        bw.write("6");
        
        // Create a PrintWriter object to write to "file2.txt"
        PrintWriter pw2 = new PrintWriter(f2);
        
        // Write "cgu" to "file2.txt"
        pw2.print("cgu");
        
        // Write "21" to "file2.txt"
        pw2.print("21");
        
        // Write "true" to "file2.txt"
        pw2.print("true");
        
        // Create a FileReader object to read from "file1.txt"
        FileReader fr = new FileReader(f);
        
        // Create a FileReader object to read from "file2.txt"
        FileReader fr1 = new FileReader(f2);
        
        // Create a FileReader object to read from "output.txt"
        FileReader fro = new FileReader(o);
        
        // Create a BufferedReader object to read from "file1.txt" in a buffered manner
        BufferedReader br = new BufferedReader(fr);
        
        // Create a BufferedReader object to read from "file2.txt" in a buffered manner
        BufferedReader br1 = new BufferedReader(fr1);
        
        // Create a BufferedReader object to read from "output.txt" in a buffered manner
        BufferedReader bro = new BufferedReader(fro);
        
        // Print the first character read from "file1.txt"
        System.out.println(br.read());
        
        // Create a PrintWriter object to write to "output.txt"
        PrintWriter pwo = new PrintWriter(o);
    }
}