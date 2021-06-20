/*
Recursive program to find the Sum of the series 1 – 1/2 + 1/3 – 1/4 … 1/N Given a positive integer N, the task is to find the sum of the series 1 – (1/2) + (1/3) – (1/4) +…. (1/N) using recursion.

*/


import java.io.*;
import java.util.*;

public class RecusiveSeriesAdd {
    
        
       static  float method(int i,int n, float s)
         {
        
            if (i>n)
            {
                return s;
            }
            else
            {
                if(i%2==0)
                {
                    s = s - (float)1/i;

                }
                else
                {
                    s = s + (float)1/i;
                }
            return method(i+1,n,s);
            }
        }       
 
    public static void main(String[] args) {
 
        float a = method(1 , 3 , 0);
        
        System.out.printf("%f",a);
   
    
    }
}