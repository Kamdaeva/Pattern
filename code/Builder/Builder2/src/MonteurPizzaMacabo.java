public class MonteurPizzaMacabo extends MonteurPizza{
    @Override
    public Pizza getPizza() { return pizza; }
    public void monterPate()
    { pizza.setPate("feuilletée de macabo"); }
    public void monterSauce()
    { pizza.setSauce("sauce aux deux epices"); }
    public void monterGarniture() { pizza.setGarniture("escargot");
    }
    @Override
    public void creerNouvellePizza() { pizza = new Pizza(); }
}
