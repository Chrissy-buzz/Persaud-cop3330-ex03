package org.example;

import java.util.Scanner;  // Import the Scanner class

/**
 * Hello world!
 *
 */
public class App {
    private String quote;
    private String source;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String value) {
        quote = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String value) {
        source = value;
    }

    public static void main(String[] args) {

        System.out.println("What is the quote? ");
        Scanner scanner = new Scanner(System.in);
        String setQuote = scanner.nextLine();

        System.out.println("Who said it?");
        Scanner scanner2 = new Scanner(System.in);
        String setSource = scanner.nextLine();
        System.out.println(setSource+ " says, \"" + setQuote + ".\"\n");
    }
}


