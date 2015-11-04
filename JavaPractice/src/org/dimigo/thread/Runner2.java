/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * |_Runner
	1. 개요 : 
	2. 작성일 :  2015. 11. 4.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class  Runner2 implements Runnable {
	
	private String name;
	
	public Runner2(){
		
	}
	
	public Runner2(String name)
	{
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		try {
			for(int i = 100; i>=0; i-=10)
			{
				Thread.sleep(1000);
				if(i == 100)
					System.out.println(name + "출발");
				else if(i!=0)
					System.out.println(name+""+i+"미터");
				else
					System.out.println(name + "골인");
			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
