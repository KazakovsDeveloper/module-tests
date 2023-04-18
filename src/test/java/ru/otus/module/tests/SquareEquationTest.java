package ru.otus.module.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SquareEquationTest {

    private SquareEquation squareEquation;

    @BeforeEach
    public void init() {
        squareEquation = new SquareEquation();
    }

    /**
     * Написать тест, который проверяет, что для уравнения x^2+1 = 0 корней нет (возвращается пустой массив)
     * Написать минимальную реализацию функции solve, которая удовлетворяет данному тесту.
     */

    @Test
    @DisplayName("x^2+1 = 0 корней нет")
    public void solveTestEquationHasNotRoots() {

        double a = 0;

        double b = 2;

        double c = 3;

        double[] result = squareEquation.solve(a, b, c);

        assertEquals(0, result.length);
    }

}