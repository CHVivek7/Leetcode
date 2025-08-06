public class Robot_return_to_Origin {
    public static void main(String[] args) {
        String moves = "UDRL";
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                y++;
            } else if (moves.charAt(i) == 'D') {
                y--;
            } else if (moves.charAt(i) == 'L') {
                x--;
            } else if (moves.charAt(i) == 'R') {
                x++;
            }
        }
        if (x == 0 && y == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
