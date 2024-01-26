package Array;

import java.util.Scanner;

public class ProductOfAllArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of an Array : ");
		int length = s.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter element of an Array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		
		Test4 t=new Test4();
		int res =t.method(arr);
		System.out.println("Product of Array element are : "+res);
				

	}

}

class Test4 {
	int method(int arr[]) {
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product= product * arr[i];
		}

		return product;
	}
}