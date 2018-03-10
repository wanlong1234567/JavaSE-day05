package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections�ṩ��һ�����ص�sort���������Ե���
 * ָ��һ���Ƚ���(Comparator)����sort���������
 * �ñȽ�������ıȽϹ������Լ�������
 * @author adminitartor
 *
 */
public class Collections_sort4 {
	public static void main(String[] args) {
		List<String> list 
			= new ArrayList<String>();
		list.add("����ʦ");
		list.add("����");
		list.add("С����ʦ");
		System.out.println(list);
		/*
		 * �����ַ��Ķ�������
		 * 
		 * �ڶ������򷽷����ڴ����˶���ıȽ��������Բ���
		 * Ҫ��Ԫ�ر���ʵ��Comparable�ӿڣ����������˶�
		 * ��������롣����:
		 * ����Ҫ�����Զ�������Ԫ�أ�����java�ṩ�����
		 * �ȽϹ�����������Ҫ��ʱ��Ӧ��ʹ����������ʽ
		 * 
		 */
		Collections.sort(list, new Comparator<String>(){
			public int compare(String o1, String o2) {
				int olen1 = o1.length();
				int olen2 = o2.length();
				return olen1-olen2;
			}
		});
		System.out.println(list);
	}
}







