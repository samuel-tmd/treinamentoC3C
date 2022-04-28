package Matérias.POO;

public class Pessoa {

    // A classe chamada pessoa é definida por 3 atributos que formarão o nome.
    public String primeiroNome;
	public String ultimoNome;
	public String nomesDoMeio;

    // Essa classe é um modelo, uma “fôrma” para criar objetos, e cada objeto vai ter seus próprios atributos.
    // Um objeto desta classe não deve apenas “armazenar” dados, mas também processá-los, no caso o processamento deve ser feito por métodos.
    
    public String getNomeCompleto() {

        String nomeCompleto = this.primeiroNome + " " + this.nomesDoMeio + " " + this.ultimoNome;
        return nomeCompleto;
    }

    // Contrutor personalizado que já atribui os nomes
    public Pessoa (String nome1, String nome2, String nome3)
    {   
        this.primeiroNome = nome1;
        this.nomesDoMeio = nome2;
        this.ultimoNome = nome3;
    }
    
    // Quando se usa um contrutor personalizado, é preciso instanciar o contrutor padrão
    public Pessoa() {}
    
}
