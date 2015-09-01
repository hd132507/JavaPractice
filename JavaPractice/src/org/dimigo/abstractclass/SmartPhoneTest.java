/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_SmartPhoneTest
	1. 개요 : 
	2. 작성일 :  2015. 8. 25.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SmartPhone iphone = new iPhone("iPhone 6","애플",700000);
			System.out.println(iphone.toString());
			iphone.turnOn();
			iphone.pay();
			iphone.useSpecialFunction();
			iphone.turnOff();
			
			System.out.println("");
			
			SmartPhone galaxy = new Galaxy("갤럭시 S6","삼성",650000);
			System.out.println(galaxy.toString());
			galaxy.turnOn();
			galaxy.pay();
			galaxy.useSpecialFunction();
			galaxy.turnOff();
	}

}
