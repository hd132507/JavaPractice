package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance=10;
		String carkind = "고속버스";
		int price;
		if(distance<0)
		{
			System.out.println("유효하지 않은 값입니다");
		return;
		}
		System.out.println("<<고속도로 통행료 계산");
		System.out.println("거리 : " +distance);
		System.out.println("차량 : " +carkind);
		
		switch(carkind)
		{
		case "고속버스":
			price = 850;
			break;
		case "경차":
			price = 300;
			break;
		default :
			price = 600;
		}
		
		if(carkind == "고속버스")
			if(distance%10==0)
				price +=300 * ((distance/10-1));
			else
				price += 300 * (distance/10);

		
		else
			if((distance%10==0))
			{
			price += 200 * ((distance/10)-1);
			}
			else
				price += 200 *(distance/10);
		
		System.out.println("통행료 :  "+price);
	}
}
