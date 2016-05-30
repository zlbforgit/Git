package IoDemo1;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("fos3.txt");
			byte[] bys = new byte[1024];
			int len = 0;
			//int read(byte[] b, int off, int len)  从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。 
	        while ((len = fis.read(bys)) != -1) {
	        	System.out.println(new String(bys, 0, len));
	        }
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}
