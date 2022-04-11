package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        switch (num) {
            case "Monday" -> System.out.println(Days.MONDAY + " куну  Джава техникалык сабагын окуу куну" );
            case "Tuesday" -> System.out.println(Days.TUESDAY + " куну Англис тил сабагын окуу куну");
            case "Wednesday" -> System.out.println(Days.WEDNESDAY + " куну Джава техникалык сабагын окуу куну");
            case "Thursday" -> System.out.println(Days.THURSDAY + " куну Soft Skills сабагын окуу куну");
            case "Friday" -> System.out.println(Days.FRIDAY + " куну Дуйшомбу жана шаршемби куну отулгон темаларды кайталоо куну");
            case "Saturday" -> System.out.println(Days.SATURDAY + " куну Практика куну");
            case "Sunday" -> System.out.println(Days.SUNDAY + " куну эс алуу куну");
            default -> System.out.println("Мындай кун жок");
        }
    }
}
