// Q.23

import java.util.Scanner;


public class BinToHex 
{

    public static void main(String[] args)
{
	System.out.print("Enter Binary num up to 16 bits:");
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
       
        String hex[] = {"0","1","2","3","4","5","6","7","8","9","A", "B", "C", "D", "E", "F"};
        String bin[] = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        String s1 ="";
	String num ="";
    
        int rem;
        while (b1 > 0)							//b1=0001
	 {
            rem = b1 % 10000;						// rem=0001
            b1 = b1 / 10000;
            num = "" + rem;						//num=0001
            if (num.length() < 4) 
		{
                String zero = "0";
                num = zero + num;
           	}

            int a = 0,b = 0;

            for (int i = 0; i < bin.length;i++)	
		 { 
                  String b2 = bin[i];					//b2=0000 //b2=0001
                  String b3 = hex[i];					//b3=0	  //b3=1
                  for (int j = 0; j < num.length();j++) 
		 { 
                    char c = num.charAt(j);				//num=0001 //num=0001
                    char d = b2.charAt(j);				//b2= 0000 //b2= 0001
                    a = ((int) (c));
                    b = ((int) (d));
                    if (a != b)
                        break;
                }
                if (a == b)
                    s1 = b3 + s1;
		}

         }
        System.out.println("Hex Value is:"+ s1);
        }

    }