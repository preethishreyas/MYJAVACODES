package Preethi;

import java.util.Scanner;
public class BubbleSortDes {
	public static void main(String[] args) {
		int num,i,j,size;
		
		Scanner input = new Scanner(System.in);
//		System.out.println("Number of test cases:");
		num = input.nextInt();
		for(i=0;i<=num;i--){
		
//		System.out.println("Enter the Number of Array Size:");
		size=input.nextInt();
		
		int arr[] =  new int[num];
//		System.out.println("Enter the numbers of the integers:");
		
		for(i=0;i<num;i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(i);
			for(i=0;i<num-1;i++) {
				for(j=0;j<(num-1-i);j++) {
					if(arr[j] < arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1]=temp;
						
						
					}
				}
			}
//			System.out.println("Sorted Array in Descending Order : ");
			for(i=0;i<num;i++){
			System.out.print(arr[i] + " ");
			}
			}
	}
}
	


