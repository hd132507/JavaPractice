package org.dimigo.basic;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 12;
		if(age < 0)
		{
		 System.out.println("나이는 양수만 가능합니다");
		 return;
		}
		if(age>=0 && age<=6) {
		 System.out.println("유아기입니다");
		}
		 else if(age<= 12)
		 {
			 System.out.println("아동기입니다");
		 }
		 else if(age<=15)
		 {
			 System.out.println("사춘기입니다.");
		 }
		 else if(age<=24)
		 {
			 System.out.println("청년기입니다. ");
		 }
		 else
		 {
			 System.out.println("청년입니다");
		 }
		
		int i = 5;
		if(i>10){
			if(i<100)
				System.out.println("10보다 크고 100보다 작습니다");
		}
			else{
				System.out.println("10보다 작거나 같다");
			}
		}
	}


