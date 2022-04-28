package Matérias.POO;

public class IntroPOO 
{
    public static void main(String[] args) 
    {
        // Para criar objetos é necessário um construtor, que são definidos de forma semelhante a métodos.
        // Na classe é possível definir um contrutor ou usar o padrão com abaixo.
        Pessoa joao = new Pessoa();

        // Adicionando os atributos por comandos separados
        joao.primeiroNome = "João";
		joao.nomesDoMeio = "Paulo";
		joao.ultimoNome = "Silva";

        Pessoa gabi = new Pessoa("Gabriela", "Santos", "Almeida");

		System.out.println(joao.getNomeCompleto());
        System.out.println(gabi.getNomeCompleto());
    }
}
