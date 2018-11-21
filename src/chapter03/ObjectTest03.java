package chapter03;

public class ObjectTest03 {
	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		// == : 두 객제의 동일성
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals() : 두 객제의 동질성
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		//String Test
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		//시스템 기반으로 되어있는 hashCode()
		System.out.println(s1.hashCode() + ":" + s2.hashCode());
		
		//주소 기반으로 되어있는 hashCode() >> 다르게 나옴 
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));
	
		//동일한 객체
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
		
	}
}
