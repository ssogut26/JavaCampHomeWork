public class App {
    public static void main(String[] args) throws Exception {
        String message = "Hello World";
        System.out.println(message);
        String newMessage = city();
        System.out.println(newMessage);
        int number = numberAddition(5,20);
        System.out.println(number);
        int total = numberAddition2(5,20, 59, 591);
        System.out.println(total);
    }
    public static void add () {

    }
    public static void delete () {

    }
    public static void update () {

    }
    public static int numberAddition (int number1 , int number2) {
        return number1 + number2;
    }

    public static int numberAddition2 (int... numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return sum;
    }  

    public static String city () {
        return "Washington";
    }
}
