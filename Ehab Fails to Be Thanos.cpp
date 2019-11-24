https://codeforces.com/contest/1174/problem/A

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
/**
 *
 * @author Anirudha
 */
public class JavaApplication47 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        ArrayList<Long> a=new ArrayList<>();
        for(int i=0;i<2*n;i++)
        {
            a.add(sc.nextLong());
        }
        Collections.sort(a);
        long sum1=0;
        
        long sum2=0;
        for(int i=0;i<n;i++)
        {
            sum1=sum1+a.get(i);
        }
        for(int i=(int)n;i<(int)2*n;i++)
        {
            sum2=sum2+a.get(i);
        }
        if(sum1==sum2)
        {
            System.out.println("-1");
        }
        else
        {
             for(int i=0;i<2*n;i++)
        {
            System.out.print(a.get(i)+" ");
        }
        }
    }
    
}