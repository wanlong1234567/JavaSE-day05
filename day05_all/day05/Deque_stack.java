package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ʹ��˫�˶���ʵ��ջ�ṹ
 * ��������˫�˶��е�һ�˽����ӷ���ʱ��ʵ����ջ����
 * 
 * ˫�˶���Ϊջ�ṩ����Ӧ����:push,pop 
 * @author adminitartor
 *
 */
public class Deque_stack {
	public static void main(String[] args) {
		Deque<String> stack 
			= new LinkedList<String>();		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");		
		System.out.println(stack);		
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		for(String s : stack){
			System.out.println(s);
		}
		System.out.println(stack);
		
		while(stack.size()>0){
			String s = stack.pop();
			System.out.println(s);
		}
		System.out.println(stack);
	}
}















