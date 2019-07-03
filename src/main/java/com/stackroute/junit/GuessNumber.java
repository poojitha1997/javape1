package com.stackroute.junit;

import java.util.Scanner;

//program for user guessing the correct number
public class GuessNumber

{
    //setting the number to a digit
    static int setNumber=67;
    static Scanner scanner = new Scanner(System.in);

    public static void print(int num)
    {
       while(num!=0)
       {
           //number should be between 1 and 100
           if (setNumber > 0 && setNumber <= 100)
           {
               if (num < setNumber)
                   System.out.println("number guessed is less than original number");
               else if (num > setNumber)
                   System.out.println("number guessed is more than original number");
               else {
                   System.out.println("number guessed matched the original number");
                   break;
               }
           }
            num =scanner.nextInt();

       }

    }

    public static void main(String arg[])
    {
        int userNumber = scanner.nextInt();

        //calling the method
        print(userNumber);
    }

}
