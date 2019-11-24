https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        int[] a=new int[130];
        int k=0;
        int m=0;
        int n=0;
        int o=0;
        int flag=0,flag1=0;
        for(int i=0;i<s.length();i++)
        {
            k=(int)s.charAt(i);
            a[k]++;
        }
        for(int i=90;i<130;i++)
        {
            if(a[i]==0)
            {
                continue;
            }
            else
            {
                o++;
                if(m==0)
                {
                    m=a[i];
                 }
                else
                {
                    if(m==a[i])
                    {
                        continue;
                    }
                    else
                    {
                        if(flag==0 && Math.abs(m-a[i])==1)
                        {
                            flag=1;
                            if(m-a[i]>0 && o<3)
                            {
                                m=a[i];
                            }
                            else
                            {
                                if(o>=3 && m-a[i]>0 && a[i]!=1)
                                {

                                    flag1=1;
                                    break;
                                }

                                
                    

                            }
                          
                        }
                        else
                        {
                            if(flag==0 && a[i]!=1)
                            {
                            
                                    flag1=1;  
                                    break;
                            }
                            else
                            {
                                if(flag==0)
                                {
                                  flag=1;  
                                }
                                else
                                {
                                       flag1=1;  
                                    break; 

                                }

                            }
                        }
                    }
                }
            }
        }
        if(flag1==1)
        {
            return "NO";
        }
        else
        {
            return "YES";
        }
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}