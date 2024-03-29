https://www.hackerrank.com/challenges/coin-change/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the getWays function below.
    static long getWays(long n, long[] c) {
        long[] a=new long[(int)n+1];
        a[0]=1;
        for(int i=0;i<c.length;i++)
        {
            for(int j=(int)c[i];j<n+1;j++)
            {
                a[j]=a[j]+a[j-(int)c[i]];
                System.out.println(a[j]);
            }
            
        }
        return a[(int)(n)];
        
           
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long[] c = new long[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(n, c);
     
        String k=Long.toString(ways);
        bufferedWriter.write(k);
        bufferedWriter.close();

        scanner.close();
    }
}