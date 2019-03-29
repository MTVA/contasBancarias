package com.company;

import entities.contaBancaria;

import java.util.Scanner;
import entities.contaBancaria;

public class Main {

    public static void main(String[] args) {

        contaBancaria c1; // = new contaBancaria(1,"Marcos",500.0);
        Scanner sc = new Scanner(System.in);
        double dep = 100 , sac = 200;
        String nome;
        int aux=0;

        System.out.println("Qual o nome do titular?");
        nome = sc.next();


        System.out.println("Deseja realizar um deposito inicial? S-1 N-2");
        aux = sc.nextInt();
        if(aux==1){
            System.out.println("Qual o valor de deposito inicial?");
            aux=sc.nextInt();
            c1 = new contaBancaria(1,nome,aux);
        }
        else{
            c1 = new contaBancaria(1,nome, 0);
        }


        System.out.println("Valor Inicial: \n");
        System.out.println(c1.toString());

        //loop inicial
        aux=1;
        while(aux!=0) {
            System.out.println("Deseja fazer uma operação? N-0 Deposito-1 Saque-2");
            aux = sc.nextInt();

            switch (aux){
                //Deposito
                case 1:
                    System.out.println("Quanto deseja depositar?");
                    dep=sc.nextDouble();
                    c1.fazerDeposito(dep);
                    System.out.printf("\n\nDeposito %f: \n", dep);
                    System.out.println(c1.toString());
                    break;

                //Saque
                case 2:
                    System.out.println("Quanto deseja sacar?");
                    dep=sc.nextDouble();
                    c1.fazerSaque(dep);
                    System.out.printf("\n\nSaque %f: \n", dep);
                    System.out.println(c1.toString());
                    break;
            }

        }


        sc.close();

    }
}
