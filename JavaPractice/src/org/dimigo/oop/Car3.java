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
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String newCompany, String model, String color,int newMaxSpeed, int newPrice)
	{
			this.company = newCompany;
			this.model = model;
			this.color = color;
			this.maxSpeed = newMaxSpeed;
			this.price = newPrice;
	}
	public Car3(String newCompany, String model, String color,int newMaxSpeed)
	{
		this(newCompany,model, color, newMaxSpeed, 0);
	}
	public Car3(String newCompany, String model, String color)
	{
		this(newCompany,model, color,0,0);
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
