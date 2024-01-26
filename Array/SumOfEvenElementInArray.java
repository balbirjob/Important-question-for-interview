package Array;

import java.util.Scanner;

public class SumOfEvenElementInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of element :");
		int x =s.nextInt();
		System.out.println("Enter element of an Array:");
		int arr[] = new int[x];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=s.nextInt();
		}
		
         s.close();
         Test t=new Test();
         int res =t.method(arr);
         System.out.println("Sum of Even index element : "+res);
	}

}


class Test{
	 int method(int arr[]) {
		int sum =0;
		for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]%2 == 0) {
			sum +=arr[i];
		}
	}
	return sum;
	}
	
}


