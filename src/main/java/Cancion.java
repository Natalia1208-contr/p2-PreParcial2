public class Cancion extends Contenido{

    private String album;
    private int bpm;

    public Cancion(String codigo, String titulo, int duracion, String autor, String genero, EstadoContenido estado) {
        super(codigo, titulo, duracion, autor, genero, estado);
        this.album = album;
        this.bpm = bpm;
    }

}
