package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		//메모리 사용량이 위의 new Integer보단 적기때문에 아래처럼 사용함.
		Integer k = 1;
		
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		System.out.println(i);	//출력결과:1
		System.out.println(c);	//출력결과:c
		System.out.println(b);	//출력결과:true
		
		
		Integer i2 =10;  //Auto Boxing => 자동으로 Boxing을 시켜줌으로써 메모리를 아껴쓸수 있다. 기본 Integer타입으로 사용하면 됨.

		int j0 = i2.intValue() + 20;//  => 메소드를 호출한경우 
		System.out.println(j0);//출력결과:30  
		
		int j1 = i2 + 20;	//Auto UnBoxing => 메소드를 호출하지 않은 경우, 대부분 사용하는 방법
		System.out.println(j1);//출력결과:30
	}

}
