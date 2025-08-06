import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] n = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(n));
    }

    public static boolean isValidSudoku(char[][] n) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> col = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (n[i][j] != '.' && !row.add(n[i][j]))
                    return false;
                if (n[j][i] != '.' && !col.add(n[j][i]))
                    return false;
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (n[rowIndex][colIndex] != '.' && !cube.add(n[rowIndex][colIndex]))
                    return false;
            }
        }
        return true;
    }
}