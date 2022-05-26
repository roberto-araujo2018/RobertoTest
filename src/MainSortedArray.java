import java.util.Scanner;
public class MainSortedArray {
    public static void main (String[] args){
//        int[] myArrays =  {106,26,81,5,15};
//        SortedArray myArray = new SortedArray(myArrays);
//        myArray.getMyArray();
        //int[] myIntegers = SortedArray.getIntegers(5);
        SortedArray myArray = new SortedArray();
        int[] arrayInt = myArray.getIntegers(5);
        //System.out.println("array validation " + arrayInt[2]);
        myArray.printArray(arrayInt);
        myArray.sortIntegers(arrayInt);
        myArray.printArray(arrayInt);
    }


}
