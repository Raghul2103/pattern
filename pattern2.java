import java.util.*;
class pattern2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*n-(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}