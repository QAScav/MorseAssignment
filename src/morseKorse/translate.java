package morseKorse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class translate {


    private String result;

    public translate() {
        result = "";
    }
    public String getResult() {
        return result;
    }

    ArrayList<String> toBeTranslated = new ArrayList<>();  //To be translated
    HashMap<String, String> dictionary = new HashMap<>(); // HastMap med båda biblioteken i parallel
    HashMap<String, String> dictionaryReversed = new HashMap<>();
    String[] holdingArr;
    String[] engLet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", //English letter library
            "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z", " ", "1", "2", "3", "4",
            "5", "6", "7", "8", "9", "0",};
    String[] morCode = {".-", "-...", "-.-.", "-..", //Morse code library
            ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--..", " ", ".----",
            "..---", "...--", "....-", ".....", "-....",
            "--...", "---..", "----.", "-----"};

    {
        for (int i = 0; i < engLet.length; i++) { //For-loop som räknar upp till totala mängden index i eng library
            dictionary.put(engLet[i], morCode[i]); //Med int i som "Index räknare" paras engLet och morCode
        }

        for (int i = 0; i < engLet.length; i++) {
            dictionaryReversed.put(morCode[i], engLet[i]);

        }
    }


    public void toHolding(String input) {
        holdingArr = input.split(" ");
        Collections.addAll(toBeTranslated, holdingArr); //Detta var en for loop som la till alla holdingArr index till tBT.
    }

    public void HoldingToMorse() {
        for (int i = 0; i < toBeTranslated.size(); i++) {
            for (int j = 0; j < holdingArr[i].length(); j++) {
                result += dictionary.get(String.valueOf(holdingArr[i].charAt(j))) + " ";
            }
        }
    }

    public void HoldingToEnglish() {
        for (int i = 0; i < toBeTranslated.size(); i++) {
            result += dictionaryReversed.get(holdingArr[i]);
        }
    }

}



