public class Calciatore extends Persona {

    private String ruolo;
    private int numeroMaglia;
    private int numeroGoal;

    public Calciatore(
            String nome, String sesso, int numeroScarpe, int anno, int mese, int giorno,
            String ruolo, int numeroMaglia, int numeroGoal
    ) throws Exception {
        super(nome, sesso, numeroScarpe, anno, mese, giorno);
        this.ruolo=ruolo;
        this.numeroGoal=numeroGoal;
        this.numeroMaglia=numeroMaglia;
    }

    public Calciatore(
            Persona persona,
            String ruolo, int numeroMaglia, int numeroGoal
    ) throws Exception {
        super(persona);
        this.ruolo=ruolo;
        this.numeroGoal=numeroGoal;
        this.numeroMaglia=numeroMaglia;
    }

    public Calciatore(Calciatore calciatore){
        super(calciatore);
        this.ruolo= calciatore.ruolo;
        this.numeroGoal=calciatore.numeroGoal;
        this.numeroMaglia=calciatore.numeroMaglia;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    public int getNumeroGoal() {
        return numeroGoal;
    }

    public void setNumeroGoal(int numeroGoal) {
        this.numeroGoal = numeroGoal;
    }

    public Object clone(){
       return new Calciatore(this);
    }

    public String toString(){
        return "{" + this.toStringInner() + "}";
    }

    public String toStringInner(){
        return super.toStringInner() + ",ruolo:\"" + ruolo + "\",numeroMaglia:" + numeroMaglia + ",numeroGoal:" + numeroGoal;
    }
}
