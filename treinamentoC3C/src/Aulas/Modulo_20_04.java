package Aulas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Se o módulo estiver em outra pasta, é necessário importar com import nomeDoPacote.nomeDaClasse;
public class Modulo_20_04 
{
    public static Map<Integer,Map<String,String>> adicionaMercadoria(String nome, Integer quant, Integer quantMax, Integer quantMin , Double valor, Map<Integer,Map<String,String>> mercadorias) 
    {
        Integer tam=0;
        Map<String,String> mercadoria = new HashMap<String,String>();

        if (!mercadorias.isEmpty())
        {
            tam = mercadorias.size();
        }
        if (nome.equals(""))
        {
            System.out.println("O nome da Mercadoria estava vazio. Nenhuma mercadoria foi cadastrada.");
        } 
        else 
        {
            if(quant <= 0 || quantMax <= 0 || quantMin <= 0) 
            {
                System.out.println("As quantidades informadas devem ser maiores do que 0. Nenhuma mercadoria foi cadastrada.");
            } 
            else 
            {
                if(quantMin > quantMax || quantMax < quantMin)
                {
                    System.out.println("A Quantidade Mínima deve ser menor que a Quantidade Máxima e a Quantidade Máxima deve ser menor que a Quantidade Mínima! Nenhuma mercadoria foi cadastrada.");
                } 
                else 
                {
                    if(quant > quantMax) 
                    {
                        System.out.println("A Quantidade Atual deve ser menor do que a Quantidade Máxima! Nenhuma mercadoria foi cadastrada.");
                    } 
                    else 
                    {
                        mercadoria.put("Nome", nome);
                        mercadoria.put("Quantidade Atual", quant.toString());
                        mercadoria.put("Quantidade Máxima", quantMax.toString());
                        mercadoria.put("Quantidade Mínima", quantMin.toString());
                        mercadoria.put("Valor", valor.toString());

                        mercadorias.put(tam + 1, mercadoria);
                        System.out.println("A mercadoria foi cadastrada com sucesso!");
                    }
                }
            }
        }
        
        return mercadorias;
    }

    public static void calculaValor(Map<Integer,Map<String,String>> mercadorias) 
    {
        Double valorFinal = 0.0;
        System.out.println("\n");
        
        for(int i = 1; i <= mercadorias.size(); i++)
        {
            System.out.println("Nome: " + mercadorias.get(i).get("Nome") + " \t|| Valor: " + mercadorias.get(i).get("Valor") + " \t|| Quantidade: "+ mercadorias.get(i).get("Quantidade Atual"));
            valorFinal += (Double.valueOf(mercadorias.get(i).get("Valor")) * Double.valueOf(mercadorias.get(i).get("Quantidade Atual")));
        }

        System.out.println("\nO valor total cadastrado na loja é de: " + valorFinal);
    }

    public static void clearBuffer(Scanner sc) 
    {
        if (sc.hasNextLine()) 
        {
            sc.nextLine();
        }
    }
}
