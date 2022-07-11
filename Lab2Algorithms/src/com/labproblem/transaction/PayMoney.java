package com.labproblem.transaction;

import java.util.Scanner;

public class PayMoney {
	
	public static void main(String []args) {  //throws Exception {
		

        System.out.println("Enter the size of the transaction array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] =  new int [size];// declaring array literals
        
        System.out.println("Enter the values of the array:");
       for (int i=0;i<size;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("Enter the total no. of targets need to be achieved;");
       int target = sc.nextInt();
       while (target --!=0) {
    	   
    	   int flag = 0;
    	   long target1 ;
    	   System.out.println("Enter the value of the target:");
    	   target1 = sc.nextInt();
    	   
    	   long sum =0;
    	   for(int i=0;i<size;i++)
    	   {
    		   sum = sum+arr[i];
    		   if (sum>=target1) {
    			   System.out.println("Target achieved after"+(i+1)+"transactions");
    			   flag=1;
    			   break;
    		   }}
    	   if (flag==0) {
    		   System.out.println("Given target is not achieved.");
    		   }
    		   
    	   }
    		
    	   
    	   
       }
		
	}


