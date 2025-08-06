import java.util.*;

public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int k=0;k<matrix[0].length;k++){
                    if(matrix[i][k]<min){
                        min = matrix[i][k];
                    }
                }
                for(int k=0;k<matrix.length;k++){
                    if(matrix[k][j]>max){
                        max = matrix[k][j];
                    }
                }
                if(min==max){
                    list.add(min);
                }
            }
        }
        System.out.println(list);
    }
}
