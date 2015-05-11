/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_Question
	1. 개요 : 
	2. 작성일 :  2015. 5. 11.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);;
		System.out.println("discrete와 discreet중에 discreet의 뜻은?");
		String answer = scanner.nextLine();
		if(answer.equals("신중한"))
			System.out.println("정답입니다");
		else
			System.out.println("틀렸습니다!! TT");
		System.out.println("원과 박스 간의 충돌 판정시 박스의 모서리에 투영선을 그었을 때 이 박스의 투영선이 바깥쪽 영역의 명칭은?");
		answer = scanner.nextLine();
		if(answer.equals("보로노이영역"))
			System.out.println("정답입니다");
		else
			System.out.println("틀렸습니다 TT");
		
		System.out.println("운동량 p를 계산하는 공식은?");
		answer = scanner.nextLine();
		if(answer.equals("mv"))
		System.out.println("정답입니다(m은 질량 v는 속도)");
		else
			System.out.println("틀렸습니다 TT");
		
	}

}
