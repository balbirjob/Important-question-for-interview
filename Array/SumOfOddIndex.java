package Array;

import java.util.Scanner;

public class SumOfOddIndex {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an array :");
		int length = s.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter element of an array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		s.close();

		Test2 t = new Test2();
		int res2 = t.method(arr);
		System.out.println("Sum of odd index element are :" + res2);

	}

}

class Test2 {
	int method(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 != 0) {
				sum += arr[i];
			}
		}

		
		return sum;
	}
}
