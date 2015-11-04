/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * |_Race
	1. 개요 : 
	2. 작성일 :  2015. 11. 4.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t1 = new Thread(new Runner2("스카웃"));
			Thread t2 = new Thread(new Runner2("헤비"));
			
			t1.setPriority(Thread.MAX_PRIORITY);
			t2.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			t2.start();
	}

}
