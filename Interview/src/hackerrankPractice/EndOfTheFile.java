package hackerrankPractice;

import java.util.Scanner;

public class EndOfTheFile {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n + 1; i++) {
            if (sc.hasNext()) {
                n = n + 1;
                String content = sc.nextLine();
                System.out.println(n + " " + content);
            }
        }

    }
    }


