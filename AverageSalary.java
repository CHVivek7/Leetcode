import java.util.*;
public class AverageSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();
        int[] salary = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the salary of employee "+(i+1));
            salary[i] = sc.nextInt();
        }
        double sum = 0;
        Arrays.sort(salary);
        for(int i=1;i<n-1;i++){
            sum+=salary[i];
        }
        System.out.println("The average salary of the employees is "+(sum/(n-2)));
        sc.close();
    }
}
