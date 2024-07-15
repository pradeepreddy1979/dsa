import java.util.*;
public class Boyermoore {
    public static void hash(int []a){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<a.length;i++){
        map.put(a[i],map.getOrDefault(a[i],0)+1);
    }
    for(int i:map.keySet()){
        if(map.get(i)>a.length/2) 
            System.out.println(i);
        else System.out.println(-1);    
    }
    
 }
 public static void majority(int []a){
    int votes=0;
    int majority=-1;
    for(int i=0;i<a.length;i++){
    if(votes==0){
        majority=a[i];
        votes=1;
    }
    else{
        if(majority==a[i]) votes++;
        else votes--;
    }
   }
   int count=0;
   for(int i=0;i<a.length;i++){
    if (a[i]==majority)
     count++;}
    if(count>a.length/2) System.out.println(majority);
    else System.out.println(-1); 
 }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] a=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    hash(a);
    majority(a);
  }  
}
