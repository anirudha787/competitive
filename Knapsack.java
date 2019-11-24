https://www.hackerrank.com/challenges/unbounded-knapsack/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        static ArrayList<Integer> p=new ArrayList<>();
    // Complete the unboundedKnapsack function below.
     static int unboundedKnapsack1(int k, int[] arr) {
         for(int w=0;w<arr.length;w++)
         {
             if(k%arr[w]==0)
             {
                 return k;
             }
         }
         p.clear();
         unboundedKnapsack(k,arr);
         //System.out.println(p);
         int min=Collections.min(p);
         return k-min;
     }
    static void unboundedKnapsack(int k, int[] arr) {
        if(k==0)
        {
            p.add(k);
           // System.out.println("I am Here");
            return;
        }
        if(k<0)
        {
            return ;
        }
        if(k>0)
        {
            int flag=0;
          for(int i=0;i<arr.length;i++)
          {
              if(k>=arr[i])
              {
                  unboundedKnapsack(k-arr[i], arr);
                  flag=1;
              }
            
          }
          if(flag==0)
          {
              p.add(k);
              return;
          }  
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int l=0;l<t;l++)
        {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = unboundedKnapsack1(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}