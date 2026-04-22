import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    void variosEfectos() {
        SesionIntDec base = new SesionBase("1", "04/22/26", "10AM", "Celular");
        SesionIntDec efectos = new EqEfecto(new Efecto8D(base));
        assertTrue((efectos.verEfectos().contains("Equalizador")) &&(efectos.verEfectos().contains("8D")));
    }
}