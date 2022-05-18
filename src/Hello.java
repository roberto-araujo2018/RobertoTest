public class Hello {
    public static void main(String[] args) {
        //System.out.println("teste");
        printDayOfWeek(1);
    }
    private static void printDayOfWeek(int day){
        switch(day) {
            case 0:
                System.out.printf("Sunday");
                break;
            case 1:
                System.out.printf("Monday");
                break;
            case 2:
                System.out.printf("Tuesday");
                break;
            case 3:
                System.out.printf("Wednesday");
                break;
            case 4:
                System.out.printf("Thursday");
                break;
            case 5:
                System.out.printf("Friday");
                break;
            case 6:
                System.out.printf("Saturday");
                break;
            default:
                System.out.printf("Invalid day");
                break;
        }
    }
}
