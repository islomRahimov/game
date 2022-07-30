package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

public static Math math = new Math();
public static Scanner scanner = new Scanner(System.in);
public static Random random = new Random();
public static int answer;
public static int countT = 0;
public static int countN = 0;

    public static void main(String[] args) {


        // write your code here


        String[] a1;
        a1 = new String[100];
        int b1[] = new int[100];
        int count = 0;
        int res = 0;

        while (true) {
            System.out.println("1-> Start Game");
            System.out.println("2-> Rating");
            System.out.print("= ");
            int n = scanner.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.print("Name ");
                    scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    for (int i = 0; i < count; i++) {

                        {
                            int a = random.nextInt(10);
                            int b = random.nextInt(10);
                            int c = random.nextInt(4);
                            math.test(a, b, c);
                            answer = scanner.nextInt();
                        }
                        if (answer == math.res) {
                            countT++;

                        } else {
                            countN++;
                        }

                    }
                    a1[count] = name;
                    b1[count] = countT;
                    count++;
                }
                case 2 -> {
                    System.out.println("===Rating===");
                    for (int i = 0; i < count; i++) {
                        System.out.println(a1[i]);
                        System.out.println(b1[i]);


                    }


                }


            }
        }

    }

}
