package Hanga;

import java.util.Arrays;
import java.util.Random;

public class gubbe {
    public static void main(String []args) {

        String[] ord = new String[] {
                "soppa", "husbil", "vaccinerad", "biljett", "indikator"
        };
          System.out.println(
                  "Ord: " + Arrays.toString(ord));

          Random rand = new Random();
          int rr = rand.nextInt(ord.length);

          System.out.println(
                  "Valt ord: " + ord[rr]);

          String guess = "";

          while(!guess.equals()){
              System.out.print("Gissa en bokstav: ");
              guess = keyboardInput.nextLine();
          }

    }
}