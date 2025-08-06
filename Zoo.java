import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
        String s="";
        
        for (int i = 0; i < animal.length()-2; i++) {
            s = animal.substring(i, i+3);
            if (s.equals("zoo")) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
