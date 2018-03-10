package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ÅÅĞò×Ö·û´®
 * @author adminitartor
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<String> list 
			= new ArrayList<String>();
		
		list.add("²ÔÀÏÊ¦");
		list.add("·¶ÀÏÊ¦");
		list.add("Ğ¡ÔóÀÏÊ¦");
		
		System.out.println(list);
		/*
		 * ×Ö·û´®ÅÅĞòÊÇ°´ÕÕ×Ö·û´®×Ö·ûµÄ±àÂëË³Ğò
		 * ÅÅĞòµÄ¡£
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}





