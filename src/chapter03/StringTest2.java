package chapter03;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase(); // s1를 대문자로 변경
		String s4 = s2.concat("??"); 
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);	//출력 결과 : abc
		System.out.println(s2);	//출력 결과 : ABC
		System.out.println(s3);	//출력 결과 : def
		System.out.println(s4);	//출력 결과 : ABC??
		System.out.println(s5); //출력 결과 : !ABC@
		

	}

}
