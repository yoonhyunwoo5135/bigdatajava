package java16;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		//¼ø¼­°¡ Áß¿ä.
		ArrayList list = new ArrayList();
		list.add("±èµ¥ÀÌ");
		list.add("±è»çÀü");
		list.add("±è±¸Á¶");
		list.add("±èÀÚ·á");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "00¹øÀÇ °í°´ " + list.get(i));
		}
		System.out.println();
		System.out.println("200¹ø °í°´Àº Å»Åğ, 300¹ø °í°´Àº °³¸í");
		list.remove(1);
		list.set(2, "±èÃæ¼º");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 +  "00¹øÀÇ °í°´ " + list.get(i));
		}
		
		
//		list.remove(0);
//		System.out.println(list);//toString ÀçÁ¤ÀÇ
//		list.remove(1);
//		System.out.println(list);//toString ÀçÁ¤ÀÇ
//		list.remove("Á¤½ºÅ°");
//		System.out.println(list);//toString ÀçÁ¤ÀÇ
		
		
	}

}
