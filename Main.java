package ru.vsu.cs.kunakhova_a_y;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double length = readLength();

        double radious = calculateRadious(length);

        double area = calculateArea(radious);

        printResult(radious, area);

    }

    static double readLength() { 
        System.out.print("Введите длину окружности: L =");

        Scanner scan = new Scanner(System.in);
        double length = scan.nextDouble();

        if (length <= 0){
            System.out.print("Введено неверное значение.");
            System.exit(1);
        }
            return length;
        }

    static double calculateRadious(double length){ return length / (2 * Math.PI);}

    static double calculateArea(double radious) {return Math.PI * radious * radious;}

    static void printResult(double radious, double area){
        System.out.printf(
                "Радиус окружности равен = %1$.3f площадь круга = %2$.3f", radious, area);
    }

}
