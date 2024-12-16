package com.java.Sortings;

public class Selection_Sorting {
public static void main(String[] args) {
	 int arr[] = {12, 3, 9, 834, 903, 5, 234, 456, 349, 459, 674, 793, 830, 920};
	int length = arr.length;
	System.out.print("Un-Sorted Array : ");
	for(int i=0;i<length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=1;i<length;i++) {
		int key=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>key) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
	}
	System.out.print("Sorted Array : ");
	for(int i=0;i<length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
