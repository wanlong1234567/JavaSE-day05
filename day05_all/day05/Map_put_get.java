package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map ���ұ� 
 * ��key-value�Ե���ʽ���Ԫ�ء����Կ���������
 * һ���������еı��
 * 
 * MapҪ��key�������ظ�(equals�Ƚ�Ϊtrue)��
 * ����ʵ����:
 * java.util.HashMap
 * ɢ�б�ʹ��ɢ���㷨ʵ�ֵ�Map
 * 
 * @author adminitartor
 *
 */
public class Map_put_get {
	public static void main(String[] args) {
		Map<String,Integer> map 
			= new HashMap<String,Integer>();
		/*
		 * V put(k k ,V v)
		 * ��������key-value�Դ��뵽Map��
		 * ��������key��Map���Ѿ����ڣ�����MapҪ��
		 * key�������ظ���������ʱΪ�滻value����
		 * ����ֵΪ���keyԭ����Ӧ��valueֵ��
		 * ��key��Map�в����ڣ��򷵻�ֵΪnull
		 */
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		
		System.out.println(map);
		//ʹ����ͬ��key���滻value����
		Integer num = map.put("��ѧ", 95);
		System.out.println(map);
		System.out.println("���滻ֵ:"+num);
		
		
		/*
		 * V get(K k)
		 * ���ݸ�����key��ȡ��Ӧ��value����
		 * ������key�ڵ�ǰMap�в����ڣ��򷵻�
		 * ֵΪnull
		 */
		num = map.get("����");
		System.out.println("����:"+num);
		
	}
}








