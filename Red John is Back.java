https://www.hackerrank.com/challenges/red-john-is-back/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the redJohn function below.
    static long redJohn(int n) {
            int p=n/4;
            ArrayList<BigInteger> a=new ArrayList<>();
             
             
            a.add(new BigInteger("1"));
            BigInteger com=BigInteger.valueOf(0);
            
                for(int i=p;i>=0;i--)
                {
                    int ones=n-i*4;
                    int objects=ones+i;
                    com=com.add(fact(objects,a).divide((fact(i,a).multiply(fact(ones,a)))));

                }
           // System.out.println(fact(4,a));
            //System.out.println(a);
            //System.out.println(com);
            //System.out.println(com.longValue());
            return prime(com.longValue());
            

    }
    static BigInteger fact(int objects,ArrayList<BigInteger> a)
    {
        
        if(objects==0)
        {
            return BigInteger.valueOf(1);
        }
        if(a.size()>=objects)
        {
            // System.out.println(a);
            // System.out.println(objects-1);
            return a.get(objects-1);
        }
        else
        {
            for(int i=a.size()-1;i<objects;i++)
            {
                a.add(a.get(i).multiply(BigInteger.valueOf(i+2)));
            }
            return a.get(objects-1);
        }
    }
     
     static long  prime(long com)
     {
         ArrayList<Long> primes=new ArrayList<>();
         if(com==1)
         {
             return 0;

         }
         if(com==2)
         {
             return 1;
         }
         primes.add((long)2);
        int j=0;
         int i=3;
         do
         {
           j=0;
             do
             {
                 if(i%(primes.get(j))==0)
                 {
                     //System.out.println("j"+j);
                     break;
                 }
                 if(primes.get(j)>Math.sqrt(i))
                 {
                     j=primes.size();
                     break;
                 }
                 
                 j++;
             }while(!(j==primes.size()));
             if(j==primes.size())
             {
                primes.add((long)i);
                i++;
             }
             // System.out.println("i"+i);
              //System.out.println(primes);
             i++;
         }while(i<=com);
         //System.out.println(primes);
         return primes.size();
     }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = redJohn(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

