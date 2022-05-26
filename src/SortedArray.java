import java.util.*;
public class SortedArray {
    //private int size;
    //private int[] myArray = new int[size];
    private static Scanner scanner = new Scanner(System.in);

//    public SortedArray(int[] myArray) {
//        this.myArray = myArray;
//    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length ; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }
    public static int[] getIntegers(int number){
        int[] myArray = new int [number];
        for (int i =0; i < number; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[array.length - i - 1];
        }
        return sortedArray;
    }
}
