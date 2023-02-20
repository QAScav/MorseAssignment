package morseKorse;

import java.util.Scanner;

public class MorseAssi {
    static Scanner sc = new Scanner(System.in);
    static translate tr = new translate();
    static boolean isRunning = true;

    public static void main(String[] args) {
        System.out.println("""
                Välkommen till Morse Korse,
                en program som översätter engelska till morse kod eller vice versa!
                Vänligen ange ett ord på engelska eller morse kod!""");
        while (isRunning) {
            String input = sc.nextLine();
            tr.toHolding(input);
            if (input.contains(".") || input.contains("-")) {
                tr.HoldingToEnglish(); //MORS -> ENG
            } else {
                tr.HoldingToMorse(); //ENG -> MORS
            }
            System.out.println(tr.getResult());
            isRunning = false;
        }
    }
}
