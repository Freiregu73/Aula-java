package projeto_aula_01_04;

import java.util.Scanner;

public class Projeto_aula_01_04 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);

        String nome;
        int idade, tosse, febre, dor, coriza, faltaAr, op, diagnostico = 0;

        System.out.println("Qual o seu nome");
        nome = grava.next();
        System.out.println("Qual a sua idade");
        idade = grava.nextInt();
        System.out.println("====Sintomas====");
        System.out.println("está com febre? \n ( 1 - sim / 2 - não)");
        febre = grava.nextInt();
        System.out.println("está com tosse? \n ( 1 - sim / 2 - não)");
        tosse = grava.nextInt();
        System.out.println("está com dor de garganta? \n ( 1 - sim / 2 - não)");
        dor = grava.nextInt();
        System.out.println("está com coriza? \n ( 1 - sim / 2 - não)");
        coriza = grava.nextInt();
        System.out.println("está com falta de ar? \n ( 1 - sim / 2 - não)");
        faltaAr = grava.nextInt();

        do {
            System.out.println("Sistema de Identificação e Prevenção de Doenças de Inverno \n (não medico)");
            System.out.println("Óla " + nome);
            System.out.println("1 - Diagnóstico");
            System.out.println("2 - Recomendações");
            System.out.println("3 - Informar novos Sintomas");
            System.out.println("4 - Sair");
            op = grava.nextInt();
            switch (op) {
                case 1:
                    System.out.println("====Diagnóstico====");
                    if (faltaAr == 1) {
                        System.out.println("Situação mais grave!");
                        diagnostico = 1;
                    } else if (febre == 1 && tosse == 1 && dor == 1) {
                        System.out.println("Gripe");
                        diagnostico = 2;
                    } else if (coriza == 1 && tosse == 1) {
                        System.out.println("Resfriado");
                        diagnostico = 3;
                    } else {
                        System.out.println("Alergia");
                        diagnostico = 4;
                    }
                    break;

                case 2:
                    System.out.println("====Recomendações====");
                    if (diagnostico == 1) {
                        System.out.println("Procurar um médico urgente!!!");
                    } else if (diagnostico == 2) {
                        System.out.println("Beber bastante líquido!!!");
                    } else if (diagnostico == 3) {
                        System.out.println("Evitar locais fechados!!!");
                    } else {
                        System.out.println("Manter higiene!!!");
                    }
                    break;

                case 3:
                    System.out.println("====Informar novos sintomas====");
                    System.out.println("está com febre? \n ( 1 - sim / 2 - não)");
                    febre = grava.nextInt();
                    System.out.println("está com tosse? \n ( 1 - sim / 2 - não)");
                    tosse = grava.nextInt();
                    System.out.println("está com dor de garganta? \n ( 1 - sim / 2 - não)");
                    dor = grava.nextInt();
                    System.out.println("está com coriza? \n ( 1 - sim / 2 - não)");
                    coriza = grava.nextInt();
                    System.out.println("está com falta de ar? \n ( 1 - sim / 2 - não)");
                    faltaAr = grava.nextInt();
                    break;
                    
            }
        } while(op != 4);
    

    }
    }
