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

// Problem three
// https://www.hackerrank.com/challenges/30-arrays/problem

	public class Solution {

    	public static void main(String[] args) {
        	// Get the input
        	Scanner sc = new Scanner(System.in);
        	int length = sc.nextInt();
        	int[] array = new int[length];
        
       		for (int i = 0; i < length; i++) {
            	array[i] = sc.nextInt();
        	}
        
        	// Var holding our new string
        	String result = "";
        
        	for (int i = array.length - 1; i >= 0; i--) {
            	result = result + array[i] + " ";
        	}
        
        	System.out.println(result);
    	}
	}
