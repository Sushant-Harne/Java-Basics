public class Fibonacci {
    static void main() {
        int start = 0;
        int end = 1;
        int sum = 0;

        System.out.print(start + " " + end + " ");
        for (int i = 0; i < 10; i++) {
            sum = start + end;
            System.out.print(sum + " ");
            int temp = sum;
            start = end;
            end = sum;
        }
    }
}
