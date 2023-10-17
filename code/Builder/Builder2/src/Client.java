public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("creation d'une pizza piquante ");
        Directeur  directeur = new Directeur( new MonteurPizzaPiquante());
        directeur.construire().print();
        System.out.println("creation d'une pizza  reine ");
        directeur = new Directeur( new MonteurPizzaReine());
        directeur.construire().print();
        System.out.println("creation d'une pizza  macabo ");
        directeur = new Directeur( new MonteurPizzaMacabo());
        directeur.construire().print();
    }
}
