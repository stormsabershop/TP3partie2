
public class Sphere{
    private int rayonEnCm;


    public Sphere(){
        this(20);
    }


    public Sphere(int prayonEnCm){
        rayonEnCm = prayonEnCm;
    }

    public Sphere(Cercle pcercle){

        this.rayonEnCm = pcercle.getRayon();
    }


    public int aire() {
        int aire = (int) 3.14 * rayonEnCm * rayonEnCm;
        return aire;
    }



    public int volume() {
        int vol = (int) 3.14 * rayonEnCm * rayonEnCm * rayonEnCm;
        return vol;
    }
    public int getRayonEnCm() {
        return rayonEnCm;
    }

    public void setRayonEnCm(int rayonEnCm) {
        this.rayonEnCm = rayonEnCm;
    }


}
