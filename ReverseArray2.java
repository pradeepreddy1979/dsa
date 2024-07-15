import java.util.*;
class ReverseArray2{
public static void reverseArray(int a[]){
int left=0;
int right=a.length-1;
while(left<right){
    int temp=a[left];
    a[left]=a[right];
    a[right]=temp;
    left++;
    right--;
}
}
public static void print(int a[]){
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    } 
    System.out.println();
}
   public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    print(a);
    reverseArray(a);
    print(a);

   }
    }
