import java.util.Scanner;

public class Find_the_Highest_altitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of gains:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Enter the gains:");
        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }
        
        int max = 0;
        int sum = 0;
        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
