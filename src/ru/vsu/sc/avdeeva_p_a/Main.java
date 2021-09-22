package ru.vsu.sc.avdeeva_p_a;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.println("Введите длину сторону квадрата : ");
        double side = readSide();

        double radious = getRadious(side); // формула нахождения радиуса через сторону
        double square_area = getSquareArea(side); // площадь квадрата
        double circle_area = getCircleArea(radious); // площадь круга
        double result = getResultFormula(square_area, circle_area); // площадь закрашеной части

        System.out.printf("Площадь заштрихованной части = %.1f ", result);


    }

    static double readSide() {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        if (value <= 0) {
            System.out.println("Error");
            System.exit(1);
        }
        return value;
    }

    static double getRadious(double side) {
        return (side / 2);
    }

    static double getSquareArea(double side) {
        return side * side;
    }

    static double getCircleArea(double radious) {
        return Math.PI * radious * radious;
    }

    static double getResultFormula(double square_area, double circle_area) {
        return ((square_area - circle_area) / 2) + circle_area;

    }

}



