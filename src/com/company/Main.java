package com.company;
import static com.company.Calculadora.*;
import static com.company.Media.*;
import static com.company.ReverterString.*;

public class Main {

    public static void main(String[] args) {
//        ValoresDeEntrada();
        String palavra = ReceberFrase();
        if(new StringBuilder(palavra).reverse().toString().equals(palavra)){
            System.out.println("É palindromo!!!");
        }
        else
        System.out.println("ERROU!!! NÃO É PALINDOROMO");
        Media media = new Media();

    }
}
