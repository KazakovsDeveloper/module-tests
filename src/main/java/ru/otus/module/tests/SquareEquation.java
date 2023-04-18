package ru.otus.module.tests;
import org.apache.commons.math3.util.Precision;

/**
 * Необходимо реализовать операцию нахождения квадратного уравнения. Предположим, что эта операция описывается следующей функцией с поправкой на конкретный язык программирования.
 * В ООП языках эта функция реализуется в виде метода класса.
 * solve(double a, double b, double c): double[]
 * здесь a, b, c - коэффициенты квадратного уравнения, функция возвращает список корней квадратного уравнения.
 */

public class SquareEquation {
    //ax2 + bx + c = 0
    public double[] solve(double a, double b, double c) {

        double epsilon = 0.000001d;
        if (Precision.equals(a, 0.0, epsilon)) {
            throw new RuntimeException("Коэффициент a не может быть = 0");
        }

        double discr = b * b - 4 * a * c;
        double[] result = new double[2];

        if (discr < 0) {
            return new double[0];
        } else if (discr > 0) {
            result[0] = (-b + Math.sqrt(discr)) / (2 * a);
            result[1] = (-b - Math.sqrt(discr)) / (2 * a);
            return result;
        } else {
            result[0] = -b / (2 * a);
            result[1] = result[0];
            return result;
        }
    }
}
