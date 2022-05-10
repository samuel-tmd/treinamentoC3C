package Classes;

public class Endereco 
{
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String l, String n, String b, String c, String e, String p)
    {
        this.logradouro = l;
        this.numero = n;
        this.bairro = b;
        this.cidade = c;
        this.estado = e;
        this.pais = p;
    }

    public Endereco() {}

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void serEndereco(String l, String n, String b, String c, String e, String p) {
        this.logradouro = l;
        this.numero = n;
        this.bairro = b;
        this.cidade = c;
        this.estado = e;
        this.pais = p;
    }

    public String getEndereco()
    {
        return logradouro + ", " + numero + ", " + bairro + " - " + estado + ", " + pais;
    }
}
