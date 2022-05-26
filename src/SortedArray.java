import java.util.*;
public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);

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
        System.out.println(Arrays.toString(myArray));
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
