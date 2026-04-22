import java.util.ArrayList;
import java.util.List;

public class Podcast extends Contenido{
    private List<String> temporadas;
    private List<String> episodios;

    public Podcast(String codigo, String titulo, int duracion, String autor, String genero, EstadoContenido estado) {
        super(codigo, titulo, duracion, autor, genero, estado);
        this.temporadas = new ArrayList<>();
        this.episodios = new ArrayList<>();
    }

    public List<String> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<String> temporadas) {
        this.temporadas = temporadas;
    }

    public List<String> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<String> episodios) {
        this.episodios = episodios;
    }
}
