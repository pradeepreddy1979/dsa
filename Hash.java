import java.util.*;
public class Hash {
    public static void main(String args[]){
        int a []={3,5,6,2,7,3,9,4,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println(map);
        map.put(1,3);
        map.put(3,8);
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(8,0));
        for(int i:map.keySet()){
          System.out.println(i+" "+map.get(i));
        }
        System.out.println(map.containsKey(4));
        for(int i=0;i<a.length;i++){
            System.out.println(map.put(a[i],map.getOrDefault(a[i],0)+1));
        }
   }
    
}

