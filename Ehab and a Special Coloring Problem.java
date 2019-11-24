https://codeforces.com/contest/1174/problem/C

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
        int n=sc.nextInt();
        sieveOfEratosthenes( n) ;
        
    
}
     static void sieveOfEratosthenes(int n) 
    { 
        // Create a boolean array "prime[0..n]" and initialize 
        // all entries it as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
        int prime[] = new int[n+1]; 
        
          int k=0;
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == 0) 
            { 
                  k++;
                  //System.out.println("k"+k);
                  prime[p]=k;
                
                // Update all multiples of p 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = k; 
            } 
          
        } 
          
        // Print all prime numbers 
        for(int i = 2; i <= n; i++) 
        { 
           if(prime[i]==0)
           {
               k++;
               System.out.print(k + " ");
           }
           else
           {
                System.out.print(prime[i] + " ");
           }
        } 
    } 
}