import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Entre com ano de nascimento: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;
            System.out.println("Your name is " + name + " idade " + age);
        }
        else {
            System.out.printf("Idade invalida.");
        }
        scanner.close();

    }
}