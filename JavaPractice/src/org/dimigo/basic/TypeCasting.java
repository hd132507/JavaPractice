package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 1700000;
		int clerk = 3;
		int shop = 1500;
		long total = (long)salary * clerk * shop * 12L;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여  :  " +String.format("%,d원", salary));
		System.out.printf("점포 내 직원 수 : %d 명\n",clerk); 
		System.out.println("점포 수 :  "+String.format("%,d", shop));
		System.out.println("연간 인건비 :  "+String.format("%,d원", total));
	}
}