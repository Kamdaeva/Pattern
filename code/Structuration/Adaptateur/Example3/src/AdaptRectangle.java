public class AdaptRectangle implements ICarre {
    private Rectangle rectangle;
    
    public AdaptRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void Cote(float cote){
        rectangle.rectangleLargeur(cote);
        rectangle.rectangleLongueur(cote);
    }

    @Override
    public float perimetre(){
        return rectangle.perimetre();
    }
    
    @Override
    public float aire(){
        return rectangle.aire();
    }
}
