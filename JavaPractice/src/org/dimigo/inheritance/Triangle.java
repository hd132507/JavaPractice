/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_Triangle
	1. 개요 : 
	2. 작성일 :  2015. 8. 12.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class Triangle extends Figure {
	private int width;
	private int height;
	
	Triangle(int width, int height)
	{
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	Triangle (int CenterX, int CenterY, int width, int height)
	{
		super(CenterX, CenterY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea()
	{
		return height * width / 2.0;
	}
}
