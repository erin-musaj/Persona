import java.util.Date;

public class Persona {

    private String nome;
    private String sesso;
    private Date compleanno;

    public Persona(String nome, String sesso, int anno, int mese, int giorno) {
        this.nome = nome;
        this.sesso = sesso;
        this.compleanno = new Date(anno-1900, mese-1, giorno);
    }

    public String toString(){
        return "{nome:\"" + this.nome + "\",sesso:\"" + this.sesso + "\",compleanno:\"" + this.compleanno + "\"}";
    }
}
