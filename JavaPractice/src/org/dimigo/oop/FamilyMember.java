/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_FamilyMember
	1. 개요 : 
	2. 작성일 :  2015. 6. 12.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName)
	{
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName()
	{
		return this.memberName;
	}
	
	public static void printMemberCnt()
	{
		System.out.println("가족 총 인원수 : "+memberCnt+"명");
		System.out.println();
	}
}
