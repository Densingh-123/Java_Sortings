package com.java.Sortings;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = {12, 3, 9, 834, 903, 5, 234, 456, 349, 459, 674, 793, 830, 920};
       int length = arr.length;
       System.out.print("Un-Sorted Array : ");
       for(int i=0;i<length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       System.out.println();
       for(int i=0;i<length-1;i++) {
    	   int min_index=i;
    	   for(int j=i+1;j<length;j++) {
    		   if(arr[min_index]>arr[j]) {
    			   min_index=j;
    		   }
    	   }
    	   int temp= arr[min_index];
    	   arr[min_index]=arr[i];
    	   arr[i]=temp;
       }
       System.out.print("Sorted Array : ");
       for(int i=0;i<length;i++) {
    	   System.out.print(arr[i]+" ");
       }
    }
}
