public class Sphere extends Cercle{

    private double volume;

    public Sphere() {
        this(RAY_DEFAUT, HAUT_DEFAUT, COUL_DEFAUT);
    }

    public Sphere(int pLarg, int pHaut, String pCoul) {
        super(pLarg, pHaut, pCoul);
        setRayon(pLarg);
        this.volume = calculerVolume();
    }


    public double calculerVolume(){
        return ((4 * Math.PI * Math.pow(getRayon(), 3)) / 3);
    }
}
