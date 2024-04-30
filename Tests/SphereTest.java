import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SphereTest {
    Sphere s0, s1, s2, s3, s4, s5, s6, s7, s8;
    @BeforeEach
    public void setup() {
        s0 = new Sphere();
        s1 = new Sphere(3, 3, "bleu");
        s2 = new Sphere(4, 4, "vert");
        s3 = new Sphere(7, 7, "bleu");
        s4 = new Sphere(5, 5, "blanc");
        s5 = new Sphere(4, 4, "orange");
        s6 = new Sphere(3, 3, "rouge");
        s7 = new Sphere(3, 3, "rose");
        s8 = new Sphere(9, 9, "noir");
    }
    @Test
    void testCalculerVolume() {
        assertEquals(4 * Math.PI * Math.pow(3, 3) / 3, s1.calculerVolume());
        assertEquals(4 * Math.PI * Math.pow(4, 3) / 3, s2.calculerVolume());
        assertEquals(4 * Math.PI * Math.pow(7, 3) / 3, s3.calculerVolume());
        assertEquals(4 * Math.PI * Math.pow(5, 3) / 3, s4.calculerVolume());
        assertEquals(4 * Math.PI * Math.pow(4, 3) / 3, s5.calculerVolume());
        assertEquals(4 * Math.PI * Math.pow(3, 3) / 3, s6.calculerVolume());
        assertEquals(4 * Math.PI * Math.pow(3, 3) / 3, s7.calculerVolume());
        assertEquals(4 * Math.PI * Math.pow(9, 3) / 3, s8.calculerVolume());
    }
}


