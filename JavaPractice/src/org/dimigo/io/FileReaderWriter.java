/**
 * 
 */
package org.dimigo.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 * |_FileReaderWriter
	1. 개요 : 
	2. 작성일 :  2015. 10. 26.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class FileReaderWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(Reader reader = new FileReader("files/input.txt");
					Writer writer = new FileWriter("files/output.txt");)
			{
				char[] buf = new char[100];
				int result;
				
				while((result = reader.read(buf))!=-1){
					writer.write(buf,0,result);
				}
				writer.write("\nCall of duty advanced warfare");
				System.out.println("파일 생성 완료");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
