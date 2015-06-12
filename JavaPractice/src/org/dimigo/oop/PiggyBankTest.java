/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_PiggyBankTest
	1. 개요 : 
	2. 작성일 :  2015. 6. 12.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FamilyMember[] fm = {new FamilyMember("아빠"),
					new FamilyMember("엄마"),new FamilyMember("나"),
					new FamilyMember("남동생")};
			FamilyMember.printMemberCnt();
			PiggyBank.putMoney(fm[0], 10000);
			PiggyBank.putMoney(fm[1], 5000);
			PiggyBank.putMoney(fm[2], 2000);
			PiggyBank.putMoney(fm[3], 1000);
			PiggyBank.printBalance();
			PiggyBank.putMoney(fm[2], 1000);
			PiggyBank.printBalance();
			}
	}


