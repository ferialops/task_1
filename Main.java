package ru.vsu.cs.kunakhova_a_y;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите длину окружности: L = ");
        double length = scan.nextDouble();

        if (length <= 0){
            System.out.println("ВВедено некорректное значение.");
        }
        else {

            double radius = length / (2 * Math.PI);

            double area = Math.PI * radius * radius;

            System.out.printf(
                    "Радиус окружности равен = %1$.3f площадь круга = %2$.3f", radius, area
            );
        }
    }
}
