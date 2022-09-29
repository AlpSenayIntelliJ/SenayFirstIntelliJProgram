import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hello World! Give me one number to divide by 2: ");
        int userNum = input.nextInt();

        if(userNum%2 != 0){
            System.out.println("This is not an even number so I can't divide it by 2!");
            System.exit(0);
        }

        int finalNum = (userNum/2);
        System.out.println("Your new number is: " + finalNum);
        System.out.println("I'm a change :)");
    }
}
