import java.util.*;
public class Reverse {
    public static void main(String [] sanna){
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
int num=n;
    int rev=0;
    while(n!=0){
        int ld=n%10;
         rev= rev*10+ld;
        n=n/10;
    }
    System.out.println(rev);
    System.out.println(rev==num);
    }
}
