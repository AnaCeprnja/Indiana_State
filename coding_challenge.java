import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import java.util.concurrent.*;


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

        	String result = "";
        
        	for (int i = array.length - 1; i >= 0; i--) {
            	result = result + array[i] + " ";
        	}
        
        	System.out.println(result);
    	}
	}


// Problem four
// https://www.hackerrank.com/challenges/30-recursion/problem

public class Solution {

    public static int factorial(int n){
        return (n > 1) ? n * factorial(n - 1) : 1;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factorial(n));
    }
}