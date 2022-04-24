package Matérias;

import java.util.Scanner;

public class Scanner_ 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        double n1, n2;
    
        System.out.println("Valor 1: ");
        n1 = sc.nextDouble();
        System.out.println("Valor 2: ");
        n2= sc.nextDouble();

        String user, senha;
        
        System.out.println("Digite o usuário: ");
        user = sc.nextLine();

        System.out.println("Digite a senha: ");
        senha = sc.nextLine();

        System.out.println("Valor 1: " + n1+ " | Valor 2: " + n2 + " | User: " + user + " | Senha: "+ senha);
    }

}
