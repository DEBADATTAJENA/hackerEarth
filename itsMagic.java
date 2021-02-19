package hearth;

import java.util.Scanner;

public class itsMagic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int temp=0;
		int min = 1000;
		int minIndex=-1;
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum = sum+arr[i];
		}
		for(int i=0;i<n;i++) {
			temp = sum-arr[i];
			if(temp%7==0 && min>arr[i]) {
				min = arr[i];
				minIndex =i;
			}
		}
		System.out.println(minIndex);
		
	}

}
