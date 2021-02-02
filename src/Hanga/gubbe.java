package Hanga;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class gubbe {
    public static final int NUM_GUESSES = 10;
    private static char[] guessed;
    public static void main(String []args) {

        String[] ord = new String[] {
                "soppa"
        };
          System.out.println(
                  "Ord: " + Arrays.toString(ord));

          Random rand = new Random();
          int rr = rand.nextInt(ord.length);

          System.out.println(
                  "Valt ord: " + ord[rr]);
          int l = ord[rr].length();
          String guess = "";
          for (int i = 0 ; i < l ; i++) {
              guess = guess+"_";
          }

          Scanner keyboardInput = new Scanner(System.in);

          while(!guess.equals(ord[rr])){
              System.out.println(guess);
              System.out.print("Gissa en bokstav: ");
              char guessedChar = keyboardInput.nextLine().charAt(0);
            if (ord[rr].contains(""+guessedChar)) {
                StringBuilder sb = new StringBuilder(guess);
                for(int i = 0; i<guess.length(); i ++) {
                        if (ord[rr].charAt(i) == guessedChar) {
                            sb.setCharAt(i, guessedChar);
                        }
                }
                guess = sb.toString();
                guessed = new char[NUM_GUESSES];
                System.out.print("Dessa bokstäver har du gissat hitilts: ");
                for (int i = 0; i < guessed.length; ++i) {
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    if (guessed[i] != 0) {
                        System.out.print(guessed[i]);
                    } else {
                        break;
                    }
                }
                System.out.println(".");
            }
          }
    }
}