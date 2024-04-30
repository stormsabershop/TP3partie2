public abstract class FormesGeometriques {

    private String couleur;
    public static final int LONGUEUR_COUL_MIN = 4;
    public static final int LONGUEUR_COUL_MAX = 15;
    public static final int DIM_MIN = 3;
    public static final int DIM_MAX = 20;
    public static final String COUL_DEFAUT = "blanc";

    public FormesGeometriques(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }


    public boolean setCouleur(String pCoul)
    {
        boolean ok = validerCouleur(pCoul);
        if (ok) {
            couleur = pCoul;
        } else {
            couleur = COUL_DEFAUT;
        }
        return ok;
    }

    public static boolean validerCouleur(String pCoul)
    {
        return (pCoul != null && pCoul.length() >= LONGUEUR_COUL_MIN
                && pCoul.length() <= LONGUEUR_COUL_MAX);
    }

    public abstract int aire();

    public abstract int perimetre();
}
