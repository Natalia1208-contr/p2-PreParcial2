import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {
    @Test
    void crearCotenido(){
        ContFactory fabrica = new CancionFact();
        Cancion c1 = (Cancion)fabrica.crearContenido("1", "Oh que sera", 3, "Willie Colon", "Salsa", EstadoContenido.DISPONIBLE);
        assertEquals("Oh que sera", c1.getTitulo());
    }
    @Test
    void tipoCorrecto(){
        ContFactory fabrica = new CancionFact();
        Cancion c1 = (Cancion)fabrica.crearContenido("1", "Oh que sera", 3, "Willie Colon", "Salsa", EstadoContenido.DISPONIBLE);
        assertTrue(c1 instanceof Cancion);
    }
}