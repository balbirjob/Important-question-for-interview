package Array;

import java.util.Scanner;

public class SumOfAllArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of an array : ");
		int lenght = s.nextInt();
		int arr[] = new int[lenght];
		System.out.println("Enter element of an array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		s.close();

		Test3 t = new Test3();
		int res3 = t.method(arr);
		System.out.println("Sum of all Array element is  : " + res3);

	}

}

class Test3 {
	int method(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}
}
