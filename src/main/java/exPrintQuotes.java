/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;

public class exPrintQuotes {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = sc.nextLine();
        System.out.println("Who said it? ");
        String author = sc.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
