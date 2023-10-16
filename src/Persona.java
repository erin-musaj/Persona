import java.util.Date;

public class Persona {
    private String nome;
    private String sesso;

    private int numeroScarpe;
    private Date compleanno;

    public Persona(String nome, String sesso,int numeroScarpe, int anno, int mese, int giorno) throws Exception {
        this.nome = nome;
        if(sesso.equalsIgnoreCase("maschio") || sesso.equalsIgnoreCase("femmina")){
            this.sesso = sesso;
        } else {
            throw new Exception("sesso not valid");
        }
        this.numeroScarpe=numeroScarpe;
        this.compleanno = new Date(anno-1900, mese-1, giorno);
    }

    public Persona(Persona persona){
        this.nome = persona.nome;
        this.sesso= persona.sesso;
        this.compleanno=new Date(persona.compleanno.getTime());
        this.numeroScarpe=persona.numeroScarpe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroScarpe() {
        return numeroScarpe;
    }

    public void setNumeroScarpe(int numeroScarpe) {
        this.numeroScarpe = numeroScarpe;
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
        return "{" + this.toStringInner() +"}";
    }

    public String toStringInner(){
        return "nome:\"" + this.nome + "\",sesso:\"" + this.sesso + "\",numeroScarpe:"+ numeroScarpe + ",compleanno:\"" + this.compleanno + "\"";
    }
}
