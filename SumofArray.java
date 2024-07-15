import java.util.Scanner;
public class SumofArray{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int current_sum=0;
        int max_sum=a[0];
        for(int j=0;j<a.length;j++){
            current_sum=current_sum+a[j];
            if (current_sum<0){
                current_sum=0;
            }
            max_sum=Math.max(max_sum,current_sum);
        }
        System.out.print(max_sum);
}
}
    
