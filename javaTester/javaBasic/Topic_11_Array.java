package javaBasic;

import org.testng.annotations.Test;

public class Topic_11_Array {
	@Test(enabled = false)
	public void TC_01() {
		int[] arr = { 2, 7, 6, 8, 9 };
		int max = arr[0];
		for (int element : arr) {
			if (element > max) {
				max = element;

			}

		}
		System.out.print("Max number is " + max);

	}

	@Test(enabled = false)
	public void TC_02() {
		int sum = 0;
		int[] arr = { 2, 7, 6, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			sum = arr[0] + arr[4];

		}

		System.out.print(sum);
	}

	@Test(enabled = false)

	public void TC_03() {
		int[] arr = { 2, 7, 6, 8, 9, 16, 17, 20 };
		for (int element : arr) {
			if (element % 2 == 0) {
				System.out.print(element + " ");
			}

		}

	}

	@Test(enabled = false)
	public void TC_04() {

		int[] arr = { 3, -7, 2, 5, 9, -6, 10, 12 };
		int sum = 0;
		for (int element : arr) {
			if (element > 0 && element % 2 != 0) {
				sum += element;
			}

		}
		System.out.print("Tổng các số lẻ trong mảng: " + sum);

	}

	@Test(enabled = false)
	public void TC_05() {
		int[] arr = { 3, -7, 2, 5, 9, -6, 10, 12 };
		for (int element : arr) {
			if (element >= 0 && element <= 10) {
				System.out.print(element + " ");
			}

		}
	}

	@Test
	public void TC_06() {
		int[] arr = { 3, 5, 7, 30, 10, 5, 8, 23, 0, -5 };
		int sum = 0;
		float ave = 1;
		for (int element : arr) {
			sum += element;
			ave = (float) sum / 10;

		}
		System.out.println(" Tổng các số trong mảng: " + sum);
		System.out.println(" Trung bình cộng các số trong mảng: " + ave);

	}

	@Test(enabled = false)
	public void TC_07() {

	}
}
