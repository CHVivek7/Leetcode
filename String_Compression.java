public class String_Compression {
    public static void main(String[] args) {
        String str = "aabccc";
        char[] c = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count=0;
        char temp = c[0];
        for(int i=1;i<c.length;i++){
            if(temp == c[i]){
                count++;
            }else{
                sb.append(temp);
                sb.append(count+1);
                temp = c[i];
                count=0;
            }
        }
        sb.append(temp);
        sb.append(count+1);
        System.out.println(sb.toString().length() );

    }
}