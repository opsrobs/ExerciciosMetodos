package com.company;

import javax.swing.*;
import java.text.DecimalFormat;

public class Calculadora {
    public static int somar(int a, int b){
        int soma= a+b;
        return soma;
    }
    public static int subtrair(int a, int b){
        int subtracao= a-b;
        return subtracao;
    }
    public static int multiplicar(int a, int b){
        int multiplicacao= a*b;
        return multiplicacao;
    }
    public static String dividir(float a, float b){
        DecimalFormat df = new DecimalFormat("###,###,##0.000");
        float divisao= a/b;
        return df.format(divisao);
    }
    public static void ValoresDeEntrada(){
        int ValorUm = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        int ValorDois = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
        System.out.println("Adição: ");
        System.out.println(somar(ValorUm,ValorDois));
        System.out.println("=========\n");
        System.out.println("Subtração: ");
        System.out.println(subtrair(ValorUm,ValorDois));
        System.out.println("=========\n");
        System.out.println("Multiplicação: ");
        System.out.println(multiplicar(ValorUm,ValorDois));
        System.out.println("=========\n");
        System.out.println("Divisão: ");
        System.out.println(dividir(ValorUm,ValorDois));

    }
}
