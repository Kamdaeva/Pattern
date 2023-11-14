public class DecorateurCurseurVertical extends DecorateurFenetre{
    public DecorateurCurseurVertical(Fenetre fenetreDecoree){
        super(fenetreDecoree);
    }
    
    public String dessiner(){
        return super.dessiner() + "avec curseur Vertical" ;
    }
    
    public String decrire(){
        return super.decrire() + "avec curseur Vertical";
    }
}
