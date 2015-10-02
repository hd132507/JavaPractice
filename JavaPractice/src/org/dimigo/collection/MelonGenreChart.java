/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * <pre>
 * org.dimigo.collection
 * |_MelonGenreChart
	1. 개요 : 
	2. 작성일 :  2015. 9. 23.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Music> ballad = new ArrayList<Music>();
			ballad.add(new Music("내 첫사랑","베리굿"));
			ballad.add(new Music("또 다시 사랑","임창정"));
			ballad.add(new Music("부산에 가면","박진영"));
			
			List<Music> dance = new ArrayList<Music>();
			dance.add(new Music("커피","유재환,김예림"));
			dance.add(new Music("지우고 지워도","차수정"));
			Map<String, List<Music>> music = new HashMap<String, List<Music>>();
			music.put("발라드", ballad);
			music.put("댄스", dance);
			
			System.out.println("----<<멜론 장르별 차트>>----");
			printMap(music);
			System.out.println("----<<발라드 3위 곡 변경>>----");
			ballad.set(2, new Music("지우고 지워도","차수정"));
			printMap(music);
			System.out.println("----<<발라드 1위 곡 삭제>>----");
			ballad.remove(0);
			printMap(music);
			
			System.out.println("----<<전체 리스트 삭제>>----");
			music.clear();
			ballad.clear();
			
	}
	public static void printMap(Map<String,List<Music>> map)
	{
	
		for(String key : map.keySet())
		{
			int i = 1;
			System.out.println("["+key+"]");
			for(Music a : map.get(key))
			{
				System.out.println(i+"."+a);
				i+=1;
			}
		}
	}
}
