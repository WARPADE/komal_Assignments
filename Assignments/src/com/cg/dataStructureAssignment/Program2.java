package com.cg.dataStructureAssignment;
public class Program2 {

	public static void main(String[] args) {
		
		int from = 100, to = 999;

		for (int number = from + 1; number < to; ++number) {
			int digits = 0;
			int result = 0;
			int originalNumber = number;

			while (originalNumber != 0) {
				originalNumber /= 10;
				++digits;
			}
			originalNumber = number;

			while (originalNumber != 0) {
				int remainder = originalNumber % 10;
				result += Math.pow(remainder, digits);
				originalNumber /= 10;
			}
			if (result == number) {
				System.out.print(number + " ");
			}
		}
	}

}
















//package com.cg.assignment01;
//
//public class Armstrong2 {
//	public static void main (String [] args)
//             {
//                   //Program to find armstrong number from 100 to 999
//                   //153, 370, 371, 407
//
//                    for (int k = 100 ; k <= 1000 ; k++)
//                     {
//                                int n = k;
//                                int d = 0;
//                                int s = 0;
//
//                                while (n > 0)
//                                 {
//                                             d = n % 10;
//                                             s = s + (d * d * d);
//                                             n = n / 10;
//                                 }
//                                 if (k == s)
//                                  {
//                            System.out.println (k + " is Armstrong number");
//                                   }
//                      }
//            } // main method
//} // Armstrong class
//
//
















//public class armstrong2 {
//    public static void main(String[] args) {
//        for (int n = 100; n <1000; n++) {
//            int sum=0;
//            int i=n;
//            while(i>0){
//                int dif=i%10;
//                sum = sum+dif*dif*dif;
//                i/=10;
//            }
//            if(n==sum){
//                System.out.println("The following is an armstrong number: "+n);
//            }
//        }
//    }
//}













