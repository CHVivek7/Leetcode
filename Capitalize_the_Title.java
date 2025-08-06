import java.util.Scanner;

public class Capitalize_the_Title {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title:");

        String title = sc.nextLine();
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
