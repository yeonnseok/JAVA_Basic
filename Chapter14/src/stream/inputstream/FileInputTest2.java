package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input2.txt");) {
			int i;
			byte[] bs = new byte[10];
			while ((i = fis.read(bs)) != -1) {
//				for(byte b: bs) {
//					System.out.print((char)b);
//				}
//				System.out.println();
				
				for (int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
