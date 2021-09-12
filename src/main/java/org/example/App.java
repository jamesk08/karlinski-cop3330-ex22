/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;

public class App
{
    public static void main(String[] args)
    {
        LargestNumberFinder numDiffTool = new LargestNumberFinder();
        int[] values = new int[3];
        values[0] = numDiffTool.getNumberInput("first");
        values[1] = numDiffTool.getNumberInput("second");
        values[2] = numDiffTool.getNumberInput("third");
        Integer largestNumber = numDiffTool.getLargestNumber(values);
        System.out.print(MessageFormat.format("The largest number is {0}.", largestNumber));
    }
}
