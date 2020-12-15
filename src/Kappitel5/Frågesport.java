package Kappitel5;

import java.util.Scanner;

public class Frågesport {
    public static void main(String[]args) {
        String q1 = "Vad är 9 gånger 40?\n"
                  + "(a)360\n(b)380\n(c)340\n";

        String q2 = "Vad är 7 gånger 54?\n"
                  + "(a)368\n(b)373\n(c)378\n";

        String q3 = "Vad är 100 delat på 80?\n"
                  + "(a)1,2\n(b)1,25\n(c)1,20\n";

        Question[] questions = {
                new Question(q1,"a"),
                new Question(q2, "c"),
                new Question(q3, "b")
        };
        takeTest(questions);
    }

    public static void takeTest(Question [] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("Dina poäng blev " + score + "/" + questions.length);
    }

}
