package exercises.day2.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    //Ex 2) write a function that receives an array parameter and prints it out to console
    public static void printArrayElements(Object[] givenArray) {
        System.out.print("[");
        for (int i = 0; i < givenArray.length; i++) {
            if (i < givenArray.length - 1) {
                System.out.print(givenArray[i] + ", ");
            } else {
                System.out.print(givenArray[i]);
            }
        }
        System.out.println("]");
    }

    //Ex 3) write a function that receives an array parameter and prints it out every 2nd element to console
    public static void printEvery2NdArrayElement(Object[] givenArray) {
        System.out.print("[");
        for (int i = 0; i < givenArray.length; i += 2) {
            if (i < givenArray.length - 2) {
                System.out.print(givenArray[i] + ", ");
            } else {
                System.out.print(givenArray[i]);
            }
        }
        System.out.println("]");
    }

    //Ex 4) write a function that receives an array of strings. Print out 2 elements per line.
    public static void print2ElementsPerLine(String[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            if (i % 2 == 0) {
                System.out.print(givenArray[i] + ", ");
            } else {
                System.out.println(givenArray[i]);
            }
        }
    }

    //  Ex 5) write a function that receives a String and an integer and returns the string having the fixed size and filling in with empty space.
//   The string will be aligned to the right
    public static String formatString(String givenString, int givenInt) {
        int spacePrint = givenInt - givenString.length();
        StringBuilder result = new StringBuilder();
        while (spacePrint > 0) {
            result.append(" ");
            spacePrint--;
        }
        return result.toString().concat(givenString);
    }

    //  Ex 6) write a function that receives an int and returns the sum of its even figures
    public static int evenFigureSum(int givenInt) {
        int sum = 0;
        int givenNo = givenInt;
        while (givenNo != 0) {
            if ((givenNo % 10) % 2 == 0) {
                sum += givenNo % 10;
            }
            givenNo /= 10;
        }
        if (sum == 0) {
            System.out.println("There are no even figures in the given integer!");
        }
        return sum;
    }

    //  7) Write a function that receives two numbers n and k. Return an array with all the integers lower than n that divide evenly with k.
    public static List<Integer> allIntNoLowerThanNThatDivideEvenlyWithK(int n, int k) {
        List<Integer> resultLIst = new ArrayList<>();
        int i = 0;
        while (i < n) {
            if (i % k == 0) {
                resultLIst.add(i);
            }
            i++;
        }
        return resultLIst;
    }


    public static void main(String[] args) {
        //Ex 1) Count to 100 using while, do-while and for
        System.out.println("1) Count to 100 using while");
        int i = 0;
        while (i <= 100) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();
        System.out.println("===========================================================");
        System.out.println("1) Count to 100 using do-while");
        i = 0;
        do {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
        System.out.println();
        System.out.println("===========================================================");
        System.out.println("1) Count to 100 using for");
        for (i = 0; i <= 100; i++) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("===========================================================");
        System.out.println("2) write a function that receives an array parameter and prints it out to console");
        printArrayElements(new String[]{"Ana", "are", "mere", "foarte", "bune", "Merele", "sunt", "verzi"});
        System.out.println();
        System.out.println("===========================================================");
        System.out.println("3) write a function that receives an array parameter and prints it out every 2nd element to console");
        printEvery2NdArrayElement(new String[]{"Ana", "are", "mere", "foarte", "bune", "Merele", "sunt", "verzi"});
        System.out.println();
        System.out.println("===========================================================");
        System.out.println("4) write a function that receives an array of strings. Print out 2 elements per line.");
        print2ElementsPerLine(new String[]{"Ana", "are", "mere", "foarte", "bune", "Merele", "sunt", "verzi"});
        System.out.println();
        System.out.println("===========================================================");
        System.out.println("5) write a function that receives a String and an integer and returns the string having the fixed size and filling in with empty space. ");
        System.out.print("''");
        System.out.print(formatString("abc", 10));
        System.out.println("''");
        System.out.println();
        System.out.println("===========================================================");
        System.out.println("6) write a function that receives an int and returns the sum of its even figures");
        System.out.println("The sum of the even figures in the given integer is : " + evenFigureSum(12345));
        System.out.println();
        System.out.println("===========================================================");
        System.out.println("7) Write a function that receives two numbers n and k. Return an array with all the integers lower than n that divide evenly with k.");
        System.out.println(allIntNoLowerThanNThatDivideEvenlyWithK(20, 4));
    }

}
