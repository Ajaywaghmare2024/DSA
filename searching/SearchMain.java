package com.searching;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			Searching search= new Searching();
			int arr[]= {11,78,85,96,45,63,41,42,78,63};
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter the option");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("bobble sort");
				     search.bobbleSort(arr);
					
					System.out.println("Enter the data:");
                     int data= search.BinarySearch(arr, sc.nextInt());
                     System.out.println(data);
                      
					break;

				default:
					break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
