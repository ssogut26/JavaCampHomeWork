public class App {
    public static void main(String[] args) throws Exception {
        char letter = 'S';

        // check if is vowel
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is a consonant, please write a vowel");
            return;
        }

       switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter + " is not a thin vowel.");
                break;
            default:
                System.out.println(letter + " is thin vowel.");
        }
    }
}
