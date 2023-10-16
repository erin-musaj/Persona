public class Main {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Ryan Gosling", "maschio", 44, 2006, 4, 16);
            System.out.println(p1.toString());
            Persona p2 = (Persona) p1.clone();
            p2.setNome("Driver");
            System.out.println(p2.toString());
            Calciatore c1 = new Calciatore(p1, "Attaccante", 16, 100);
            System.out.println(c1.toString());
            Calciatore c2 = (Calciatore) c1.clone();
            c2.setNome("Driver");
            System.out.println(c2.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}