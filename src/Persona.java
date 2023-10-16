import java.util.Date;

public class Persona {
    private String nome;
    private String sesso;
    private Date compleanno;

    public Persona(String nome, String sesso, int anno, int mese, int giorno) throws Exception {
        this.nome = nome;
        if(nome.equalsIgnoreCase("maschio") || nome.equalsIgnoreCase("femmina")){
            this.nome = nome;
        } else {
            throw new Exception("sesso not valid");
        }
        this.compleanno = new Date(anno-1900, mese-1, giorno);
    }

    public Persona(Persona persona){
        this.nome = persona.nome;
        this.sesso= persona.sesso;
        this.compleanno=new Date(persona.compleanno.getTime());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSesso() {
        return sesso;
    }

    public Date getCompleanno() {
        return compleanno;
    }

    public Object clone(){
        return new Persona(this);
    }

    public String toString(){
        return "{nome:\"" + this.nome + "\",sesso:\"" + this.sesso + "\",compleanno:\"" + this.compleanno + "\"}";
    }
}
