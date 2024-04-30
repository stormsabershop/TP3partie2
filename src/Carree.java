

public class Carree extends FormesGeometriques {

    public static final int LARG_DEFAUT = 5;
    private int largeur;


    Carree()
    {
        this(LARG_DEFAUT, COUL_DEFAUT);
    }

    Carree(int pLarg,String pCoul)
    {
        super(pCoul);
        boolean ok = setLargeur(pLarg)
                && setCouleur(pCoul);
        if (!ok)
        {
            largeur = LARG_DEFAUT;
            setCouleur(COUL_DEFAUT);
        }
    }

    public int getLargeur()
    {
        return largeur;
    }

    public String getCouleur(){
        return super.getCouleur();
    }

    public boolean setCouleur(String pCoul){
        return super.setCouleur(pCoul);
    }


    public boolean setLargeur(int pLarg)
    {
        boolean ok = validerLargeur(pLarg);
        if (ok) {
            largeur = pLarg;
        } else if (pLarg > DIM_MAX) {
            largeur = DIM_MAX;
        } else if (pLarg < DIM_MIN) {
            largeur = DIM_MIN;
        }
        return ok;
    }

    public static boolean validerLargeur(int pLarg)
    {
        return (pLarg >= DIM_MIN && pLarg <= DIM_MAX);
    }

    public static boolean validerCouleur(String pCoul)
    {
        return (pCoul != null && pCoul.length() >= LONGUEUR_COUL_MIN
                && pCoul.length() <= LONGUEUR_COUL_MAX);
    }

    public int aire()
    {
        return (int) Math.pow(largeur,2);
    }

    public int perimetre()
    {
        return largeur * 4;
    }

    public boolean memeLargeur(Carree parRec)
    {
        return this.largeur == parRec.largeur;
    }

    @Override
    public boolean equals(Object pRec)
    {
        return pRec != null && pRec instanceof Carree
                && this.largeur == ((Carree) pRec).largeur
                && getCouleur().equals(((Carree) pRec).getCouleur());

    }

    @Override
    public String toString()
    {
        return "La largeur d'un cote du carre est: " + getLargeur()
                + "\nLa couleur du carree est: " + getCouleur();
    }
}