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

// Problem 5
// https://www.hackerrank.com/challenges/30-sorting/problem


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }


         int numberOfSwaps=0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                 if (a[j] > a[j + 1]) {
                   int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }


}