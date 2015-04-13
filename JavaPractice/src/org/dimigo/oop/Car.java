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
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
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
	public void setCompany(String Company)
	{
		company = Company;
	}
	public void setModel(String Model)
	{
		model = Model;
	}
	public void setcolor(String Color)
	{
		color = Color;
	}
	public void setMaxSpeed(int MaxSpeed)
	{
		maxSpeed = MaxSpeed;
	}
	public void setPrice(int Price)
	{
		price = Price;
	}
}
