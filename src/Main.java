import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //THIS WAS THE HOMEWORK FOR THIS CLASS














        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1>num2) {
            System.out.println(num1 + " is bigger than " + num2);
        } else{
            System.out.println(num2 + " is bigger than " + num1);
        }

        System.out.println("\n\nTargil 2 is starting now\n\n");
        System.out.println("Enter your grade:");
        int grade = input.nextInt();
        if (grade == 100) {
            System.out.println("Good job");
        } else if (grade < 60) {
            grade = grade * 11 / 10;
            System.out.println("Rounded grade is " + grade);
        }

        System.out.println("\n\nTargil 3 is starting now\n\n");
        System.out.println("Enter 3 angles");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();
        int anglesum = angle1 + angle2 + angle3;
        if (anglesum == 180) {
            System.out.println("they can make a triangle");
        }
        else {
            System.out.println("they cant make a triangle! a triangle has a total of 180 degrees!");
        }

        System.out.println("\n\nTargil 4 is starting now\n\n");
        System.out.println("Enter 2 numbers for a and b");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a != b) {
            b++;
            a++;
        }


        System.out.println("\n\nTargil 5 is starting now\n\n");

        System.out.println("int num = input.nextInt(); \n" +
                "if (num >= 0){\n" +
                "    System.out.println(\"yes\");\n" +
                "}\n" +
                "else{\n" +
                "    System.out.println(\"no\");");

        System.out.println("\n\nTargil 6 is starting now\n\n");
        System.out.println("Enter your social security number, the speed you drove in, and the speed allowed in that road");
        int socialID = input.nextInt();
        int speedDriven = input.nextInt();
        int allowedSpeed = input.nextInt();
        if (allowedSpeed >= speedDriven) {
            System.out.println("Good driving!");
        }
        else {
            int knas = (speedDriven - allowedSpeed) * 30;
            System.out.println("Social security number:\n" + socialID + "\n sum to pay: " + knas);
        }


    }
}
