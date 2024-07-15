import java.util.*;
public class Pattern8 {
public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=n;j>i;j--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
           System.out.println();
        }
        for(int i=2;i<=n;i++)
    {
        //System.out.println(i);
       // System.out.print(" ");
        for(int j=n;j>i;j--)
        {
          //System.out.print(j); 
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
           // System.out.print(j);
        System.out.print("* ");
    }
    System.out.println();
 }
    }
    }
    
