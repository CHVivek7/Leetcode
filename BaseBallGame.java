import java.util.Scanner;
class BaseBallGame{
    public static void main(String[] args){
        System.out.print("Enter the number of rounds: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ops = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the round "+(i+1)+": ");
            ops[i] = sc.next();
        }
        int[] arr = new int[ops.length];
        int index = 0;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
                arr[index-1] = 0;
                index--;
            }else if(ops[i].equals("D")){
                arr[index] = arr[index-1]*2;
                index++;
            }else if(ops[i].equals("+")){
                arr[index] = arr[index-1]+arr[index-2];
                index++;
            }else{
                arr[index] = Integer.parseInt(ops[i]);
                index++;
            }
        }
        int sum = 0;
        for(int i=0;i<index;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}