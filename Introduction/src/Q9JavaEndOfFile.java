/*QUES. "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)

The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file. */ 

//SOLUTION.
import java.io.*;
import java.util.*; //import java.util.Scanner; likhne ki jaurat nahi nahi because import java.util.*; me Scanner bhi aa gya apne aap
import java.text.*;
import java.math.*;
import java.util.regex.*;

import static java.lang.System.out;

public class Q9JavaEndOfFile{ 

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=1;
        while(sc.hasNext())
        {
            String s= sc.nextLine();
            out.println(i+" "+s);
            i++;
        }
    }
}


/* Learning: Jab bhi tu for loop me condition nahi pta kar paye(like i<=yha kya likhu)
for example: string input leni hai aurhar string ko ginna hai so ginne ke liye i variable liya String ka input s me liya but ab
                for loop me i<=s nahi likh sakte... then us condition me whilke loop use karenge jaise apan ne upar vale program me kiya hai.

                import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import static java.lang.System.out;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.NextString();
        
        for(int i=0;i<=) //yha i<=s nahi likh sakte
        String s=sc.hasNext();


        //YE PROGRAM INCOMPLETE HAI ONLY FOR UNDERSTANDING 

    }
}*/
