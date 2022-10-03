package at.ac.fhcampuswien;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class App {

    //todo Task 1
    public void sayHelloWorld()
    {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot()
    {
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals()
    {
        // input your solution here
        char myChar = 'Z';
        int myHex = 0xface;
        long myLong = 012;
        long myLong2 = 80L;
        float myFloat = 44e-1f;
        double myDouble = 5.5f;
        double myDouble2 = 8.88e1;
        double myDouble3 = 99.9;

        int sum;

        sum = (int) myChar +
                myHex +
                (int) myLong +
                (int) myLong2 +
                (int) myFloat +
                (int) myDouble +
                (int) myDouble2 +
                (int) myDouble3;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers()
    {
        // input your solution here
        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a+b);
    }

    //todo Task 5
    public void swapTwoNumbers()
    {
        // input your solution here
        int x = 0;
        int y = 0;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("Before Swap:");
        System.out.print("x: " );
        System.out.print("y: " );

        /*
        Test failed with this Output

        System.out.println("Before Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        */


        //https://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers()
    {
        // input your solution here
        int n1 = 0;
        int n2 = 0;

        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if (n1 > n2)
        {

            System.out.print("n1: n2: ");
            System.out.println("n1 > n2");

            /*
            System.out.println("n1 : " + n1);
            System.out.println("n2 : " + n2);
            System.out.println("n1 > n2");
            */
        }
        else if (n2 > n1)
        {
            System.out.print("n1: n2: ");
            System.out.println("n2 > n1");

            /*
            System.out.println("n1 : " + n1);
            System.out.println("n2 : " + n2);
            System.out.println("n2 > n1");
            */
        }
        else
        {
            System.out.print("n1: n2: ");
            System.out.println("n1 == n2");

            /*
            System.out.println("n1 : " + n1);
            System.out.println("n2 : " + n2);
            System.out.println("n1 == n2");
            */
        }
    }

    //todo Task 7
    public void ratingSalesPerson()
    {
        // input your solution here
        int x = 0;
        System.out.print("Enter annual Revenue: ");

        //System.out.println("Enter annual Revenue: ");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        if ((x < 0) || (x >= 100000))
        {
            System.out.println("Invalid Revenue");
        }
        else if ((x >= 0) && (x < 20000))
        {
            System.out.println("Poor Sales Revenue");
        }
        else if ((x >= 20000) && (x < 50000))
        {
            System.out.println("Average Sales Revenue");
        }
        else if ((x >= 50000) && (x < 80000))
        {
            System.out.println("Good Sales Revenue");
        }
        else if ((x >= 80000) && (x < 100000))
        {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate()
    {
        // input your solution here

        int x = 0;

        System.out.print("Enter CommissionClass: ");
        //System.out.println("Enter CommissionClass: ");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        switch (x)
        {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear()
    {
        // input your solution here
        int x = 0;

        System.out.print("Year: ");
        //System.out.println("Year: ");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        if ((x % 4 == 0) && (x % 400 == 0))
        {
            System.out.println("Leapyear");
        }
        else
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers()
    {
        // input your solution here
        int x = 0;
        int einer = 0;
        int zehner = 0;
        int hundert = 0;

        System.out.print("Number: ");
        //System.out.println("Number: ");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        if ((x >= 0) && (x <= 9))
        {
            // Case one digit number
            System.out.println(x);
        }
        else if ((x >= 10) && (x <= 99))
        {
            // Case two digit number
            einer = x % 10 *10;
            zehner = x / 10 % 10;
            System.out.println(zehner + einer);
        }
        else if ((x >= 100) && (x <= 999))
        {
            einer = x % 10 * 100;
            zehner = x / 10 % 10 * 10;
            hundert = x / 100;
            System.out.println(hundert + zehner + einer);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}