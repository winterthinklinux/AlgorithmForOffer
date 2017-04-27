package cn.huawei;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOofJAVA {
	public static void main(String[] args) throws IOException {
		File file = new File("./test.txt");
		InputStream f = new FileInputStream(file);
		
		System.out.println(f.read());
	}
}
