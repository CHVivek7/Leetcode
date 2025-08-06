import java.util.Scanner;

public class Check_preFIx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("\nEnter the prefix: ");
        String prefix = sc.nextLine();
        sc.close();
        int n = prefix.length();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(s[i].startsWith(prefix)){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
    
}
