import java.util.*;
class Rightshift1{
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
public static void rightrotate(int a[] ,int k){
for(int j=0;j<k;j++){
    int temp=a[a.length-1];
    for(int i=a.length-2;i>=0;i--){
    a[i+1]=a[i];
}
a[0]=temp;
}
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

