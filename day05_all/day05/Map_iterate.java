package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * ����Map�����ַ�ʽ��
 * 1:�������е�key
 * 2:�������еļ�ֵ��(Entry)
 * 3:�������е�value(��Բ�����)
 * @author adminitartor
 *
 */
public class Map_iterate {
	public static void main(String[] args) {
		Map<String,Integer> map 
			= new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		
		/*
		 * �������е�key
		 * Set<K> keySet()
		 * ����ǰMap�����е�key����һ��Set���Ϻ�
		 * ���ء������ü��ϵ�ͬ�ڱ�����Map�����е�
		 * key��
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println("key:"+key);
		}
		
		/*
		 * ��ȡÿһ���ֵ��
		 * Set<Entry> entrySet()
		 * Map��ÿһ���ֵ����һ��Entry��ʵ��
		 * ���档
		 * Entry��Map���ڲ��࣬�ṩ������
		 * ���õķ���:getKey(),getValue()
		 */
		Set<Entry<String,Integer>> entrySet 
							= map.entrySet();
		
		for(Entry<String,Integer> e : entrySet){
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * �������е�value
		 * 
		 * Collection values()
		 * ����ǰMap������value����һ�����Ϻ󷵻�
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value:"+value);
		}
	}
}






