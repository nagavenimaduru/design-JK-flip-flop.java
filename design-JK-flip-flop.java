import java.util.Scanner;

public class JKFlipFlop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JK Flip-Flop =====");

        System.out.print("Enter J (0 or 1): ");
        int J = sc.nextInt();

        System.out.print("Enter K (0 or 1): ");
        int K = sc.nextInt();

        System.out.print("Enter Previous Q (0 or 1): ");
        int Q = sc.nextInt();

        int nextQ;

        if (J == 0 && K == 0) {
            nextQ = Q;
        } 
        else if (J == 0 && K == 1) {
            nextQ = 0;
        } 
        else if (J == 1 && K == 0) {
            nextQ = 1;
        } 
        else if (J == 1 && K == 1) {
            nextQ = 1 - Q;
        } 
        else {
            System.out.println("Invalid input!");
            return;
        }

        System.out.println("Next State Q = " + nextQ);

        sc.close();
    }
}
