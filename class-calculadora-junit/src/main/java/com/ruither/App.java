package com.ruither;


import com.ruither.calculadora.Calculadora;

public class App
{
    public static void main( String[] args ) {

        Calculadora calculadora = new Calculadora();
        Double soma = calculadora.somar(2, 2);
        System.out.println(soma);
    }
}
