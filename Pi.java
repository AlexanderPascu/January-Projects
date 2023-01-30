/*
Programmer: Isaac Guzman
Program Name: Pi.java
Date: 01/20/2023
Version: 1.0
This finds out how many times each number appears in pi.
*/

import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Input String:");
      String x = scan.nextLine();
      int zeroCount = 0;
      int oneCount = 0;
      int twoCount = 0;
      int threeCount = 0;
      int fourCount = 0;
      int fiveCount = 0;
      int sixCount = 0;
      int sevenCount = 0;
      int eightCount = 0;
      int nineCount = 0;
      for(int i = 2; i<(x.length());i++)
      {
        if(x.substring(i,i+1).equals("0"))
        {
          zeroCount++;
        }
        if(x.substring(i,i+1).equals("1"))
        {
          oneCount++;
        }
        if(x.substring(i,i+1).equals("2"))
        {
          twoCount++;
        }
        if(x.substring(i,i+1).equals("3"))
        {
          threeCount++;
        }
        if(x.substring(i,i+1).equals("4"))
        {
          fourCount++;
        }
        if(x.substring(i,i+1).equals("5"))
        {
          fiveCount++;
        }
        if(x.substring(i,i+1).equals("6"))
        {
          sixCount++;
        }
        if(x.substring(i,i+1).equals("7"))
        {
          sevenCount++;
        }
        if(x.substring(i,i+1).equals("8"))
        {
          eightCount++;
        }
        if(x.substring(i,i+1).equals("9"))
        {
          nineCount++;
        }
      
      }
      System.out.println("Zero appeared " + zeroCount + " times.");
      System.out.println("One appeared " + oneCount + " times.");
      System.out.println("Two appeared " + twoCount + " times.");
      System.out.println("Three appeared " + threeCount + " times.");
      System.out.println("Four appeared " + fourCount + " times.");
      System.out.println("Five appeared " + fiveCount + " times.");
      System.out.println("Six appeared " + sixCount + " times.");
      System.out.println("Seven appeared " + sevenCount + " times.");
      System.out.println("Eight appeared " + eightCount + " times.");
      System.out.println("Nine appeared " + nineCount + " times.");
    }
}
