package com.company;
import java.util.Scanner;
class Main {

    public static String decimalToHex(int number) {
        return Integer.toHexString(number);
    }

    public static String decimalToBinary(int value) {
        String str = "";
        while(value > 0) {
            if(value % 2 == 1) {
                str = "1"+str;
            } else {
                str = "0"+str;
            }
            value /= 2;
        }
        return str;
    }
    public static int binaryToDecimal(String a) {
        return Integer.parseInt(a, 2);
    }

    public static void main(String[] args) {
        System.out.println("Введите 1, если хотите для конвертации числа из 10-ричной системы\n" +
                "счисления в 16-ричную");
        System.out.println("Введите 2, если хотите для конвертации числа из 10-ричной системы\n" +
                "счисления в 2-ичную");
        System.out.println("Введите 3, если хотите для конвертации числа из 12-ичной системы\n" +
                "счисления в 10 - ичную");
        Scanner sc = new Scanner(System.in);
        int variant = sc.nextInt();

        switch (variant) {
            case 1:
                System.out.println("Введите число от 0 до 10000");

                int value = sc.nextInt();
                if (value >= 0 && value <= 10000) {
                    System.out.println(decimalToHex(value));
                } else {
                    System.out.println("Value out of the range [0;10000]");
                }
                break;
            case 2:
                System.out.println("Введите число от 0 до 10000");
                int dec = sc.nextInt();
                if (dec >= 0 && dec <= 10000) {
                    System.out.println(decimalToBinary(dec));
                } else {
                    System.out.println("Value out of the range [0;10000]");
                }
                break;
            case 3:
                System.out.println("Введите число в двоичной системе счисления");
                int tenmpline = sc.nextInt();
                String bin  = Integer.toString(tenmpline);
                System.out.println(binaryToDecimal(bin));



        }
}
}
