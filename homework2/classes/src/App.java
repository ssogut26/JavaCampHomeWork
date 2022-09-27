public class App {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.update();
        customerManager.delete();

        int number = 1;
        int number2 = 10;
        number2 = number;
        number =50;
        System.out.println(number2);

        int [] numbers = new int[]{1,2,3};
        int [] numbers2 = new int[]{4,5,6};
        numbers2 = numbers;
        numbers[0] = 10;
        System.out.println(numbers2[0]);
    }
}
