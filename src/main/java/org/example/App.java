package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);

        System.out.println( "What is the input string?" );

        String input = sc.nextLine();

        int length = input.length();

        System.out.println( input + " has " + length + " characters.");

    }
}
