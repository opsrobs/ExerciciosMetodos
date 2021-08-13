package com.company;

import javax.swing.*;

public class Media {
    public static int CalcularMedia(int qtd){
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas notas terão: "));
        return  qtd;
    }
    public static int ValorDasNotas(){
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota: "));
        return ValorDasNotas();
    }
    public static int CalcularMedia(int notas[]){
        int numeroNotas=CalcularMedia(0);
        int nota=0;
        notas= new int[numeroNotas];

            for (int i = 0; i < notas.length; i++) {
                notas[i]=ValorDasNotas();
                nota = notas[i];
            }
        return nota;
    }
//    public static double CalcularMedia(double media){
//        media +=CalcularMedia()
//
//    }
}
