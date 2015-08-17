/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_Figure
	1. 개요 : 
	2. 작성일 :  2015. 8. 12.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class Figure {
	private int centerX;
	private int centerY;
	Figure(){
		centerX = 0;
		centerY = 0;
	}
	Figure(int centerX, int centerY)
	{
		centerX = 0;
		centerY = 0;
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea()
	{
		return 0.0;
	}
}