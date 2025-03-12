import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.printf("Hello %s",name);

        input.close();
    }
}
