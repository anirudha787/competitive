https://codeforces.com/contest/282/problem/A

import java.util.Scanner;
 
/**
 *
 * @author Anirudha
 */
public class JavaApplication41 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        String a="";
        for(int i=0;i<n;i++)
        {
            a=sc.next();
            if(a.equals("X++")||a.equals("++X"))
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        System.out.println(x);
        
 
       
    }
    
}