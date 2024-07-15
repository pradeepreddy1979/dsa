
import java.util.*;
class Leftrotate{
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        } 
        System.out.println();
    }
public static void reverseArray(int a[],int left,int right){

while(left<=right){
    int temp=a[left];
    a[left]=a[right];
    a[right]=temp;
    left++;
    right--;
}
}
public static void rightrotate(int a[] ,int k){
    int n=a.length;
reverseArray(a,k,n-1);
reverseArray(a,0,k-1 );
reverseArray(a,0,n-1);
}

   public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    print(a);
    rightrotate(a,k );
print(a);


   }

} 
    
