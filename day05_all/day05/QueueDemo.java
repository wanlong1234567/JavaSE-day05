package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ����
 * ���п��Դ��һ��Ԫ�أ���ȡԪ�ر�����ѭ:FIFO
 * ��:First Input First Output �Ƚ��ȳ�
 * 
 * Queue�ӿڼ̳���Collection
 * @author adminitartor
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue
			= new LinkedList<String>();
		/*
		 * boolean offer(E e)
		 * ��Ӳ�����������Ԫ����ӵ�����ĩβ
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		queue.offer("six");
		System.out.println(queue);
		/*
		 * E poll()
		 * ���Ӳ�����ȡ������Ԫ�أ�ȡ�����Ԫ��
		 * �ʹӶ����б�ɾ����
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek()
		 * ���ö���Ԫ�أ���ȡ����Ԫ�أ����Ǹ�Ԫ��
		 * ���ڶ�����
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * ʹ�õ�������������Ԫ�أ�Ԫ�ػ��ڶ�����
		 */
		for(String s : queue){
			System.out.println(s);
		}
		System.out.println(queue);
		
		while(queue.size()>0){
			String s = queue.poll();
			System.out.println(s);
		}
		System.out.println(queue);
	}
}






