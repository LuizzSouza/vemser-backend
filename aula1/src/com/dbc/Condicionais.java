package com.dbc;

public class Condicionais {
    public static void main(String[] args) {
        // comando if (se)
//        boolean ehSolteiro = false;
//        if (ehSolteiro == true) {
//            System.out.println("é solteiro");
//        }
//        if (ehSolteiro) {
//            System.out.println("é solteiro");
//        }

        // comando else
//        int numero = 9;
//        int restoDaDivisaoPor2 = numero % 2;
//        if (restoDaDivisaoPor2 == 0) {
//            System.out.println(numero + " é par");
//        } else {
//            System.out.println(numero + " não é par");
//        }

        // comando else if
//        int numero = 9;
//        int restoDaDivisaoPor2 = numero % 2;
//
//        if (restoDaDivisaoPor2 == 0) {
//            System.out.println(numero + " é par");
//        } else if (restoDaDivisaoPor2 < 0) {
//            System.out.println(numero + " é negativo");
//        } else {
//            System.out.println(numero + " é positivo");
//        }

        // comando switch
        int sorteado = 1;
        switch (sorteado) {
            case 5:
                System.out.println("ganhou um tesla");
                break;
            case 2:
                System.out.println("ganhou uma casa na praia de frente para o mar");
                break;
            case 10:
                System.out.println("ganhou uma halls de cereja");
                break;
            default:
                System.out.println("infelizmente não foi dessa vez..");
                break;
        }
    }
}
