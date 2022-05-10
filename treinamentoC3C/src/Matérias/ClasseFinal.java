package Matérias;

    
// O uso do especificador FINAL pode conferir segurança ao código e maior velocidade de execução.
// Uma classe ao receber o modificador FINAL representa que chegou ao nível máximo de especialização.
// Quando aplicado aos métodos, o modificador FINAL garante que este não será sobrescrito.
// Quando este modificador é aplicado aos atributos, os mesmos passam a ser constantes, ou seja, uma vez o atributo inicializado, não poderá ter o seu valor alterado. Qualquer tentativa de modificá-lo gera um erro de compilação.
// O modificador FINAL também pode ser aplicado aos parâmetros de um método, os quais não poderão ser modificados no escopo do método. 
// O final, torna o atributo da classe uma constante e, só pode ser inicializado uma única vez, ou diretamente na declaração da classe ou no método construtor.
// uando um atributo recebe os modificadores de acesso STATIC e FINAL, sua inicialização apresenta uma alteração distinta, 
// o atributo não poderá mais ser inicializado no método construtor, sendo possível sua inicialização apenas diretamente na declaração do atributo ou no bloco de inicialização estático.
public final class ClasseFinal
{
    protected final String nome;
    protected final int idade;
    protected final int[] vetor;

    public ClasseFinal(){
        idade = 20;
        nome = "UTFPR-CP";
        vetor = new int[100];
    }

    public final void Imprime(final int posicao) {
        System.out.println(vetor[posicao]);
    }

    public final void inicializa() {
        for (int w = 0; w < vetor.length; w++) {
            vetor[w] = w * 9;
        }
    }
}