public class Set_Matric_Zeros{
    public static void main(String[] args){
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] res = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                res[i][j] = arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<arr.length;k++){
                        res[k][j] = 0;
                    }
                    for(int k=0;k<arr[0].length;k++){
                        res[i][k] = 0;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}