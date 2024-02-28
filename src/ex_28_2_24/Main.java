package ex_28_2_24;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try(Scanner sc  = new Scanner(System.in)) {
            System.out.print("Nhap vao so nguyen n: ");
            int n = sc.nextInt();
            System.out.println("S(n) = 1 + 2 + 3 + … + n:");
            System.out.println("Result: " + sumEx1(n));
            System.out.println("S(n) = 1^2 + 2^2 + … + n^2:");
            System.out.println("Result: " + sumEx2(n));
            System.out.println("S(n) = 1 + ½ + 1/3 + … + 1/n:");
            System.out.println("Result: " + sumEx3(n));
        }
    }


    public static int sumEx1(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumEx1(n-1);
    }

    public static long sumEx2(int n) {
        if(n == 0) {
            return 0;
        }
        return (long) (Math.pow(n, 2) + sumEx2(n-1));
    }

    public static float sumEx3(int n) {
        if(n == 0) {
            return 0;
        }
        return (1.0f/n) + sumEx3(n-1);
    }
}
