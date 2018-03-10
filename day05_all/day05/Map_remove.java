package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * 删除元素
 * @author adminitartor
 *
 */
public class Map_remove {
	public static void main(String[] args) {
		Map<String,Integer> map 
			= new HashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		
		Integer num = map.remove("数学");
		System.out.println(map);
		System.out.println("对应的value:"+num);
	}
}
