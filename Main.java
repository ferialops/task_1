package ru.vsu.cs.kunakhova_a_y;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.ROOT);

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите длину окружности: L = ");
        double l = scan.nextDouble();

        double r = l / (2 * Math.PI);

        double s = Math.PI * r * r;

        System.out.printf(
                "Радиус окружности равен = %1$.3f площадь круга = %2$.3f", r , s
        );
    }
}
