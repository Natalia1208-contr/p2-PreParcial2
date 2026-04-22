import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {
    @Test
    void calcularDuracionPlaylist(){
        PlayList playlist = new PlayList("Variada");
        ContFactory fabrica = new CancionFact();
        Cancion c1 = (Cancion)fabrica.crearContenido("1", "Oh que sera", 3, "Willie Colon", "Salsa", EstadoContenido.DISPONIBLE);
        Cancion c2 = (Cancion)fabrica.crearContenido("2", "Siempre sere", 4, "Tito nieves", "Salsa", EstadoContenido.DISPONIBLE);
        Cancion c3 = (Cancion)fabrica.crearContenido("3", "El dia de mi suerte", 6, "Hector lavoe", "Salsa", EstadoContenido.DISPONIBLE);
        Cancion c4 = (Cancion)fabrica.crearContenido("4", "Yogurcito", 5, "Blessd", "Regueton", EstadoContenido.DISPONIBLE);
        PlayList subPlaylist = new PlayList("Salsa");
        subPlaylist.agregarContenido(c1);
        subPlaylist.agregarContenido(c2);
        subPlaylist.agregarContenido(c3);
        playlist.agregarContenido(subPlaylist);
        playlist.agregarContenido(c4);
        assertEquals(18, playlist.duracionTotal());
    }
}