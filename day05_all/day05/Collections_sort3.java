package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ�������Ԫ��
 * @author adminitartor
 *
 */
public class Collections_sort3 {
	public static void main(String[] args) {
		List<Point> list 
			= new ArrayList<Point>();
		
		list.add(new Point(5,6));
		list.add(new Point(3,2));
		list.add(new Point(1,7));
		list.add(new Point(8,2));
		list.add(new Point(9,4));
		System.out.println(list);
		/*
		 * sort����Ҫ�󼯺�Ԫ�ر���ʵ��
		 * Comparable�ӿڡ������޷��Ը�
		 * ��������
		 */
		Collections.sort(list);
		System.out.println(list);
		
	}
}



