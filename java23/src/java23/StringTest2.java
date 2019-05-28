package java23;

public class StringTest2 {
	
	public static void main(String[] args) {
		String s1 = "I am a java programmer";
		String s2 = "I am a python programmer";
		String s3 = "2011511";
		String s4 = "9506091";
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(7));
		System.out.println(s3.charAt(0));
		StringBuffer buffer = new StringBuffer("hello");
		System.out.println(buffer.charAt(0));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 5));//1에서 5사이
		System.out.println(s1.substring(7, 11));//7에서 11사이
		String [] result = s1.split(" ");//공백으로 기준을 나눔
		System.out.println(result.toString());		
		for (String s : result) {
			System.out.println(s);
		}
		String s5 = "Hi, Good Morning!";
		String[] result2 = s5.split(" ");//공백으로 기준을 나눔
		System.out.println(result2.length);
		
		for (String s : result2) {
			System.out.println(s);
		}
		System.out.println("-----------");
		String s6 = "Hi, Good Morning!";
		String[] result3 = s6.split(",");//반점으로 기준을 나눔
		System.out.println(result3.length);
		
		for (String s : result3) {
			System.out.println(s);
		}
		
		System.out.println("-----------");
		String s7 = "Hi. Good Morning!";
		String[] result4 = s7.split("[.]");//점으로 기준을 나눔, 점을 사용시 대괄호 사용
		System.out.println(result4.length);
		
		for (String s : result4) {
			System.out.println(s);
		}
		System.out.println(s6.indexOf("Good"));
		String s8 ="http://www.naver.com/member/index.jsp";
		System.out.println(s8.indexOf("e", 4));
		System.out.println(s8.lastIndexOf("/"));
		System.out.println(s8.substring(s8.lastIndexOf("/")));
		
		System.out.println(s6.toUpperCase());//모두 대문자로 변경
		System.out.println(s6.toLowerCase());//모두 소문자로 변경
		
		String s66 = s6.replaceAll("Good", "best");//글자 내용 변경 Good에서 best로
		System.out.println(s66);
		char[] result6 = s6.toCharArray();
		for (char c : result6) {
			System.out.println(c);
		}
		String s9 = "   hello!! win!!    ";
		System.out.println(s9.trim());//공백 없애는 것
		
		String s10 = "winner class";
		System.out.println(s10.contains("class"));//"class"가 있는지 없는지 boolean으로 반환
		System.out.println(s10.startsWith("winner"));//시작하는 것이 "winner"인지 boolean으로 반환
		System.out.println(s10.endsWith("class"));//끝나는 것이 "class"인지 boolean으로 반환
		
		
	}
	
	
}
