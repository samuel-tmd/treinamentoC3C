package Matérias;

public class Interfaces
{

// A interface é um recurso muito utilizado em Java, bem como na maioria das linguagens orientadas a objeto, 
// para “obrigar” a um determinado grupo de classes a ter métodos ou propriedades em comum para existir em um determinado contexto, 
// contudo os métodos podem ser implementados em cada classe de uma maneira diferente.
// as classes que implementam a interface devem implementar os métodos que existem na interface mas dentro do método o código pode ser manipulado da maneira que melhor desejar.

// Exemplo com a classe pessoa do pacote Matérias.POO:

public interface IPessoa 
{
    public String getNomeCompleto();
}
    
}