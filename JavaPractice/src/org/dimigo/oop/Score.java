/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_Score
	1. 개요 : 
	2. 작성일 :  2015. 5. 14.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력=> ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력=> ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		int sum = eng+kor +math;
		double avg = sum/3.0;
		StringBuilder subject = new StringBuilder()
		.append("국어 점수 : " +kor+"점\n")
		.append("수학 점수 :  " +math+"점\n")
		.append("영어 점수 : "+eng+"점\n")
		.append("총점 : "+sum+"점\n")
		.append("평균 : "+String.format("%.1f", avg)+"점");
		System.out.println(subject);
	}

}
