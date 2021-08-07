package patternPractice;

public class Pattern13 {
    public static void main(String args[]) {
        for (char c = 'A'; c <= 'E'; c++) {
            for (char ch = 'A'; ch <= c; ch++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
