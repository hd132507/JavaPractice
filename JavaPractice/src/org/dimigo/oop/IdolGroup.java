/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_IdolGroup
	1. 개요 : 
	2. 작성일 :  2015. 5. 28.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] idolGroup = {"빅뱅","2NE1","걸스데이"};
			String[][] member = {{"GD","태양","대성","탑","승리"},{"CL","산다라박","박봄","민지"},{"유라","혜리","소진","진아"}};
			/*for(int i =0;i<3;i++)
			{
				System.out.println("<<"+idolGroup[i]+" 멤버>>");
				for(String[] value1 : member)
				{
					for(String value2 : value1)
					{
						System.out.println(value2);
					}
					System.out.println();
				}
			}*/
			for(int i =0; i<3;i++)
			{
				System.out.println("<<" +idolGroup[i]+ "멤버>>");
				for(int j =0;j<member[i].length; j++)
				{
					System.out.println(member[i][j]);
				}
			}
		
			
	}

}
