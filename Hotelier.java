https://codeforces.com/contest/1200/problem/A

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
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='L')
            {
                for(int j=0;j<10;j++)
                {
                    if(a[j]==0)
                    {
                        a[j]=1;
                        break;
                    }
                }
                 continue;
            }
            if(s.charAt(i)=='R')
            {
                for(int j=9;j>=0;j--)
                {
                    if(a[j]==0)
                    {
                        a[j]=1;
                        break;
                       
                    }
                }
                continue;
            }
            
            int p=Integer.parseInt(s.substring(i, i+1));
            a[p]=0;
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]);
        }
    }
    
}