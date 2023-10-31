public class Client {
    public static void main(String[] args) throws Exception {
        Element racine = new Dossier("Racine");
        Element dossier1 = new Dossier("Dossier1");
        Element fichier1 = new FichierTXT("Fichier1.txt");
        Element fichier2 = new FichierPDF("Fichier2.pdf");

        racine.ajouter(dossier1);
        dossier1.ajouter(fichier1);
        dossier1.ajouter(fichier2);

        racine.decrire();
    }
}
