package javaBasic;

import org.testng.annotations.Test;

public class Topic_03_Data_Type_Exercises {


	@Test
	public void TC_01() {
		int a = 6;
		int b = 2;
		int P1 = a + b;
		int P2 = a - b;
		int P3 = a * b;
		int P4 = a / b;

		System.out.println("Tổng của a và b là: " + P1);
		System.out.println("Hiệu của a và b là: " + P2);
		System.out.println("Tích của a và b là: " + P3);
		System.out.println("Thương của a và b là: " + P4);

	}

	@Test
	public void TC_02() {
		double chieu_Dai = 7.5;
		double chieu_Rong = 3.8;
		System.out.println("Diện tích hình chữ nhật: " + (chieu_Dai * chieu_Rong));

	}

	@Test
	public void TC_03() {
		String name = "Automation testing";
		System.out.println("Hello " + name);
	}
}
