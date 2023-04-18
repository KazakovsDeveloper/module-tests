package ru.otus.module.tests;

/**
 * Необходимо реализовать операцию нахождения квадратного уравнения. Предположим, что эта операция описывается следующей функцией с поправкой на конкретный язык программирования.
 * В ООП языках эта функция реализуется в виде метода класса.
 * solve(double a, double b, double c): double[]
 * здесь a, b, c - коэффициенты квадратного уравнения, функция возвращает список корней квадратного уравнения.
 */

public class SquareEquation {

    //ax2 + bx + c = 0
    public double[] solve(double a, double b, double c) {
        double discr = b * b - 4 * a * c;
        if (discr < 0) {
            return new double[0];
        }
        return new double[1];
    }
}
