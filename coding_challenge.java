import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//problem two
//https://www.hackerrank.com/challenges/30-loops/problem

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <=10; i++)
        {
            System.out.println(N + " x "+i+" = "+i*N);
        }
    }
}
