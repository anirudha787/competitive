https://codeforces.com/contest/112/problem/A

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
        String a=sc.next();
        String b=sc.next();
      
        if(a.compareToIgnoreCase(b)>0)
        {
            System.out.println("1");
            return;
        }
        if(a.compareToIgnoreCase(b)<0)
        {
        System.out.println("-1");
        return;
        }
        System.out.println("0");
        
 
       
    }
    
}