public class String_to_Integer {
    public static void main(String[] args) {
        String str = "ccc-12003";
        String res = "";
        int x = 0;
        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) == '-') && (digit ==0) ){
                res = res + "-";
            }
            else
            if (Character.isDigit(str.charAt(i)) && x==0) {
                digit = 1;
                if(str.charAt(i)!='0'){
                    res = res + str.charAt(i);
                }
                else if(str.charAt(i)=='0' ){
                    x=1;
                }
            }
        }
        System.out.println(Integer.parseInt(res));
    }
}
