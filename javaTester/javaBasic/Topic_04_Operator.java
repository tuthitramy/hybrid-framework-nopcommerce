package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_04_Operator {
	@Test(enabled = false)
	public void TC_01() {
		Scanner input = new Scanner(System.in);

		System.out.println("Input name: ");
		String name = input.next();

		System.out.println("Input age: ");
		int age = input.nextInt();

		System.out.println("After 15 years, age of " + name + " " + "will be " + (age + 15));

	}

	@Test(enabled=false)
	public void TC_02() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a: ");
		int a = input.nextInt();
		System.out.println("Input b: ");
		int b = input.nextInt();
		System.out.println("After swapping then " + "a= " + b + " ,b= " + a);

	}

	@Test
	public void TC_03() {
		Scanner input = new Scanner (System.in);
		System.out.println("Input a: ");
		int a = input.nextInt();
		System.out.println("Input b: ");
		int b = input.nextInt();
		if(a>b) {
			System.out.println("True");}
		else {
				System.out.print("false");
			}
		}

	}


