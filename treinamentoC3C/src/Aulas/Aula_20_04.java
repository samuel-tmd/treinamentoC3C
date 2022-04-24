package Aulas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aula_20_04 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        String nome, decisao="S";
        Integer quant, quantMax, quantMin;
        Double valor;
        Map<Integer,Map<String,String>> mercadorias = new HashMap<Integer,Map<String,String>>();

        while (decisao.equals("S") || decisao.equals("s")) 
        {
            try 
            {
                System.out.println("Digite o Nome da mercadoria: ");
                nome = sc.nextLine();
                System.out.println("Digite a Quantidade Atual da mercadoria: ");
                quant = sc.nextInt();
                System.out.println("Digite Quantidade Máxima da mercadoria: ");
                quantMax = sc.nextInt();
                System.out.println("Digite Quantidade Mínima da mercadoria: ");
                quantMin = sc.nextInt();
                System.out.println("Digite o Valor da mercadoria: ");
                valor = sc.nextDouble();
 
                mercadorias = Modulo_20_04.adicionaMercadoria(nome, quant, quantMax, quantMin, valor, mercadorias);

                Modulo_20_04.clearBuffer(sc);
                System.out.println("\nDeseja cadastrar outra mercadoria? (S/N)");
                decisao = sc.nextLine();
            } 
            catch (Exception e) 
            {
                Modulo_20_04.clearBuffer(sc);
                System.out.println("Algo deu errado! Deseja tentar novamente? (S/N)");
                decisao = sc.nextLine();
            }
        } 
        if(!mercadorias.isEmpty())
        {
            Modulo_20_04.calculaValor(mercadorias);
        }
        else
        {
            System.out.println("Nenhuma mercadoria foi cadastrada!");
        }

    }
}