package ru.otus.module.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareEquationTest {

    private SquareEquation squareEquation;

    @BeforeEach
    public void init() {
        squareEquation = new SquareEquation();
    }

    /**
     * Написать тест, который проверяет, что для уравнения x^2+1 = 0 корней нет (возвращается пустой массив)
     * Написать минимальную реализацию функции solve, которая удовлетворяет данному тесту.
     * ax2 + bx + c = 0
     */

    @Test
    @DisplayName("x^2+1 = 0 корней нет")
    public void solveTestEquationHasNotRoots() {

        double a = 1;

        double b = 0;

        double c = 1;

        double[] result = squareEquation.solve(a, b, c);

        assertEquals(0, result.length);
    }

    /**
     * Написать тест, который проверяет, что для уравнения x^2-1 = 0 есть два корня кратности 1 (x1=1, x2=-1)
     * Написать минимальную реализацию функции solve, которая удовлетворяет тесту из п.5.
     */

    @Test
    @DisplayName("x^2-1 = 0 есть два корня кратности 1 (x1=1, x2=-1)")
    public void solveTestEquationHasTwoRoots() {

        double a = 1;

        double b = 0;

        double c = -1;

        double [] expected = {1.0, -1.0};

        double[] result = squareEquation.solve(a, b, c);

        assertArrayEquals(expected, result);
    }

    /**
     * Написать тест, который проверяет, что для уравнения x^2+2x+1 = 0 есть один корень кратности 2 (x1= x2 = -1).
     * Написать минимальную реализацию функции solve, которая удовлетворяет тесту из п.7.
     */

    @Test
    @DisplayName("x^2+2x+1 = 0 есть один корень кратности 2 (x1= x2 = -1)")
    public void solveTestEquationHasOneRoot() {

        double a = 1;

        double b = 2;

        double c = 1;

        double [] expected = {-1.0, -1.0};

        double[] result = squareEquation.solve(a, b, c);

        assertArrayEquals(expected, result);
    }

}