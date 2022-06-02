import java.util.*;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements (int count){
        Scanner scanner = new Scanner(System.in);
        int[] myIntArray = new int[count];
        for (int i = 0; i < count; i++){
            myIntArray[i] = scanner.nextInt();
        }
        return myIntArray;
    }

    private static int findMin(int[] myArray){
        int minNumb = myArray[0];
        for (int i = 0;i < myArray.length; i++){
            if (minNumb > myArray[i])
                minNumb = myArray[i];

        }
        return minNumb;
    }
}
