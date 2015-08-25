/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_iPhone
	1. 개요 : 
	2. 작성일 :  2015. 8. 25.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class iPhone extends SmartPhone {
	iPhone()
	{
		
	}
	
	iPhone(String model, String company, int price)
	{
		super(model,company,price);
	}
	public void pay()
	{
		System.out.println("애플 페이로 결재합니다.");
	}
	public void useAirDrop()
	{
		System.out.println("Airdrop 기능을 사용합니다.");
	}
}
