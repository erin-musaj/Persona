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

    public String toString(){
        return super.toString() + "\b,ruolo:\"" + ruolo + "\",numeroMaglia:" + numeroMaglia + ",numeroGoal:" + numeroGoal + "}";
    }
}
