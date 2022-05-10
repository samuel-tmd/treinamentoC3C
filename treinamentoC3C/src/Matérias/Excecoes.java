package Matérias;

// O tratamento de exceções serve para prever erros esperados no código, sabendo assim a melhor alternativa para seguir.
// Para tratar exeções utiliza-se o bloco try/catch que tentará realizar determinada ações e se algo der errado o bloco catch é ativado dependendo da exceção que é inserida entre os parenteses.
// É possível ter vários catch em um bloco.
// O try/catch pode ter o finally, que é o local que será inserido o código que será executado independentemente se houver exceção ou não.
// O comando throws na assinatura do método servirá quando este método é chamado por outro que está executando primeiro e neste primeiro haverá um tratamento de exceção
//      assim, se algo der errado no método chamado com throws, o tratamento ocorrerá no primeiro.

// Também é possível criar exceções personalizadas em uma classe e em algum erro esperado lançá-la com oo throw. Ex: throw new DeuRuimException("Deu Ruim!");

public class Excecoes 
{
    public class DeuRuimException extends Exception
    {
        @Override
        public String getMessage()
        {
            return "Deu ruim!";
        }
    }

/*
Exemplos de situações onde é necessário o tratamento de exceções:

- Tentar abrir um arquivo que não existe.
- Tentar fazer consulta a um banco de dados que não está disponível.
- Tentar escrever algo em um arquivo sobre o qual não se tem permissão de escrita.
- Tentar conectar em servidor inexistente.
- Tentar manipular um objeto que está com o valor nulo.
- Dividir um número por zero.
- Tentar manipular um tipo de dado como se fosse outro.
- Tentar utilizar um método ou classe não existentes.

*/

    public static void main(String[] args) throws DeuRuimException
    {
        String frase = "Sou um teste!";


        if(!frase.contains("b") || !frase.contains("B"))
        {
            Excecoes e = new Excecoes();
            throw e.new DeuRuimException();
        } 
    }
    
    public static void exemploArquivo () 
    {
        try 
        {
           new java.io.FileInputStream("arquivo.txt");
        }
        catch (java.io.FileNotFoundException e) 
        {
           System.out.println("Não foi possível abrir o aquivo para consulta");
        }
    }

    public static void exemploNulo() 
    {

        String frase = null;
        String novaFrase = null;
        try
        {
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e) //CAPTURA DA POSSÍVEL exceção.
        {
            //TRATAMENTO DA exceção
            System.out.println("O frase inicial está nula, para solucional tal o problema, foi lhe atribuito um valor default.");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }

    public static void exemploThrows() throws NullPointerException 
    {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }

    public static void chamaExemploThrows() {
        try
        {
            exemploThrows();
        }
        catch(NullPointerException e)
        {
            System.out.println("Ocorreu um NullPointerException ao executar o método exemploThrows() "+e);
        }
    }
}
