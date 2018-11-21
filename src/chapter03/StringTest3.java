package chapter03;

public class StringTest3 {

	public static void main(String[] args) {
		String s = "aBcAbcabcABC";
		
		System.out.println(s.length());	//출력결과 : 12
		System.out.println(s.charAt(2));	//출력결과 : c
		System.out.println(s.indexOf("abc")); //출력결과 : 6  => 6번째에 있다.
		System.out.println(s.indexOf("abc", 7)); //출력결과 : => abc가 7번째에 있지 않아서 -1
		System.out.println(s.substring(3)); //출력결과 : AbcabcABC : => 4번째부터  끝까지 가져옴
		System.out.println(s.substring(3, 6)); //출력결과 : Abc :=> 4번째부터 6번째까지 가져옴 
		
		String a = "   ab cd      ";
		String b = "efg,dewdeq,dwq";
		
		String c = a.concat(b);
		System.out.println(c); //출력결과 : ab cd      efg,dewdeq,dwq   :=> a와 b를 연결

		//equals를 사용할 때 주의할점
		String s6 = "";
		System.out.println(equlaHello(null));//출력결과 : false
		System.out.println("---" + a.trim() + "---"); //출력결과 : ---ab cd---  :=> 앞뒤의 공백이 사라짐
		System.out.println("---" + a.replaceAll(" ", "") + "---"); //출력결과 : ---abcd---  :=> 공백문자 다 없음으로 바꿈
		String[] t = c.split(",");
		for(String k : t) {
			System.out.println(k); 
		}
		//출력결과 :   ab cd      efg 
		//출력결과 :dewdeq
		//출력결과 :dwq  
		//for문으로 출력 
		
		// + 연산자
		String str = "Hello" + " World" + " Java"; // 출력결과 :  Hello World Java  // StringByffer를 여러번 생성함. //메모리 할당이 많아지면서 추후 나중에 속도 저하 우려.
		String str1 = new StringBuffer("Hello").append(" World").append(" Java").toString(); //출력결과 : Hello World Java // StringByffer 를 한번만 생성함.  //메모리 할당이 적다. 
		
		//계속해서 StringBuffer 생성으로 인해 메모리 할당량이 높아짐 
		String str2 ="";
		for(int i = 0; i<100000; i++) {
			str2 = str2 + i;
		}
		
		//계속해서 StringBuffer 생성을 한번만 함으로써 메모리 할당량이 위의것보단 적다.
		StringBuffer str3 = new StringBuffer("");
		for(int i = 0; i<100000; i++) {
			str3.append(i);
		}
		
		System.out.println(str);
		System.out.println(str1);
	}

	private static boolean equlaHello(String s) {
//		return s.equals("hello");	//error : java.lang.NullPointerException
		return "hello".equals(s);
	}
}
