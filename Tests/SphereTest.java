import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SphereTest {
    Sphere s0, s1, s2, s3, s4, s5, s6, s7, s8;

    @BeforeEach
    public void setup() {
        s0 = new Sphere();
        s1 = new Sphere(new Cercle(20, "vert"));
        s2 = new Sphere(4);
        s3 = new Sphere(new Cercle(7, "bleu"));
        s4 = new Sphere();
        s5 = new Sphere(new Cercle());
        s6 = new Sphere(new Cercle(4, "rouge"));
        s7 = new Sphere(3);
        s8 = new Sphere(9);
    }

    @Test
    void testCalculerVolume() {
        assertEquals((int) 3.14 * Math.pow(s0.getRayonEnCm(), 3), s0.volume());
        assertEquals((int) 3.14 * Math.pow(s1.getRayonEnCm(), 3), s1.volume());
        assertEquals((int) 3.14 * Math.pow(s2.getRayonEnCm(), 3), s2.volume());
        assertEquals((int) 3.14 * Math.pow(s3.getRayonEnCm(), 3), s3.volume());
        assertEquals((int) 3.14 * Math.pow(s4.getRayonEnCm(), 3), s4.volume());
        assertEquals((int) 3.14 * Math.pow(s5.getRayonEnCm(), 3), s5.volume());
        assertEquals((int) 3.14 * Math.pow(s6.getRayonEnCm(), 3), s6.volume());
        assertEquals((int) 3.14 * Math.pow(s7.getRayonEnCm(), 3), s7.volume());
        assertEquals((int) 3.14 * Math.pow(s8.getRayonEnCm(), 3), s8.volume());
    }

    @Test
    void testCalculerAire() {
        assertEquals((int) 3.14 * Math.pow(s0.getRayonEnCm(), 2), s0.aire());
        assertEquals((int) 3.14 * Math.pow(s1.getRayonEnCm(), 2), s1.aire());
        assertEquals((int) 3.14 * Math.pow(s2.getRayonEnCm(), 2), s2.aire());
        assertEquals((int) 3.14 * Math.pow(s3.getRayonEnCm(), 2), s3.aire());
        assertEquals((int) 3.14 * Math.pow(s4.getRayonEnCm(), 2), s4.aire());
        assertEquals((int) 3.14 * Math.pow(s5.getRayonEnCm(), 2), s5.aire());
        assertEquals((int) 3.14 * Math.pow(s6.getRayonEnCm(), 2), s6.aire());
        assertEquals((int) 3.14 * Math.pow(s7.getRayonEnCm(), 2), s7.aire());
        assertEquals((int) 3.14 * Math.pow(s8.getRayonEnCm(), 2), s8.aire());
    }
}
