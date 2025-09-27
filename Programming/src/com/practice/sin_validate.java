package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class sin_validate {

	    public static boolean validateSIN(int[] sin) {
	        int sum = 0;

	        for (int i = 0; i < sin.length; i++) {
	            int digit = sin[i];

	            // Double every second digit from the left (i.e., 2nd, 4th, 6th, 8th positions)
	            if ((sin.length-1-i) % 2 == 1) {
	                digit *= 2;
	                if (digit > 9) {
	                    digit -= 9;
	                }
	            }
	            sum += digit;
	        }

	        return sum % 10 == 0;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] sin = new int[9];
	        
	        
	        System.out.print("Enter 9-digit SIN: ");
	        String digit=sc.nextLine();
	        
	        
	        if(digit.length()!=9)
	        {
	        	System.out.println("the length must be in 9");
	        	return;
	        }
	        
	        	
	        	for(int i=0;i<digit.length();i++)
	        	{
	        		char ch=digit.charAt(i);
	        		if(ch>='0' && ch<='9')
	        		{
	        			  sin[i] = ch-'0';
	        			 
		            } else {
		                System.out.println("Enter only digits from 0 to 9");
		                return;
		            }
	        		
	        	}
	        
	        

	        if (validateSIN(sin)) {
	            System.out.println("InValid SIN number." +Arrays.toString(sin));
	        } else {
	            System.out.println("Valid SIN number."+Arrays.toString(sin));
	        }

	        sc.close();
	    }
	}
