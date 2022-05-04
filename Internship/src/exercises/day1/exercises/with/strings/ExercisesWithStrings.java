package exercises.day1.exercises.with.strings;
import java.util.Random;

public class ExercisesWithStrings {

    // Ex 1)  Print all strings starting with letter A
    public static void namesWithA(String[] names){
        for (String s: names){
            if(s.indexOf("A")==0){
                System.out.print(s+", ");
            }
        }
    }

    // Ex 2) Print all strings containing a given string
    public static void containingGivenString(String [] names, String givenString){
        for(String s:names){
            if(s.contains(givenString)){
                System.out.print(s+", ");
            }
        }
    }

    // Ex 3)  For any string containing r, replace it with *
    public static void replaceR(String [] names){
        for(String s: names){
            if (s.contains("r")){
               System.out.print(s.replace("r", "*")+", ");
            }
        }
    }

    //  Ex 4) Print the first 3 characters of each string
    public static void printFirst3Char(String[] names){
        for(String s:names){
            if(s.length()<= 3){
            System.out.print(s+", ");
        }
            else{
                System.out.print(s.substring(0, 3)+", ");
            }
        }
    }

    //  Ex 5) Print a random letter from it.
    public static void printRandom(String[] names){
        Random random = new Random();
        for(String s:names){
            int i = random.nextInt(s.length());
            System.out.print(s.charAt(i)+", ");
        }
    }

    //  Ex 6) create a function that receives a name with 3 parts: Maria Clara Popescu
    //  and abbreviates the middle one: Maria C. Popescu. This happens only if there are 3 parts!
    public static void nameAbbreviation(String [] names){
        for(String s:names){
            int whiteSpace = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    whiteSpace++;
                }
            }
            if(whiteSpace == 2){
                String [] namesArray = s.split(" ");
                System.out.print(namesArray[0] +" "+namesArray[1].charAt(0)+". "+namesArray[2]+", ");
            }
        }
    }

    public static void main(String[] args){
        String [] names = {"Andrei", "John", "Cristian Tudor Popescu", "Michael", "Ana", "Simona", "Angela", "Adrian", "Dan",
                "Constantin", "David", "Monica", "Maria Clara Popescu", "Ilie Dumitrescu", };
        System.out.println("1)  Print all strings starting with letter A");
        namesWithA(names);
        System.out.println();
        System.out.println("2) Print all strings containing a given string");
        containingGivenString(names, "an");
        System.out.println();
        System.out.println("3)  For any string containing r, replace it with *");
        replaceR(names);
        System.out.println();
        System.out.println("4) Print the first 3 characters of each string");
        printFirst3Char(names);
        System.out.println();
        System.out.println("5) Print a random letter from it.");
        printRandom(names);
        System.out.println();
        System.out.println("6) create a function that receives a name with 3 parts: Maria Clara Popescu and abbreviates the middle one: Maria C. Popescu. This happens only if there are 3 parts!");
        nameAbbreviation(names);

    }


}

