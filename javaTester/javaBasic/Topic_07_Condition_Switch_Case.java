package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_07_Condition_Switch_Case {
	Scanner input = new Scanner(System.in);

	@Test(enabled = false)
	public void TC_01() {

		System.out.println("Nhập số nguyên từ 1-5: ");
		int n = input.nextInt();
		switch (n) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Nhập trong khoảng từ 1-5");

		}

	}

	@Test
	public void TC_02() {
		System.out.println("Nhập số nguyên a ");
		int a = input.nextInt();
		System.out.println("Nhập số nguyên b ");
		int b = input.nextInt();
		System.out.println("Nhập phép toán +,-,*,/ ");
		String phep_Toan = input.next();
		int result;

		switch (phep_Toan) {
		case "+":
			System.out.println(a + " + " + b + "= " + (result = a + b));
			break;
		case "-":
			System.out.println(a + " - " + b + "= " + (result = a - b));
			break;
		case "*":
			System.out.println(a + " * " + b + "= " + (result = a * b));
			break;
		case "/":
			System.out.println(a + " / " + b + "= " + (result = a / b));
			break;
		default:
			System.out.println("Nhập đúng!!!");

		}
	}
}



