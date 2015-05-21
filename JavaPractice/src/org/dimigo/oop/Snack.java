/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_Snack
	1. 개요 : 
	2. 작성일 :  2015. 5. 18.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */

/**
 * @param args
 */

//간식 클래스
public class Snack {

	private String name; //이름
	private String company; //회사
	private int price; // 가격
	private int number; //갯수
	public Snack()//기본 생성자
	{
		
	}
	//생성자
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack()
	{
		System.out.println("이름 : "+name);
		System.out.println("제조사 : "+company);
		System.out.println("가격 : "+String.format("%,d",getPrice())+"원");
		System.out.println("개수 : "+number+"개");
	}
	
	public int calcPrice()
	{
		price = number * price;
		return price;
	}
	
	
	/**
	 * @param name
	 * @param company
	 * @param price
	 * @param number
	 */
	

}
