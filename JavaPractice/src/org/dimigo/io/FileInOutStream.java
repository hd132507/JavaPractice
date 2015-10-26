/**
 * 
 */
package org.dimigo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <pre>
 * org.dimigo.io
 * |_FileInOutStream
	1. 개요 : 
	2. 작성일 :  2015. 10. 26.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class FileInOutStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(InputStream is = new FileInputStream("files/header.jpg");
					OutputStream os = new FileOutputStream("files/header_copy.jpg");
					){
					int result;
					//while((result = is.read())!= -1){
				//		os.write(result);
				//	}
					
					byte[] buf = new byte[100];
					while((result = is.read(buf))!=-1){
						os.write(buf,0,result);
					}
					
				System.out.println("파일 생성 완료");
			} catch(Exception e){
				e.printStackTrace();
			}
	}

}
