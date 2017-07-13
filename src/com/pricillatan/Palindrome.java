package com.pricillatan;

public class Palindrome {
	
	public static void main (String[] args){
		 
		 String [] listStrings = {"noon", "Madam I'm Adam" ,"A man, a plan, a canal, Panama", "A Toyota","Not a Palindrome","asdfghfdsa"};
		 
		 for(String str: listStrings){
			 String removeSpecial = replaceSpecialChars(str);
			 System.out.println("{str="+str+",removeSpecial="+removeSpecial+",isPalindrome="+isPalindrome(removeSpecial.toUpperCase())+"}");
		 }
		 
	}
	
	public static String replaceSpecialChars(String str){
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	public static boolean isPalindrome(String s) {
        return s.length() <= 1 ||
            (s.charAt(0) == s.charAt(s.length() - 1) &&
             isPalindrome(s.substring(1, s.length() - 1)));
    }
}
