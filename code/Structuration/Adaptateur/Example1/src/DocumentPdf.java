public class DocumentPdf implements Documents{
    private ComposantPdf outilPdf;

    public DocumentPdf(ComposantPdf outilPdf){
        this.outilPdf = outilPdf;
    }
    
    @Override
    public int setContenu(int contenu){
       return outilPdf.pdfafixeContenu(contenu);
    }
    @Override
    public int dessine(){
        return outilPdf.pdfRafraichir();
    }
    @Override
    public int imprime(){
        return outilPdf.pdfEnvoiImprimante();
    }
}
