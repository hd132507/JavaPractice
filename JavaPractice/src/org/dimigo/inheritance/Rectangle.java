/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_Rectangle
	1. 개요 : 
	2. 작성일 :  2015. 8. 12.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class Rectangle extends Figure {
	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int CenterX, int CenterY, int width, int height)
	{
		super(CenterX, CenterY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea(){
		return width * height;
	}
	
	protected void printCenter()
	{
		System.out.printf("사각형 ");
		super.printCenter();
	}
}
