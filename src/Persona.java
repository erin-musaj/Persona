import java.util.Date;

public class Persona {

    private String nome;
    private String sesso;
    private Date compleanno;

    public Persona(String nome, String sesso, Date compleanno) {
        this.nome = nome;
        this.sesso = sesso;
        this.compleanno = compleanno;
    }

    public String toString(){
        return "{nome:" + this.nome + ",sesso:" + this.sesso + ",compleanno:" + this.compleanno + "}";
    }
}
