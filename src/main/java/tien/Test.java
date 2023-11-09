package tien;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		A obj = new B();
//		obj.funa();
//		List a = new ArrayList<>();
//		int b[] = {1,2,3}; 

		int number = 8; // Thay đổi giá trị của số cần kiểm tra ở đây
		if ((number & 1) == 1) {
			System.out.println("So le");
		} else {
			System.out.println("So chan");
		}
		int a = 128;
		int b = 128;
		
		if (a == b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String s1 = "Hello";
		System.out.println(s1.hashCode());
		String s2 = "Hello";
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		Long a1 = (long) 1;
		Long a2 = (long) 1;
		System.out.println(a1==a2);
	}

}
