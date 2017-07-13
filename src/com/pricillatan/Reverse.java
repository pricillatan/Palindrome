package com.pricillatan;

import java.util.Scanner;

public class Reverse{

	public static void main(String [] args){
		//input number to reverse
		boolean isContinue=true;
		do{
			System.out.println("===============================");
			System.out.println("|        Welcome!! Menu       |");
			System.out.println("-------------------------------");
			System.out.println("|    1 - Reverse Number       |");
			System.out.println("|    2 - Reverse String       |");
			System.out.println("|    0 - Exit                 |");
			System.out.println("===============================");
			int option = new Scanner(System.in).nextInt();
			
			switch(option){
			case 1:{
				 System.out.println("Please enter number to be reversed: ");
			     int number = new Scanner(System.in).nextInt();
			     int reverse = reverse(number);
			     System.out.println("Reverse of number: " + number + " is " + reverse); 
			     break;
				}
			case 2:{
				System.out.println("Please enter String to be reversed: ");
			    String str = new Scanner(System.in).nextLine();
			    String reverse = reverseString(str);
			    System.out.println("Reverse of number: " + str + " is " + reverse); 
			    break;
				}
			default:{
				System.exit(0);
				}
			}	       
		}while(isContinue);
	}
	
	public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
          
        }while(number > 0);
      
        return reverse;
    }
	
	
	public static String reverseString(String str){
		System.out.println("reverseString - str=["+str+"]");
		if(str.length()<2)
			return str;
		return reverseString(str.substring(1))+ str.charAt(0);
	}

}
