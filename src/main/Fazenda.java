package main;

import entities.*;

import java.util.Scanner;

public class Fazenda {
    static Scanner sc = new Scanner(System.in);
    static Animal animal;
    static Voador flyingAnimal;
    static Ave bird;
    static Mamifero mammal;

    public static void main(String[] args) {

        int option;
        do{
            printMenu();
            option = sc.nextInt();
            sc.nextLine();
            handleInput(option);
            if(animal!=null)printValoresAnimal(animal);
            if(bird != null) System.out.println(bird.porOvo());
            if(mammal != null) System.out.println(mammal.amamentar());
            if(flyingAnimal != null) System.out.println(flyingAnimal.voar());
            System.out.println("--------------");
        }
        while(option != 5);



    }

    public static void handleInput(int option){
        if(option >=5 ) return;

        System.out.print("Digite a idade do animal:  ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o tamanho do animal:  ");
        String size = sc.nextLine();

        String color;
        switch(option){
            case 1:
                System.out.print("Digite a cor da pena do pato:  ");
                color = sc.nextLine();
                bird = new Pato(age, size, color);
                flyingAnimal = new Pato(age,size,color);
                animal = new Pato(age,size,color);
                break;
            case 2:
                System.out.print("Digite a cor do pelo do morcego:  ");
                color = sc.nextLine();
                flyingAnimal = new Morcego(age, size, color);
                mammal = new Morcego(age,size,color);
                animal = new Morcego(age,size,color);
                break;
            case 3:
                System.out.print("Digite a cor do pelo da vaca:  ");
                color = sc.next();
                mammal = new Vaca(age,size,color);
                animal = new Vaca(age,size,color);
                break;
            case 4:
                System.out.print("Digite a cor da pena da galinha:  ");
                color = sc.nextLine();
                bird = new Galinha(age, size, color);
                animal = new Galinha(age,size,color);
                break;

        }

    }

    public static void printMenu(){
        System.out.println("Digite 1 para criar um pato.");
        System.out.println("Digite 2 para criar um morcego");
        System.out.println("Digite 3 para criar uma vaca");
        System.out.println("Digite 4 para criar uma galinha");
        System.out.println("Digite 5 para encerrar");
        System.out.println("Teclas invalidas fará com que a pergunta seja refeita");
        System.out.print(">> ");
    }


    public static void printValoresAnimal(Animal animal){
        System.out.println();
        System.out.println();
        System.out.println("dados do animal criado:");
        System.out.println(animal);
        System.out.println("Som produzido pelo animal: ");
        System.out.println(animal.emitirSom());
        System.out.println("Comportamento característico: ");
    }

}