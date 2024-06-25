package com.sorting;

import java.util.Scanner;

public class Sorting {
     public static void bubbleSort(int []arr) {
    	 int n=arr.length;
    	 for(int i=0;i<n-1;i++) {
    		 for(int j=0;j<n-1-i;j++) {
    			 if(arr[j]>arr[j+1]) {
    				 int temp=arr[j];
    				 arr[j]=arr[j+1];
    				 arr[j+1]=temp;
    			 }
    		 }
    	 }
     }
     public static void display(int arr[]) {
    	 for(int d:arr) {
    		 System.out.print(d+" ");
    	 }
    		System.out.println();
		
	}
     
     public static void selectionSort(int arr[]) {
    	 int n=arr.length;
    	 for(int i=0;i<n-1;i++) {
    		 for(int j=i+1;j<n;j++) {
    			 if(arr[i]>arr[j]) {
    				 int temp=arr[i];
    				 arr[i]=arr[j];
    				 arr[j]=temp;
    			 }
    		 }
    	 }
    	 
     }
     
     
  
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Sorting sort=new Sorting();
		System.out.println("Enter the size elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enetr the ele:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean exit=false;
		while(!exit) {
 
			System.out.println("1.Bubble sort\n2.seletion Sort\n3.insertion sort");
			System.out.println("Enter the choice:");
			
		
		
		switch (sc.nextInt()) {
		case 1:
			    bubbleSort(arr);
			    display(arr);
			break;
		case 2:
			selectionSort(arr);
			display(arr);
			break;

		default:
			break;
		}
		
		}
		
	} 
}

 

