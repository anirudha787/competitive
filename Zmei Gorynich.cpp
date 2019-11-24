https://codeforces.com/contest/1217/problem/B

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
            long n1=sc.nextLong();
            long h=sc.nextLong();
            if(h==0)
            {
                System.out.println(0);
                continue;
            }
            long max=0;
            long max2=0;
            long low;
            for(int j=0;j<n1;j++)
            {
                long bl=sc.nextLong();
                max2=Math.max(max2, bl);
                long lo=sc.nextLong();
               if(max<bl-lo)
               {
                   max=bl-lo;
                   low=lo;
               }
                
            }
            if(h-max2<=0)
            {
                System.out.println("1");
                continue;
            }
            if(max==0)
            {
                System.out.println("-1");
                 continue;
            }
            else
            {
                long count;
                h=h-max2;
                if(h%max==0)
                {
                    count=h/max;
                }
                else
                {
                    count=h/max+1;
                }
                System.out.println((count+1));
            }
        }
            
 
            
 
            
        
    }
    
}