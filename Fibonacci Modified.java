https://www.hackerrank.com/challenges/fibonacci-modified/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the fibonacciModified function below.
    static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
            BigInteger t3 = new BigInteger("1");
            for(int i=0;i<n-2;i++)
            {
                t3=t1.add(t2.multiply(t2));
                t1=t2;
                t2=t3;

            }
            return t3;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);
        BigInteger A, B; 
        A  = BigInteger.valueOf(t1);
B  = BigInteger.valueOf(t2); 

        BigInteger result = fibonacciModified(A, B, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}