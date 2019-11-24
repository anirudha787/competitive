https://codeforces.com/contest/1213/problem/C

import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author Anirudha
 */
public class JavaApplication43 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           long a=sc.nextLong();
           long b=sc.nextLong();
           long total=0;
           long j=0;
           long k=a/b;
           //System.out.println(a);
           if(k<100)
           {
           do{
               j++;
               if(b*j<=a)
               {
                   total=total+b*j%10;
               }
               else
               {
                   break;
               }
             //  System.out.println(total);
           }while(true);
            
            System.out.println(total);
            
           }
           else
           {
               long t=k/10;
               for(int u=0;u<10;u++)
               {
                   total=total+b*u%10;
               }
               total=total+total*(t-1);
               long t1=k%10;
               for(int u=1;u<t1+1;u++)
               {
                   total=total+b*u%10;
               }
               System.out.println(total);
               
           }
           
    }
    
}
}