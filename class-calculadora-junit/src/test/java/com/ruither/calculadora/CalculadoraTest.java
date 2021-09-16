package com.ruither.calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void whenGivenTwoNumbersIsGonnaSumAndReturnExpectedResult(){
        // Given
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double expected = 4.0;
        Double result = calculadora.somar(numero1, numero2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenGivenTwoNumversIsGonnaSubtractAndReturnExpectedResult(){
        // Given
        calculadora = new Calculadora();
        Double numero1 = 4.0;
        Double numero2 = 4.0;
        Double expected = 0.0;


        Double result = calculadora.subtrair(numero1, numero2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenGivenTwoNumbersIsGonnaMultiplyAndReturnExpectedResult(){
        // Given
        calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double expected = 4.0;
        Double result = calculadora.multiplicar(numero1, numero2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenGivenTwoNumbersIsGonnaDivideAndReturnExpectedResult() {
        // Given
        calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double expected = 1.0;

        Double result = calculadora.dividir(numero1, numero2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenGivenSecondNumberMinorThenZeroShouldReturnAnotherValue(){
        // Given
        calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 0.0;
        Double expected = -1.0;

        Double result = calculadora.dividir(numero1, numero2);
        Assertions.assertEquals(expected, result);

    }

}
