package ex_26_2_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập vào số phần tử của mảng: ");
            int n = sc.nextInt();
            sc.nextLine();

            int[] arrNum = new int[n];
            List<Integer> primeNum = new ArrayList<>();

            System.out.println("Nhập giá trị cho " + n + " phần tử:");
            for (int i = 0; i < arrNum.length; i++) {
                System.out.print("Phần tử thứ " + (i+1) + ": ");
                arrNum[i] = sc.nextInt();
            }

            System.out.print("\nMảng vừa nhập: ");
            for (int num : arrNum) {
                System.out.print(num);
                if (num != arrNum[arrNum.length -1]) {
                    System.out.print(", ");
                }
            }

            //Sort to get max min and find prime number
            for (int i = 0; i < n-2; i++) {
                for (int j = i+1; j < n-1; j++) {
                    if (arrNum[i]>arrNum[j]) {
                        int temp = arrNum[i];
                        arrNum[i] = arrNum[j];
                        arrNum[j] = temp;
                    }
                }
                boolean isPrime = true;
                for (int k = 2; k <= Math.sqrt(arrNum[i]); k++) {
                    if(arrNum[i] % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNum.add(arrNum[i]);
                }
            }

            System.out.print("\nMax: "+arrNum[0]);
            System.out.print("\nMin: "+arrNum[n-1]);
            System.out.print("\nCác số nguyên tố trong mảng: ");
            for(Integer num: primeNum) {
                System.out.print(num);
                if(!num.equals(primeNum.get(primeNum.size() - 1))) {
                    System.out.print(", ");
                }
            }


            System.out.print("\nMảng tăng dần: ");
            for (int num : arrNum) {
                System.out.print(num);
                if (num != arrNum[arrNum.length -1]) {
                    System.out.print(", ");
                }
            }

        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex);
        }
    }
}
