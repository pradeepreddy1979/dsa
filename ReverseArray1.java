import java.util.*;
class ReverseArray1{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    int k=0;
    int b[]=new int[a.length];
    for(int i=a.length-1;i>=0;i--){
        b[k]=a[i];
        k++;
    }
    for(int i=0;i<n;i++){
        a[i]=b[i];
    }
    for (int i=0;i<=n;i++ ){
        System.out.print(a[i]+" ");
    }
    }


}
