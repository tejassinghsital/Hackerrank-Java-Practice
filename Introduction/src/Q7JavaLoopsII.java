/*QUES. 

SEE QUESTION HERE: https://www.hackerrank.com/challenges/java-loops/problem

 */ 

//SOLUTION.
import java.util.*;
import java.io.*;
import static java.lang.System.out;


class Q7JavaLoopsII{
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int temp = a;
            for (int j = 0; j < n; j++) {
                temp += (Math.pow(2, j) * b);
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
    
}
