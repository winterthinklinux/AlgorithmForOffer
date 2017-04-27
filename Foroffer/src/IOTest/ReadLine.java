package IOTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
	public static void main(String[] args)  {
        try {
            BufferedReader in = new BufferedReader(new FileReader("M:/Algorithm/Foroffer/src/IOTest/test.log"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
        	System.out.println("not find file");
        }
    }
}
