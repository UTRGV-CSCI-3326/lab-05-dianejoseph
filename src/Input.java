import java.util.Scanner;

public class Input{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your weight (to the nearest pound): ");
        int weight = scanner.nextInt();
        System.out.print("Are you a smoker (true or false)? ");
        boolean smoker = scanner.nextBoolean();
        scanner.close();

        System.out.print("\n" + name + "\n");
        System.out.print(age + "\n");
        System.out.print(weight + "\n");
        System.out.print(smoker + "\n"); 
    }
}
