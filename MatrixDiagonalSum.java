import java.util.*;
public class MatrixDiagonalSum
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the element at position "+i+","+j);
                mat[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if( i!=mat.length-1-i){
                sum+=mat[i][mat.length-i-1];
            }
        }
        System.out.println(sum);
    }
}