

public class Cercle extends FormesGeometriques{

    public static final int RAY_DEFAUT = 3;
    public static final int HAUT_DEFAUT = 5;


    private int rayon;


    Cercle()
    {
        this(RAY_DEFAUT, HAUT_DEFAUT, COUL_DEFAUT);
    }

    Cercle(int pLarg, int pHaut, String pCoul)
    {
        super(pCoul);
        boolean ok = setRayon(pLarg)
                && setCouleur(pCoul);
        if (!ok)
        {
            rayon = RAY_DEFAUT;
            setCouleur(COUL_DEFAUT);
        }
    }

    public int getRayon()
    {
        return rayon;
    }

    public boolean setRayon(int pRayo)
    {
        boolean ok = validerRayon(pRayo);
        if (ok)
            rayon = pRayo;
        return ok;
    }

    public static boolean validerRayon(int pRayo)
    {
        return (pRayo >= DIM_MIN && pRayo <= DIM_MAX);
    }



    public int aire()
    {
        return (int) (Math.PI * Math.pow(rayon,2));
    }

    public int perimetre()
    {
        return (int) (2 * Math.PI) * rayon;
    }

    public boolean memeRayon(Cercle parCer)
    {
        return this.rayon == parCer.rayon;
    }

    @Override
    public boolean equals(Object pCer)
    {
        return pCer != null && pCer instanceof Cercle
                && this.rayon == ((Cercle) pCer).rayon
                && getCouleur().equals(((Cercle) pCer).getCouleur());

    }

    @Override
    public String toString()
    {
        return "Le rayon du cercle est: " + getRayon()
                + "\nLa couleur du triangle est: " + getCouleur();
    }


    public static void main(String[] args)
    {
        Cercle cercle = new Cercle(3,5,"vert");
        System.out.println(cercle);


    }
}