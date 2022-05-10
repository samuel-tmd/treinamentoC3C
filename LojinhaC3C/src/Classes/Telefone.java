package Classes;

public class Telefone 
{
    private String codPais;
    private String ddd;
    private String numero;

    public Telefone(String n1 , String n2, String n3)
    {
        this.codPais = n1;
        this.ddd = n2;
        this.numero = n3;
    }

    public Telefone() {}

    public void setTelefone(String pais, String area, String number) {
        this.codPais = pais;
        this.ddd = area;
        this.numero = number;
    }

    public String getTelefone()
    {
        return codPais + " " + ddd + " "+ numero;
    }
}
