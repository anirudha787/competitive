https://www.hackerrank.com/challenges/mandragora/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the mandragora function below.
    static long mandragora(int[] H) {
        long sum=0;
            for(int i=0;i<H.length;i++)
            {
                sum=sum+H[i];
            }
            long max=sum;
            int j=1;
            Arrays.sort(H);
            for(int i=0;i<H.length;i++)
            {
                sum=sum-H[i];
                j++;
                if(max<sum*j)
                {
                    max=sum*j;
                }
                else
                {
                    break;
                }
            }
            return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] H = new int[n];

            String[] HItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int HItem = Integer.parseInt(HItems[i]);
                H[i] = HItem;
            }

            long result = mandragora(H);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}