package Classes;

import java.util.Scanner;

public class Main
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Pessoa gabriel = new Pessoa("João Gabriel", 11);

        gabriel.endereco = new Endereco("Rua A", "17", "Bairro B", "SP City", "SP Estate", "Braza Country");
        gabriel.telefone = new Telefone("+55","11","988887777");

        gabriel.dadosPessoais();

        //Funcionario extende a classe Pessoa e possui todos os metodos e atributos da classe Pessoa
        Funcionario manu = new Funcionario();

        manu.nome = "Manuela";
        manu.cpf = 999;
        manu.endereco.setLogradouro("Rua B");
        manu.endereco.setNumero("18");
        manu.telefone.setTelefone("55", "11", "999777");
        //manu.matricula = 123;
        //manu.setor = "Produção";

        manu.setCargo("Estagiária");
        manu.setMatricula(1);
        manu.setSetor("ADM");

        manu.dadosPessoais();
        System.out.println(manu.getFuncionario());
    }
}