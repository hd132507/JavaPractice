/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_SnackTest
	1. 개요 : 
	2. 작성일 :  2015. 5. 18.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
//스낵 테스트
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		//스낵 배열 생성
		Snack[] snack = new Snack[] {new Snack("새우깡","농심",1100,2),
				new Snack("콘칲","크라운",1200,1),
				new Snack("허니버터칩","해태",1500,4)};
		//스낵 배열에 들어간 값 정보 출력
		for(Snack value: snack)
		{
			value.printSnack();
			sum+=value.calcPrice();
			System.out.println("");
		}
		
		System.out.println("총 구매 금액 : "+String.format("%,d",sum)+"원"); //총 구매 금액 출력
		// TODO Auto-generated method stub1

	}

}
