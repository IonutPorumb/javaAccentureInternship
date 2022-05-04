package exercises.day1.primitives.and.arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1++++++++++++++++++++++++++++++++++++");
        ExtraMile1 myExtraMile1 = new ExtraMile1();
        myExtraMile1.printMyPrimitive();

        System.out.println("Exercise 2++++++++++++++++++++++++++++++++++++");
        ExtraMile2 extraMile2 = new ExtraMile2();
        extraMile2.printElements();

        System.out.println("Exercise 3++++++++++++++++++++++++++++++++++++");
        ExtraMile3 extraMile3 = new ExtraMile3();
        String[] names = new String[5];
        names[0] = "Michael";
        names[1] = "Ana";
        names[2] = "Mary";
        names[3] = "John";
        names[4] = "David";
        int[] age = new int[5];
        age[0] = 10;
        age[1] = 15;
        age[2] = 25;
        age[3] = 25;
        age[4] = 37;
        extraMile3.printNamesAndAge(names, age);
    }
}
