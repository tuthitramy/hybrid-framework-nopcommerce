package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_08_Loop_For {
	Scanner input = new Scanner(System.in);

	@Test(enabled = false)
	public void TC_01() {

		System.out.println("Nhập số nguyên bất kì: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");

		}

	}

	@Test(enabled = false)
	public void TC_02() {
		System.out.println("Nhập số nguyên a ");
		int a = input.nextInt();
		System.out.println("Nhập số nguyên b ");
		int b = input.nextInt();
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + " ");

			}
		} else {
			System.out.print("Nhập b>a bạn nhé ^^ ");
		}

	}

	@Test(enabled = false)
	public void TC_03() {
		int sum = 0;
		int i;

		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

		}
		System.out.print("Sum = " + sum);
	}

//				int num = 100, sum = 0;
//
//				for (int i = 1; i <= num; ++i) {
//					// sum = sum + i;
//					sum += i;
//				}
//
//				System.out.println("Sum = " + sum);
//			}

	@Test(enabled = false)
	public void TC_04() {
		System.out.println("Nhập số nguyên a ");
		int a = input.nextInt();
		System.out.println("Nhập số nguyên b ");
		int b = input.nextInt();
		int total = 0;
		for (int i = a; i <= b; i++) {
			total += i;

		}
		System.out.println("Total= " + total);

	}

	@Test(enabled = false)
	public void TC_05() {
		System.out.println("Nhập số nguyên n ");
		int n = input.nextInt();
		int total = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				total += i;
			}

		}
		System.out.println("Total= " + total);

	}

	@Test(enabled = false)
	public void TC_06() {
		System.out.println("Nhập số nguyên a ");
		int a = input.nextInt();
		System.out.println("Nhập số nguyên b ");
		int b = input.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}

		}

	}

	@Test
	public void TC_07() {
		System.out.println("Nhập số nguyên n ");
		int n = input.nextInt();
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact=fact*i;
		}
		System.out.print(fact);

	}

}
