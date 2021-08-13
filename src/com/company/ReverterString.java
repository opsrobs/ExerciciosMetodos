package com.company;

import javax.swing.*;

public class ReverterString {
    public static String ReceberFrase(){
        String frase= JOptionPane.showInputDialog("Informe a frase para verificar se é PALINDROMA: ");

        return frase;
    }
//    public static String reverse(String tx){
//        StringBuilder frase = new StringBuilder(ReceberFrase()).reverse().toString();
//        return frase.toString();
//    }

//    public static boolean verificador(){
//        if (reverse(ReceberFrase()).equals(ReceberFrase())){
//            return true;
//        }
//
//        return false;
//    }

}
