public class App {
    public static void main(String[] args) throws Exception {

        int a = 220;
        int b = 284;
        int sumA = 0;
        int sumB = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sumA += i;
            }
        }
        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                sumB += i;
            }
        }
        if (sumA == b && sumB == a) {
            System.out.println("Friend number");
        } else {
            System.out.println("Not friend number");
        }

    }
}
