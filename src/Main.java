import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        double userGrade;
        int testCount = 0;
        double testSum = 0;
        double testAverage;
        String continueYN = "";

        //asks the user their grade input and checks
        do {
            System.out.println("What is your grade?");
            if (scan.hasNextDouble()) {
                userGrade = scan.nextDouble();
                scan.nextLine(); //clears the rest of the line, the buffer
                if (userGrade >= 0 && userGrade <= 100) {
                    testCount++;
                    testSum += userGrade;
                    System.out.println("Do you want to continue? [Y/N]");
                    continueYN = scan.nextLine();
                } else {
                    System.out.println("You have entered a grade outside the range of [0-100]. Please try again.");
                }
            } else {
                System.out.println("You have entered an invalid data type. Please try again.");
            }
        } while (continueYN.equalsIgnoreCase("n"));

        if (testCount != 0) {
            testAverage = testSum / testCount;
            System.out.println("Your test average is " + testAverage + ".");
        } else {
            System.out.println("You did not enter any grade.");
        }
    }
}