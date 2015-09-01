/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_Galaxy
	1. 개요 : 
	2. 작성일 :  2015. 8. 25.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class Galaxy extends SmartPhone {
	Galaxy()
	{
	}
	
	Galaxy(String model, String company, int price)
	{
		super(model,company,price);
	}
	
	public void pay()
	{
		System.out.println("삼성 페이로 결재합니다");
	}
	
	public void useWirelessCharging()
	{
		System.out.println("무선 충전 기능을 이용합니다");
	}
}
