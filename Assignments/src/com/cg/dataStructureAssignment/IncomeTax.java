package com.cg.dataStructureAssignment;

import java.util.Scanner;

public class IncomeTax {

  public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        int ctc=s.nextInt();
		        if(ctc<=180000){
		            System.out.println("Taxed Amount: "+0);
		        }
		        if(ctc>181000&&ctc<300001){
		            System.out.println("Taxed Amount: "+ctc*0.1);
		        }
		        if(ctc>300000&&ctc<500001){
		            System.out.println("Taxed Amount: "+ctc*0.2);
		        }
		        if(ctc>500000&&ctc<1000001){
		            System.out.println("Taxed Amount: "+ctc*0.3);
		        }
		    }
		

}






//public class Program5 {
//
//	public static void main(String[] args) {
//		
//		double it,tax=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your CTC: ");
//		
//		double CTC=sc.nextDouble();
//		
//		if(CTC<=180000) 
//			tax=0;
//		
//		else if(CTC<=300000) 
//			tax=(CTC*0.1);
//		
//		else if(CTC<=500000) 
//			tax=(CTC*0.2);
//		
//		else 
//			tax=(CTC*0.3);
//		
//		System.out.println("CTC tax amount is "+tax);
//	}
//
//}
