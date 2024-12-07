import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Welcome to Bank of Brazil! Please, insert your name ");
    
        String name = scanner.nextLine();
        System.out.println("Great " + name + "! What is your bank account?");

        int id = scanner.nextInt();
        System.out.println("Very nice");
        System.out.println("Mr. "+ name + " you can use your bank account " + id + " now");

    }
}
