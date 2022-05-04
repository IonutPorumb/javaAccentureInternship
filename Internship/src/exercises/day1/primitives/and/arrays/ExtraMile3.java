package exercises.day1.primitives.and.arrays;

public class ExtraMile3 {
    public void printNamesAndAge(String [] namesArray, int[] ageArray){
        int i = 0;
        while (i < ageArray.length){
            System.out.println(namesArray[i] + " has " + ageArray[i] + " years");
            i++;
        }
    }

}
