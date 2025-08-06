public class Capitalize_the_Title {
    public static void main(String[] args){
        String title = "The quick brown fox jumps over the lazy dog";
        char[] ch = title.toCharArray();
		int len = ch.length;

		for(int i = 0; i < len; ++i) {
			int firstIndex = i; 
			while(i < len && ch[i] != ' ') {
				ch[i] = Character.toLowerCase(ch[i]); 
				++i;
			}
            if(i - firstIndex > 2) {
				ch[firstIndex] =  Character.toUpperCase(ch[firstIndex]); 
			}
		}

		System.out.println( String.valueOf(ch)); 
    }
}
