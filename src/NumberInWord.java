public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(-6);
    }
    public static void printNumberInWord (int numero) {
        //if (numero < 0) numero = numero * -1;
        switch (numero) {
            case 0:
                System.out.printf("Zero");
                break;
            case 1:
                System.out.printf("One");
                break;
            case 2:
                System.out.printf("Two");
                break;
            case 3:
                System.out.printf("THREE");
                break;
            case 4:
                System.out.printf("Four");
                break;
            case 5:
                System.out.printf("Five");
                break;
            case 6:
                System.out.printf("Six");
                break;
            case 7:
                System.out.printf("Seven");
                break;
            case 8:
                System.out.printf("Eight");
                break;
            case 9:
                System.out.printf("Nine");
                break;
            default:
                System.out.printf("OTHER");
                break;
        }


    }
}
