import java.util.*; 
public class Pattern16 {
    public static void main(String []sanna){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            if (i%2==0) k=k+2; 
           System.out.println(); 
        }
        
        }



    }

