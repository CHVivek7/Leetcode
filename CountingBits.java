import java.util.Scanner;
public class CountingBits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++){
            res[i] = Integer.toBinaryString(i).replace("0","").length();
            System.out.print(res[i]+" ");
        }
    }
}