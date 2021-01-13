package examples;
import java.util.Scanner;
public class example3_1 {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a grade: ");
            int grade = in.nextInt();
            if (grade < 60) {
                System.out.println('F');
            } else if (grade < 70) {
                System.out.println('D');
            } else if (grade < 80) {
                System.out.println('C');
            } else if (grade < 90) {
                System.out.println('B');
            } else {
                System.out.println('A');
            }
        }
    }

