package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����ַ���
 * @author adminitartor
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<String> list 
			= new ArrayList<String>();
		
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("С����ʦ");
		
		System.out.println(list);
		/*
		 * �ַ��������ǰ����ַ����ַ��ı���˳��
		 * ����ġ�
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}





