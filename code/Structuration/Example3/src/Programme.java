public class Programme {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle();
        ICarre iCarre = new AdaptRectangle(rectangle);
        iCarre.Cote(5);
        System.out.println("Aire du carré : " + iCarre.aire());
        System.out.println("Périmètre du carré : " + iCarre.perimetre());
    }
}
