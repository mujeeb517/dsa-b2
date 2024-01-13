import java.util.Scanner;

public class Main {
    //    Entry point
    // Java SE
    static void printHello() {
        System.out.println("Hello World");
    }
    // callee
    // y = mx + c
    // one value
    // conditional statements
    // switch
    static void add(int a, int b) {
//        hard coding
        int c = a + b;
        System.out.println(c);
    }

    static int sub(int a, int b) {
        int c = a - b;
        return c;
    }

    static double add(double a, double b) {
        double c = a + b;
        return c;
    }

    static boolean hasPassed(int marks) {
        if (marks < 40) {
            return false;
        }
        return true;
    }

    static void printGrade(int m1, int m2, int m3, int m4) {
        int securedMarks = m1 + m2 + m3 + m4;
        int totalMarks = 400;
        double agg = ((double) securedMarks / totalMarks) * 100;

        // if else if ladder
        if (agg >= 70) {
            System.out.println("Distinction");
        } else if (agg >= 60) {
            System.out.println("First Class");
        } else if (agg >= 50) {
            System.out.println("Second Class");
        } else if (agg >= 40) {
            System.out.println("Third Class");
        } else {
            System.out.println("Failed");
        }

//    categories
// 0 - 50 : 2rs
// 51- 200: 3rs
// 200 : 5rs

// 250
// 50 * 2 = 100
// 150 * 3 = 450
// 50*5 = 250
    }

    static void calculateGrade(int agg) {
        switch (agg) {
            case 70:
                System.out.println("Distinction");
                break;
            case 60:
                System.out.println("First Class");
                break;
            case 50:
                System.out.println("Second Class");
                break;
            case 40:
                System.out.println("Third Class");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }

    public static void main(String[] args) {
        // variables, data types, operators
        // && and || or
        // methods or functions
        // calling
        // caller
//        add(20, 10);
//        add(-10, 20);
//        add(100, 200);

//        boolean res = hasPassed(39);
//        System.out.println(res);

//        Arrays
//        primitives or scalar
//        complex

        // inbuilt
        // arrays: collection of similar data types
        // index
        // boolean false
        // size is fixed
        int[] arr = {
                10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        };
    }
}
