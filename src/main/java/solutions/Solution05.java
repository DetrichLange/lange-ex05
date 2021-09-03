/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Detrich Lange
 */

package solutions;
import java.util.Scanner;

/*
Write a program that prompts for two numbers. Print the sum, difference, product, and quotient
of those numbers as shown in the example output
    Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
    Keep the input and output statements separate from the numerical conversions and other processing.
    Generate a single output statement with line breaks in the appropriate spots.
1: Prompt user to input a number.
2: Save input as string Firstinput.
3: Prompt user to input a number.
4: Save input as string Secondinput.
5: Create int Firstnumber = Integer.parseInt(Firstinput)
6: Create int Secondnumber = Integer.parseInt(Secondinput)
7: Create int Outputsum = Firstnumber + Secondnumber
8: Create int Outputdifference = Firstnumber - Secondnumber
9: Create int Outputproduct = Firstnumber * Secondnumber
10: Create int Outputquotient = Firstnumber / Secondnumber
11: Print   %d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d with Firstnumber, Secondnumber, Outputsum,
                Firstnumber, Secondnumber, Outputdifference, Firstnumber, Secondnumber, Outputproduct, Firstnumber,
                Secondnumber, Outputquotient
 */

public class Solution05
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is the first number? ");
        String Firstinput = in.nextLine();
        System.out.print("What is the second number? ");
        String Secondinput = in.nextLine();

        int Firstnumber = Integer.parseInt(Firstinput);
        int Secondnumber = Integer.parseInt(Secondinput);

        int Outputsum = Firstnumber + Secondnumber;
        int Outputdifference = Firstnumber - Secondnumber;
        int Outputproduct = Firstnumber * Secondnumber;
        int Outputquotient = Firstnumber / Secondnumber;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", Firstnumber, Secondnumber, Outputsum,
                Firstnumber, Secondnumber, Outputdifference, Firstnumber, Secondnumber, Outputproduct, Firstnumber,
                Secondnumber, Outputquotient);
    }
}
