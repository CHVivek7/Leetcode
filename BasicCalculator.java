import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        str = str.replaceAll(" ", "");
        int n = str.length();
        char arr[] = new char[n] ;

        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }
        int i = 0;
        int result = 0;
        while (i < n) {
            if (arr[i]=='(') {
                int j = i;
                int count = 0;
                while (j < n) {
                    if (arr[j] == '(') {
                        count++;
                    } else if (arr[j] == ')') {
                        count--;
                    }
                    if (count == 0) {
                        break;
                    }
                    j++;
                }
                String s = str.substring(i + 1, j);
                result = Integer.parseInt(s);
                i = j;
                
            }
            else if (arr[i] == '+') {
                i++;
                result += arr[i] - '0';
            } else if (arr[i] == '-') {
                i++;
                result -= arr[i] - '0';
            } else if (arr[i] == '*') {
                i++;
                result *= arr[i] - '0';
            } else if (arr[i] == '/') {
                i++;
                result /= arr[i] - '0';
            } else {
                result = arr[i] - '0';
            }
            i++;
        }
        System.out.println("Result: " + result);
    }
}