package Kappitel5;

import javax.swing.*;
import java.util.Random;

public class Uppgift8 {
    public static void main(String[]args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10)-5;
        System.out.println("Random Integers: "+rand_int1);

        if (rand_int1 > 0) {
            JOptionPane.showMessageDialog(null, 1);
        }

        if (rand_int1 == 0) {
            JOptionPane.showMessageDialog(null, 0);
        }

        if (rand_int1 < 0) {
            JOptionPane.showMessageDialog(null, -1);
        }

    }
}
