/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * |_SaveImageFromUrl
	1. 개요 : 
	2. 작성일 :  2015. 10. 26.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		try{
			URL url = new URL(imageUrl);
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.png")){
				byte[] buf = new byte[100];
				int result;
				while((result = is.read(buf))!=-1){
					os.write(buf,0,result);
				}
				
		}catch(IOException e){
			e.printStackTrace();
		}
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
	}
	}

