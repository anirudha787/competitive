https://codeforces.com/contest/1213/problem/A

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
 
/**
 *
 * @author Anirudha
 */
public class JavaApplication42 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> a=new HashMap<>();
        int n=sc.nextInt();
        int k;
        int val;
        for(int i=0;i<n;i++)
        {
            k=sc.nextInt();
            
            if(a.containsKey(k))
            {
                val=a.get(k);
                val++;
                a.put(k, val);
            }
            else
            {
                a.put(k, 1);
            }
        }
       // System.out.println(a);
         Map<Integer, Integer> hm1 = sortByValue(a); 
        Entry<Integer,Integer> w;
            w=a.entrySet().iterator().next();
            int key=w.getKey();
            int total=0;
            long min=(long)9999999;
             for (Map.Entry<Integer, Integer> en : hm1.entrySet()){
                 key=en.getKey();
                 total=0;
             for (Map.Entry<Integer, Integer> en1 : hm1.entrySet()) { 
                 if((en1.getKey()-key)%2==0)
                 {
                     
                 }
                 else
                 {
                     total=total+en1.getValue();
                 }
                 
          }
             if(min>total)
                 {
                     min=total;
                 }
             }
             System.out.println(min);
       
    }
     public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return -1*(o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    
    
    
}