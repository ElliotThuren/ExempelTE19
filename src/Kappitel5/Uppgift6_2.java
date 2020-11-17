package Kappitel5;

import javax.swing.*;

public class Uppgift6_2 {
    public static void main(String[] args) {
        int restart = 0;
        while(restart == 0) {
            restart = 1;
            int t;
            int y;

            try {
                t = Integer.parseInt(JOptionPane.showInputDialog("Vad är \"t\" värdet?"));
                y = Integer.parseInt(JOptionPane.showInputDialog("Vad är \"y\" värdet?"));

                int m = t;
                int n = y;
                int r = m % n;

                while (r != 0) {
                    m = n;
                    n = r;
                    r = m % n;
                }

                if (r == 0) {
                    r = n;
                    JOptionPane.showMessageDialog(null, n);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Du kan inte använda text!");
                restart = 0;
            }
        }
    }
}