public final class Arithmetique {
    private static Arithmetique instance = null;

    private int x = 1;
    private int y = 2;
    private String name ="EVA";

    private Arithmetique(){
        super();
    }

    private Arithmetique(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public static Arithmetique getInstance()
    {
        if (instance == null)
            {
            instance = new Arithmetique();
        }
        return instance;
    }

    public static Arithmetique getInstance(int x, int y, String name)
    {
        if (instance == null){
            instance = new Arithmetique(x, y, name);
        }
        return instance;

    }

    public int somme(int x, int y)
    {
     return x+y;
    }

    public float moyenne(int x, int y)
    {
      return somme(x, y)/2;
    }

    public void affiche()
    {
     System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " , y = " +this.y + " et name=" + this.name);
    }

    @Override
    public Object clone() throws
     CloneNotSupportedException {
       throw new CloneNotSupportedException();
    }
}
