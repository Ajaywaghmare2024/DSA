package com.searching;

public class Searching {
	
	public static void bobbleSort(int arr[]) {
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
	public int BinarySearch(int arr[],int data) {
		 int low=0;
	     int high=arr.length-1;
	     int mid=0;
	     
	     while(low<=high) {
	    	 mid=(low+high)/2;
	    		 if(arr[mid]==data) {
		    		 return arr[mid];
		    	 }
		    	 else if(data<arr[mid]){
		    		 high=mid-1; 
		    	 }
		    	 else {
		    		 low=mid+1;
		    	 }
			}
	    	 
		return -1;
	}
    
}
