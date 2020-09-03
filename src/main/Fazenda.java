package main;

import entities.Pato;

import java.util.Scanner;

public class Fazenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu();
        int option = sc.nextInt();

        Pato pato = null;
        switch(option){
            case 1:
                System.out.print("Digite a idade do animal:  ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite o tamanho do animal:  ");
                String size = sc.nextLine();
                System.out.print("Digite a cor da pena pato:  ");
                String color = sc.nextLine();
                pato = new Pato(age, size, color);
                break;
        }

        System.out.println(pato);
    }

    public static void menu(){
        System.out.println("Digite 1 para criar um pato.");
        System.out.println("Digite 2 para criar um morcego");
        System.out.println();
        System.out.println();
        System.out.print(">> ");
    }
}