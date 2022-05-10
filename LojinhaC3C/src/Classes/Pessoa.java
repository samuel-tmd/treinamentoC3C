package Classes;

public class Pessoa
{
    // Definir atributos
    // modificador tipoPrimitivo nome
    public String nome; 
    public String rg;
    public int cpf;
    public String email;
    public Telefone telefone = new Telefone();
    public int idade;
    public Endereco endereco = new Endereco();
    
    // Construtor
    // modificador Classe(tipo arg, tipo arg2){
    //     Corpo do Construtor
    //     this -> Variável de referência ao objeto atual
    // }
    
    public Pessoa(String n, int c)
    {
        this.nome = n;
        this.cpf = c;
    }

    public Pessoa() {}

    // Definir os métodos
    // modificador tipoRetorno nome(tipo arg,tipo arg2){
    //     Corpo do método
    // }

    public void dadosPessoais()
    {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        //System.out.println("E-mail: " + email);
        System.out.println("Endereço: " + endereco.getEndereco());
        System.out.println("Telefone: " + telefone.getTelefone());

    }
}
