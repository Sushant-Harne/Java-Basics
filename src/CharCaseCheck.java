import java.util.Scanner;

public class CharCaseCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch >= 65 && ch <= 90) {
            System.out.println("upper case character");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("lower case character");
        } else {
            System.out.println("Its not a alphabet...");
        }
    }
}
