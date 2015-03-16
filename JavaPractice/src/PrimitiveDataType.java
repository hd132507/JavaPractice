
public class PrimitiveDataType {
/***********************************
   *<<첫번째 수행평가>> ***
  	이름: 김의찬
  	제목 : 아이유 신상 출력
  	/*
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="아이유";
		boolean gender = true;
		int age = 23;
		double height = 161.8;
		double weight = 44.3;
		char bltype = 'A';
		System.out.printf("<<아이유 프로필>>\n");
		System.out.printf("이름 : %s\n",name);
		if(gender)
			System.out.println("성별 : 여자");
		else
			System.out.println("성별 : 남자");
		System.out.printf("나이 : %d세\n",age);
		System.out.printf("키 : %.1fcm\n",height);
		System.out.printf("몸무게 : %.1fkg\n",weight);
		System.out.printf("혈액형 : %c형\n",bltype);
	}

}
