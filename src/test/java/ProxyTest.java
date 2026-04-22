import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {
    @Test
    void usuarioPremiumReproduccion() {
        Usuario usuario = new Usuario("Miguelin pin pin", "juanmgutierrezv@uqvirtual", "04/22/26", 0, false);
        ContFactory fabrica = new CancionFact();
        Cancion c1 = (Cancion)fabrica.crearContenido("1", "Oh que sera", 3, "Willie Colon", "Salsa",
                EstadoContenido.DISPONIBLE);
        SesionProxy proxy = new SesionProxy(c1);
        assertTrue(proxy.validarUsuario(usuario));
    }
    @Test
    void usuarioGratuitoReproduccion() {
        Usuario usuario = new Usuario("Miguelin pin pin", "juanmgutierrezv@uqvirtual", "04/22/26", 0, true);
        ContFactory fabrica = new CancionFact();
        Cancion c1 = (Cancion)fabrica.crearContenido("1", "Oh que sera", 3, "Willie Colon", "Salsa",
                EstadoContenido.DISPONIBLE);
        SesionProxy proxy = new SesionProxy(c1);
        assertTrue(proxy.validarUsuario(usuario));
    }

}