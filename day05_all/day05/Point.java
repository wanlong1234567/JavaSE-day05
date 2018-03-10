package day05;
/**
 * ʹ�ø��������Ϊ����Ԫ�ض��Զ���Ԫ�ص�����
 * @author adminitartor
 *
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	public Point(){
		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * ʵ��Comparable�ӿں���Ҫ��д����compareTo
	 * �÷������������嵱ǰ����(this)���������(o)
	 * ֮��Ĵ�С��ϵ��
	 * ����ֵ����ע����ȡֵ��ֻ��עȡֵ��Χ:
	 * ������ֵ>0:��ǰ������ڲ�������(this>0)
	 * ������ֵ<0:��ǰ����С�ڲ�������
	 * ������ֵ=0:�����������
	 */
	public int compareTo(Point o) {
		/*
		 * �㵽ԭ�����ų��Ĵ�
		 */
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}


}









