package chapter03;

public class WrapperClassTest2 {
	
	public static void main(String [] args) {
		
		String s = "12345";
		//원하는 결과 : 12345
		int i = Integer.parseInt(s);		//String 을 int로 형변환
		System.out.println(i);//출력결과 : 12345
		
		String s2 = String.valueOf(i);		//int 를 String 으로 형변환
		System.out.println(s2);//출력결과 : 12345
		
		int num = Character.getNumericValue('A'); //16진수로 A가 16인 헥사값
		System.out.println(num);//출력결과 : 10
		
		String bi = Integer.toBinaryString(15);  // 1또는 0인 2진수인 bit 값
		System.out.println(bi);//출력결과 : 1111
		
		String hex = Integer.toHexString(255);	// 16진수
		System.out.println(hex);//출력결과 : ff
	}

}
 