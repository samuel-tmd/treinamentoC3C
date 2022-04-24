package Aulas;

import java.util.Scanner;

public class Aula_14_04 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Aula do dia 14-04!");
        System.out.println("\n\nEx 1:");
        ex1();
        System.out.println("\n\nEx 2:");
        ex2();
    }

    public static void ex1() {
        double n1, n2, result;
    
        System.out.println("Valor 1: ");
        n1 = sc.nextDouble();
        System.out.println("Valor 2: ");
        n2= sc.nextDouble();

        while(n2==0){
            System.out.println("Digite um número diferente de 0!");
            System.out.println("Valor 2: ");
            n2= sc.nextInt();
        }

        result = n1/n2;
        
        System.out.println("A divisão dos valores resulta em: " + result);
    }
    public static void ex2() {
        String user, senha;
        int i =1;
        
        System.out.println("Digite o usuário: ");
        user = sc.nextLine();

        System.out.println("Digite a senha: ");
        senha = sc.nextLine();

        while(i<3){
            if(user.equals("admin")){
                while(!senha.equals("c3c")){
                    System.out.println("Digite a senha novamente");
                    senha = sc.nextLine();
                    i++;
                    if(i==3){
                    break;
                    }
                }
            
            } else {
                System.out.println("Digite o usuário novamente: ");
                user = sc.nextLine();
            }
            if(senha.equals("c3c")){
                break;
            }
        
        }

        if(i==3){
            System.out.println("O limite de tentativas estourou!");
        } else {
            System.out.println("Logado com sucesso!");
        }

    }
}
