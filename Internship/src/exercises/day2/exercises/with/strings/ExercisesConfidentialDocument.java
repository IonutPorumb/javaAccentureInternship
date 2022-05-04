package exercises.day2.exercises.with.strings;

import java.util.Arrays;

public class ExercisesConfidentialDocument {
    //  Ex 1) create a function that finds out how many times a char is in a string
    public static int countChar(String givenString, char charToFind) {
        int result = 0;
        for (int i = 0; i < givenString.length(); i++) {
            if (givenString.charAt(i) == charToFind) {
                result++;
            }
        }
        return result;
    }

    //  Ex 2) create a function that receives a String and returns * the length of the word
    public static String redact(String givenString) {
        return "*".repeat(givenString.length());
    }

    //  Ex 3) create a function that finds if a string is in an array of strings
    public boolean contains(String[] givenArray, String givenString) {
        for (String s : givenArray) {
            if (s.equals(givenString)) {
                return true;
            }
        }
        return false;
    }

    // Ex 4) create a function that receives a phrase (words separated with space) and returns it as an array of strings
    public String[] words(String givenPhrase) {
        return givenPhrase.split(" ");
    }

    //  Ex 5) using all the functions created before
//  create a function that receives a phrase (String) and an array of sensitive words.
//  Redact all sensitive words in that phrase
    public String confidential(String phrase, String[] wordsArray) {
        StringBuilder result = new StringBuilder();
        //We count the number of spaces in our phrase:
        int spaceCount = countChar(phrase, ' ');
        //We convert our phrase in to an array of Strings:
        String[] phraseArray = words(phrase);
        for (String s : phraseArray) {
            //We check if the word from given wordsArray is contained in our phrase:
            if (contains(wordsArray, s)) {
                // We add the space after the word if spaces are available
                if (spaceCount > 0) {
                    result.append(redact(s)).append(" ");
                    spaceCount--;
                } else {
                    result.append(redact(s));
                }
            } else {
                // We add the space after the word if spaces are available
                if (spaceCount > 0) {
                    result.append(s).append(" ");
                    spaceCount--;
                } else {
                    result.append(s);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("1) create a function that finds out how many times a char is in a string");
        String givenString = "testare";
        char givenChar = 't';
        System.out.println("countChar(''" + givenString + "'', '" + givenChar + "')= " + countChar(givenString, givenChar));
        System.out.println("============================================");
        System.out.println("2) create a function that receives a String and returns * the length of the word");
        String myWord1 = "word", myWord2 = "the";
        System.out.print("redact(''" + myWord1 + "'')= " + redact(myWord1) + ", ");
        System.out.println("redact(''" + myWord2 + "'')= " + redact(myWord2));
        System.out.println("============================================");
        System.out.println("3) create a function that finds if a string is in an array of strings");
        ExercisesConfidentialDocument myDocument = new ExercisesConfidentialDocument();
        String[] stringArray = {"Ana", "are", "mere"};
        System.out.println("The result of contains() method is : " + myDocument.contains(stringArray, "are"));
        System.out.println("============================================");
        System.out.println("4) create a function that receives a phrase (words separated with space) and returns it as an array of strings");
        System.out.println(Arrays.toString(myDocument.words("Ana are mere Merele sunt multe")));
        System.out.println("============================================");
        System.out.println("5) using all the functions created before");
        System.out.println(myDocument.confidential("Ana are mere multe mere bune", new String[]{"mere", "Ana"}));

    }


}
