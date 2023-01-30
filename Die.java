/*
Programmer: Dylan James Giffen
Program Name: Die.java
Date: 01/20/2023
Version: 1.0
This class creates a die and then rolls
it gives what number was rolled
*/
public class Die 
{
   private int topSide;
   private int numSides;

   public Die(int NS)
   {
    numSides = NS;
   }

   public void roll()
   {
     topSide = (int)((Math.random()*numSides)+1.5);
   }

   public int getTopSide()
   {
    return topSide;
   }

   public int getNumSides()
   {
    return numSides;
   }

   public String toString()
   {
    return "You rolled a " + numSides + " sided die." + "The roll is " + topSide;
   }

}
