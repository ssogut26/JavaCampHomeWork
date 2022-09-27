public class App {
    public static void main(String[] args) throws Exception {
        int [] numbers = {1,5,62,2,7,56,54,32,124,59};
        int requiredNumber = 111;

        boolean hasRequiredNumber = false;
        for (int number : numbers) {
            if (number == requiredNumber) {
                hasRequiredNumber = true;
                break;
            }
        }
        if (hasRequiredNumber) {
            System.out.println("Numbers has required number");
        } else {
            System.out.println("Numbers has not required number");
        }

    }
}
