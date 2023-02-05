package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_06_Condition_If_Else {
	Scanner input = new Scanner(System.in);

	@Test(enabled = false)
	public void TC_01() {

		System.out.println("Nhập số nguyên n: ");
		int n = input.nextInt();
		if (n % 2 == 0) {
			System.out.println("n là số chẵn");

		} else {
			System.out.println("n là số lẻ");
		}

	}

	@Test(enabled = false)
	public void TC_02() {
		System.out.println("Nhập số nguyên a: ");
		int a = input.nextInt();
		System.out.println("Nhập số nguyên b: ");
		int b = input.nextInt();
		if (a >= b) {
			System.out.println("a lớn hơn hoặc bằng b");
		} else {
			System.out.println("a nhỏ hơn b");
		}

	}

	@Test(enabled = false)
	public void TC_03() {
		System.out.println("Nhập tên của bạn thứ 1");
		String member_01 = input.next();

		System.out.println("Nhập tên của bạn thứ 2");
		String member_02 = input.next();
		if (member_01.equals(member_02)) {
			System.out.println("2 bạn này cùng tên nè! ");
		} else {
			System.out.print("2 bạn này khác tên nà");
		}
	}

	@Test(enabled = false)
	public void TC_04() {
		System.out.println("Nhập số nguyên thứ 1");
		int a = input.nextInt();

		System.out.println("Nhập số nguyên thứ 2");
		int b = input.nextInt();

		System.out.println("Nhập số nguyên thứ 3");
		int c = input.nextInt();

		int[] myNum = { a, b, c };
		for (int i = 0; i < 3; i++) {
			if (a > b && a > c) {
				System.out.println(a + " là số lớn nhất");
			} else if (b > a && b > c) {
				System.out.println(b + " b là số lớn nhất");

			} else {
				System.out.println(c + " c là số lớn nhất");
			}
		}
	}
	@Test(enabled = false)
	public void TC_05() {
		System.out.println("Nhập số nguyên thứ a");
		int a = input.nextInt();
			if (a >=10 && a <= 100) {
				System.out.println(a + " nằm trong khoảng [10,100]");}

			else {
				System.out.println(a + " không nằm trong khoảng [10,100]");
			}
		}
	@Test(enabled = false)
	public void TC_06() {
		System.out.println("Nhập điểm số của sinh viên:");
		double a = input.nextDouble();
			if (a >=0 && a <5) {
				System.out.println("Sinh viên đạt điểm D");}

			else if (a>=5 && a<7.5) {
				System.out.println( "Sinh viên đạt điểm C");
			}

			else if (a>=7.5 && a<8.5) {
				System.out.println("Sinh viên đạt điểm B");
			}
			else if (a>=8.5 && a<10) {
				System.out.println("Sinh viên đạt điểm A");
			}
			else {
				System.out.println("Vui lòng nhập điểm số từ 0 đến 10");

			}
		}
	@Test
	public void TC_07() {
//		System.out.println("Số ngày của tháng: ");
//		int a = input.nextInt();

//		int[] day_31 = { 1, 3, 5, 7, 8, 10, 12 };
//
//
//		int[] day_30 = [ 4, 6, 9, 11];
//
//			if (a==day_31) {
//				System.out.println("Sinh viên đạt điểm D");}
//
//			else if (a>=5 && a<7.5) {
//				System.out.println( "Sinh viên đạt điểm C");
//			}
//
//			else if (a>=7.5 && a<8.5) {
//				System.out.println("Sinh viên đạt điểm B");
//			}
//			else if (a>=8.5 && a<10) {
//				System.out.println("Sinh viên đạt điểm A");
//			}
//			else {
//				System.out.println("Vui lòng nhập điểm số từ 0 đến 10");
//
//			}
//		}


		System.out.println("Số ngày của tháng: ");
		int a = input.nextInt();

		int[] day = { 31, 29,30, 31, 30 };
//		int[] c = {1, 2, 3, 4, 5};

		System.out.println("IN RA LA: " + day[a -1]);




	}
}
