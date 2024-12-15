package com.java.Sortings;

public class Bubble_Sort {
public static void main(String[] args) {
	 int arr[] = {12, 3, 9, 834, 903, 5, 234, 456, 349, 459, 674, 793, 830, 920};
	 int length = arr.length;
	 System.out.print("Un-Sorted Array : ");
	 for(int i=0;i<length;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println();
	 for(int i=0;i<length-1;i++) {
		 for(int j=0;j<length-1-i;j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp = arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
			
		 }
	 }
	 System.out.print("Sorted Array : ");
	 for(int i=0;i<length;i++) {
		 System.out.print(arr[i]+" ");
	 }
}
}
