import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number =25;
        int remainder = number % 2;

        System.out.println(remainder);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        boolean isPrime = true;

        if (num == 1) {
            System.out.println("1 is neither prime nor composite.");
            return;
        }

        if (num <1) {
            System.out.println("Please enter a positive integer.");
            return;
        }


        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
