package IoDemo1;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * 
 * 创建字节流对象
 * 一个一个字节读取
 * 关闭字节流对象
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("fos3.txt");
			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char)b);
			}
			
		} catch (IOException e) {
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
