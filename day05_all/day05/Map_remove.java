package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * ɾ��Ԫ��
 * @author adminitartor
 *
 */
public class Map_remove {
	public static void main(String[] args) {
		Map<String,Integer> map 
			= new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		
		Integer num = map.remove("��ѧ");
		System.out.println(map);
		System.out.println("��Ӧ��value:"+num);
	}
}
