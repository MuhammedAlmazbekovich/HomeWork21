package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1 -> System.out.println(Days.DUYSHOMBU + " -  Джава техникалык сабагын окуу куну");
            case 2 -> System.out.println(Days.SHEYSHEMBI + " - Англис тил сабагын окуу куну");
            case 3 -> System.out.println(Days.SHARSHEMBI + " - Джава техникалык сабагын окуу куну");
            case 4 -> System.out.println(Days.BEYSHEMBI + " - Soft Skills сабагын окуу куну");
            case 5 -> System.out.println(Days.JUMA + " - Дуйшомбу жана шаршемби куну отулгон темаларды кайталоо куну");
            case 6 -> System.out.println(Days.ISHEMBI + " - Практика куну");
            case 7 -> System.out.println(Days.JEKSHEMBI + " - Вых");
            default -> System.out.println("Мындай кун жок");
        }

    }
}
