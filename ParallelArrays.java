/*
 * Program: U3A4A1 Parallel Arrays
 * Purpose: A program asks the user to enter the number of dance teams and their wins
 *          /losses. The program will then ask the user to selcect the orginal data,
 *          the winning percenatge or to exit the program.
 */
package u3a4a1parallelarrays3.u3a4a1parallelarrays3;

import java.util.Scanner;

/**
 *
 * @author Sienna
 */
public class ParallelArrays {
     
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
       
       // variables
       String userInput;
       int entries = 0;
       int choice = 0;
       boolean invalid = true;
       
       // user enters the x amount of dance teams
       while (invalid)
       {
           System.out.println("Please enter the number of dance teams: ");
           userInput = keyedInput.nextLine();
           System.out.println("");
           
           try
           {
               entries = Integer.parseInt(userInput);
               invalid = false;
           }
           
           catch (NumberFormatException e)
           {
               System.out.println("Sorry, that was not a valid input.");
               System.out.println("");
           }
       }
       
       // variables
       String teamName [ ] = new String [entries];
       int wins [ ] = new int [entries];
       int losses [ ] = new int [entries];
       double winPerc [ ] = new double [entries];
       
       // data entry
       System.out.println("=======DATA=ENTRY=======");
       for (int i = 0; i < entries; i = i + 1)
       {   
           // name of dance team(s)
           System.out.println("");
           System.out.println("Please enter the name of dance team " + (i+1) + ": ");
           teamName[i] = keyedInput.nextLine();
           
           invalid = true;
           while (invalid)
           {   
               // number of wins
               System.out.println("Please enter the number of wins for " + teamName[i] + ": ");
               userInput = keyedInput.nextLine();
               
               try
               {
                   wins[i] = Integer.parseInt(userInput);
                   invalid = false;
               }
               
               catch (NumberFormatException e)
               {
                   System.out.println("Sorry, that was not a valid input.");
               }
           }
           
           invalid = true;
           while (invalid)
           {   
               // number of losses
               System.out.println("Please enter the number of losses for " + teamName[i] + ": ");
               userInput = keyedInput.nextLine();
               
               try
               {
                   losses[i] = Integer.parseInt(userInput);
                   invalid = false;
               }
               
               catch (NumberFormatException e)
               {
                   System.out.println("Sorry, that was not a valid input.");
               }
           }
       }
       
       for (int i = 0; i < entries; i = i + 1)
       {   
           // finds the winning percentage
           winPerc[i] = ((double)wins[i]/(double)(wins[i] + losses[i])) * 100;
           winPerc[i] = winPerc[i] * 100;
           winPerc[i] = Math.round(winPerc[i]);
           winPerc[i] = winPerc[i] / 100;
       }
       
       while (choice != 3)
       {
           invalid = true;
           
           while (invalid)
           {   
               // menu
               System.out.println("");
               System.out.println("Select an option");
               System.out.println("1... Output original data");
               System.out.println("2... Output winning percentages");
               System.out.println("3... Exit");
               System.out.println("Please enter your choice");
               userInput = keyedInput.nextLine();
               System.out.println("");
               
               try
               {
                   choice = Integer.parseInt(userInput);
                   invalid = false;
               }
               
               catch (NumberFormatException e)
               {
                   System.out.println("Sorry, that was not a valid input.");
               }
           }
           
           switch (choice)
           {
               case 1:
               {
               for (int i = 0; i < entries; i = i + 1)
                   {
                      System.out.println("The " + teamName[i] + " have " + wins[i] +
                              " wins and " + losses[i] + " losses ");
                   }
               break;
               }
               
               case 2:
               {
                   for (int i = 0; i < entries; i = i + 1)
                   {
                       System.out.println("The " + teamName[i] + " have a winning"
                               + " percentage of " + winPerc[i] + " % ");
                   }
                   break;
               }
               
               case 3:
               {
                   System.out.println("Thank you for using this program! :) ");
               }
               
           }
       }
     }
}
