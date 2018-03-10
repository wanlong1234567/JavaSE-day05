package day05;
/**
 * Ӱ��ɢ�б��ѯ���ܵ�һ��������:��������
 * �����������һ����Ҫ������:
 * ��Ϊkey��Ԫ��hashcodeֵһ������equals�Ƚ�
 * ��Ϊtrue��
 * hashcodeֵһ��ʱ����Map�ڲ������λ����ͬ������
 * ��key����ͬ����ô�ͻ��ڸ�λ�ò���һ����������
 * ����������ݻή��HashMap�������ܡ�����Ҫ���⡣
 * 
 * �����API�ĵ���Ҳ��˵����equals��hashcode��
 * ��дҪ��:
 * 1:�ɶ���д����������дһ�����equals����ʱ����
 *   Ӧ����ͬ��дhashcode����
 * 2:һ����,��:����������equals�Ƚ�Ϊtrueʱ��
 *   hashcode�������ص�����Ӧ����ȡ���֮������
 *   ����hashcode��ȣ�equals�Ƚ�Ӧ��Ϊtrue��
 *   �������HashMap�в�������Ӱ���ѯ���ܡ�
 * 3:�ȶ���,��:��һ���������equals�Ƚϵ����Ե�
 *   ֵû�з����ı��ǰ���£���ε���hashcode
 *   ���ص�����Ӧ�����䡣     
 * 
 * @author adminitartor
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}







