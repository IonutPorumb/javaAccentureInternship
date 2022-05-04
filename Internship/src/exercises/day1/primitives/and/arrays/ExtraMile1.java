package exercises.day1.primitives.and.arrays;

public class ExtraMile1 {
    short myMaxShort = 32_767;
    short myMinShort = -32_768;
    byte myMinByte = -128;
    byte myMaxByte = 127;
    int myInt = 100;
    long myLong = 1_000_000_000;
    float myFloat = 3.2f;
    double myDouble = 453.6;
    boolean myBoolean = true;
    char myChar = 'c';

    public void printMyPrimitive(){
        System.out.println("The minimum 'short' value is : "+myMinShort+ " and the maximum 'short' value is : "+myMaxShort);
        System.out.println("The minimum 'byte' value is : "+myMinByte+ " and the maximum 'byte' value is : "+myMaxByte);
        System.out.println("My 'int' value is : "+ myInt);
        System.out.println("My 'long' value is : "+ myLong);
        System.out.println("My 'float' value is : "+ myFloat);
        System.out.println("My 'double' value is : "+ myDouble);
        System.out.println("My 'boolean' value is : "+ myBoolean);
        System.out.println("My 'char' value is : "+myChar);

    }

}
