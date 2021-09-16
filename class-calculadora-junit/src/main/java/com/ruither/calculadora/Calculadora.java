package com.ruither.calculadora;

public class Calculadora {
	public double somar(double num1, double num2){
		return num1 + num2;
	}

	public double subtrair(double num1, double num2){
		return num1 - num2;
	}

	public double multiplicar(double num1, double num2){
		return num1*num2;
	}

	public double dividir (double num1, double num2){
		Double result = num1/num2;
		if(num2 == 0.0){
			return -1.0;
		}
		return result;
	}



}
