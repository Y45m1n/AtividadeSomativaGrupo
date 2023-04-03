package AtividadeSomativaGrupo;

import java.util.Scanner;

public class AtividadeSomativa {
    Scanner sc = new Scanner(System.in);

    public void atividade1() {
        System.out.println(" O que você deseja calcular IMC (1) ou Peso ideal (2) ? ");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Informe Sua Altura:");
                double altura = sc.nextDouble();
                System.out.println("Informe seu Peso:");
                double peso = sc.nextDouble();
                double valor1 = peso / altura;
                double imc = valor1 * valor1;
                if (imc < 20) {
                    System.out.println("Você Está Abaixo do Peso");
                } else if (imc > 20 && imc < 27) {
                    System.out.println("Você Está no Peso Ideal");
                } else if (imc > 27) {
                    System.out.println("Você Está Acima do Peso");
                } else {
                    System.out.println("O Valor é Inválido");
                }

                break;
            case 2:
                System.out.println(" Se for mulher digite 1! Se for homem digite 2! ");
                int sexo = sc.nextInt();
                System.out.println(" Digite sua altura!! ");
                double altura1 = sc.nextDouble();
                if (sexo == 1) {
                    System.out.println(" Seu peso ideal é " + ((62.1 * altura1) - 44.7));
                } else {
                    System.out.println(" Seu peso ideal é " + ((72.7 * altura1) - 58));
                }

            default: System.out.println("Digite um Valor Válido"); 
                break;


            
                
        }
        System.out.println("Informe Sua Situação: Abaixo do Peso (4), Peso Ideal(5) e Acima do Peso(6)");
        int situacao = sc.nextInt();
        switch (situacao) {
            case 4: System.out.println("Você Deve Fazer Atividades Difíceis - Precisa Ganhar Massa Muscular ");
        
        break;

        case 5: System.out.println("Você Deve Fazer Atividades Moderadas - Peso Normal");

        break;

        case 6: System.out.println("Você Deve Fazer Atividades Leves - Perder Peso");

        default: System.out.println("Digite um Valor Válido"); 
                break;

            }

        System.out.println("Informe Sua Faixa Etária: Idade (1) - 16 a 25 anosIdade (2) - 25 a 35 anosIdade (3) – 36 a 45 anosIdade (4) – 46 a 55 anosIdade (5) – 56 a 65 anos Idade (6) – 66+");
        int idade = sc.nextInt();
        if (situacao==4 && idade==1) {
            System.out.println("Abaixo do Peso - Luta");
        } else if (situacao==5 && idade==1) {
            System.out.println("Peso Ideal - Musculação Moderada e Dança");
        } else if (situacao==6 && idade==1) {
            System.out.println("Acima do Peso - Musculação Leve e Ioga");
        } else if (situacao==4 && idade==2) {
            System.out.println("Abaixo do Peso - Musculação Intensa e Luta");
        } else if (situacao==5 && idade==2) {
            System.out.println("Peso Ideal - Musculação Moderada Dança e Corrida");
        } else if (situacao==6 && idade==2) {
            System.out.println("Acima do Peso - Ioga");
        } else if (situacao==4 && idade==3) {
            System.out.println("Abaixo do Peso - Musculação Intensa e Luta");
        } else if (situacao==5 && idade==3) {
            System.out.println("Peso Ideal - Musculação Moderada Dança e Corrida");
        } else if (situacao==6 && idade==3) {
           System.out.println("Acima do Peso - Ioga");
        } else if (situacao==4 && idade==4) {
           System.out.println("Abaixo do Peso - Pilates e Luta");
        } else if (situacao==5 && idade==4) {
            System.out.println("Peso Ideal - Musculação Moderada, Dança e Corrida");
        } else if (situacao==6 && idade==4) {
            System.out.println("Acima do Peso - Luta e Pilates");
        } else if (situacao==4 && idade==5) {
           System.out.println("Abaixo do Peso - Pilates");
        } else if (situacao==5 && idade==5) {
            System.out.println("Peso Ideal - Dança e Corrida");
        } else if (situacao==6 && idade==5) {
            System.out.println("Acima do Peso - Musculação Leve e Ioga");
        } else if (situacao==4 && idade==6) {
           System.out.println("Abaixo do Peso - Pilates");
        } else if (situacao==5 && idade==6) {
            System.out.println("Peso Ideal - Dança");
        } else if (situacao==6 && idade==6) {
            System.out.println("Acima do Peso - Musculação Leve e Ioga");
        } else {
            System.out.println(" O valor digitado é inválido ");
        }
        
        

    }

}

