public class Rectangle {
    private float longueur;
    private float largeur;

    public void rectangleLargeur(float largeur) {
        this.largeur = largeur;
    }
        public void rectangleLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float perimetre() {
        return (longueur + largeur)*2;
    }

    public float aire(){
        return longueur * largeur;
    }
}
