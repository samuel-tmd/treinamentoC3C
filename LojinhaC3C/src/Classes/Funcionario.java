package Classes;

import java.util.HashMap;
import java.util.Map;

public class Funcionario extends Pessoa {
    
    private Integer matricula;
    private String cargo;
    private String setor;
    private Boolean logado = false;
    private Map<Integer,String> usuario = new HashMap<Integer,String>() {{
        put(1, "1111");
        put(2, "2222");
        put(3, "3333");
        put(4, "4444");
        put(5, "5555");
    }};

    public Funcionario() {}

    public Funcionario(String n, int c, int m, String s, String ca) {
        super(n, c);
        this.matricula = m;
        this.cargo = ca;
        this.setor = s;
    }

    public String getFuncionario(){
        return this.nome + ", de matrícula: " + this.matricula +  " e de cargo: " + this.cargo;
    }

    // Sobrescrevendo o método da Superclasse
    // @Override que verifica se o método existe na Superclasse
    @Override
    public void dadosPessoais() {
        // Método da Superclasse
        super.dadosPessoais();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Setor: " + setor);
    }

    public void fazerLogin(Integer matricula, String senha) throws Exception {
        if(usuario.containsKey(matricula)){
            if(usuario.get(matricula) == senha){
                logado = true;
                System.out.println("Você está logado!");
            } else {
                throw new Exception("A senha está incorreta!");
            }
        } else {
            throw new Exception("Este usuário não existe!");
        }  
    }

    public Boolean getLogado() {
        return logado;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
