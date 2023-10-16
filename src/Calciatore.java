public class Calciatore extends Persona {

    private String ruolo;
    private int numeroMaglia;
    private int numeroGoal;

    public Calciatore(
            String nome, String sesso, int anno, int mese, int giorno,
            String ruolo, int numeroMaglia, int numeroGoal
    ) throws Exception {
        super(nome, sesso, anno, mese, giorno);
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

    public String toString(){
        return "{" + this.toStringInner() + "}";
    }

    public String toStringInner(){
        return super.toStringInner() + ",ruolo:\"" + ruolo + "\",numeroMaglia:" + numeroMaglia + ",numeroGoal:" + numeroGoal;
    }
}
