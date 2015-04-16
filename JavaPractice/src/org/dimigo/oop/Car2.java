/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_Car
	1. 개요 :  자동차 클래스
	2. 작성일 :  2015. 4. 13.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(String newCompany, String newColor, String newModel,int newMaxSpeed, int newPrice)
	{
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	public String getCompany()
	{
		return company;
	}
	public String getModel()
	{
		return model;
	}
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	public int getPrice()
	{
		return price;
	}
	public String getColor()
	{
		return color;
	}
	
}
