https://codeforces.com/contest/1217/problem/A

import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author Anirudha
 */
public class JavaApplication45 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            long str=sc.nextLong();
 
            long inte=sc.nextLong();
            long exp=sc.nextLong();
 
            if(inte>str)
            {
                if(exp<=(inte-str))
                {
                    System.out.println("0");
                    continue;
                }
                else
                {
                    long count;
                    exp=exp-((inte)-str);
                    if(exp%2==0)
                    count=exp/2;
                    else
                    {
                        count=exp/2+1;
                    }
                        
                    
                    System.out.println(count);
                    continue;
                }
            }
            else
            {
                if(inte+exp<str)
                {
                    long count=exp+1;
                    System.out.println(count);
                    continue;
                }
                else
                {
                    long x;
                    if((str+exp-inte)%2==0)
                     x=(str+exp-inte)/2;
                    else
                         x=(str+exp-inte)/2+1;
                  
                    System.out.println(x);
                    continue;
                }
               
            }
            
            }
        
    }
    
}
