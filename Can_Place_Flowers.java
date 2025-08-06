public class Can_Place_Flowers {
    public static void main(String[] args) {
        int[] flowers = {1,0,0,0,1};
        int n = 2;
        int count = 0;
        for(int i=0;i<flowers.length;i++){
            if(flowers[i] == 0){
                if(i==0 && flowers[i+1] == 0){
                    flowers[i] = 1;
                    count++;
                }else if(i==flowers.length-1 && flowers[i-1] == 0){
                    flowers[i] = 1;
                    count++;
                }else if(flowers[i-1] == 0 && flowers[i+1] == 0){
                    flowers[i] = 1;
                    count++;
                }
            }
        }
        System.out.println(count >= n);
    }
}
