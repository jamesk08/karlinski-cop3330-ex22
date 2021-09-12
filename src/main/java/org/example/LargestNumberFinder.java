/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class LargestNumberFinder
{
    Scanner scanner = new Scanner(System.in);
    final int numberInputLength = 3;

    public int getNumberInput(String numberIndexText)
    {
        System.out.print(MessageFormat.format("Enter the {0} number: ", numberIndexText));
        return scanner.nextInt();
    }

    public Integer getLargestNumber(int[] enteredNumbers)
    {
        Integer largestNumber = null;
        int previousLargestNumber = 0;
        for (int i = 0; i <  numberInputLength; i++)
        {
            int currentNumber = enteredNumbers[i];
            if (i == 0)
            {
                previousLargestNumber = currentNumber;
            }
            else
            {
                if(previousLargestNumber > currentNumber)
                {
                    largestNumber = previousLargestNumber;
                }
                else if(currentNumber > previousLargestNumber)
                {
                    largestNumber = currentNumber;
                    previousLargestNumber = currentNumber;
                }
            }
        }

        // will be null if largest is not determined
        if (largestNumber == null)
        {
            System.out.println("All numbers were equal.");
            System.exit(0);
        }
        return largestNumber;
    }
}
