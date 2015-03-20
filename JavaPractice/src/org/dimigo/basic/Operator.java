package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9, b= 10;
		double h = 5.8;
		double h2 = 5.4;
		double area1 =( (a+b) * h) /2;
		double area2 = a * h2;
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 :  " +area1);
		System.out.println("평행사변형 넓이 :  " +area2 + "\n\n");
		if(area1>area2)
		System.out.println("사다리꼴이 평행사변형보다 " +(area1-area2)+" 더 큽니다");
		else
			if(area1<area2)
				System.out.println("평행사변형이 사다리꼴보다" +(area2-area1) + " 더 큽니다");
		
			else
				System.out.println("두 도형의 넓이가 같습니다");
		
		}
	}


