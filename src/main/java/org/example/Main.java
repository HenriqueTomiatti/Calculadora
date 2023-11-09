package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Resultado da soma: " + Calculadora.add(num1, num2));
        System.out.println("Resultado da subtração " + Calculadora.subtract(num1, num2));
        System.out.println("Resultado da multiplicação " + Calculadora.multiply(num1, num2));
        System.out.println("Resultado da divisão " + Calculadora.divide(num1, num2));
    }
}