import java.util.ArrayList;
import java.util.List;

public class Audio extends Contenido{
    private List<Capitulo> capitulos;

    public Audio(String codigo, String titulo, int duracion, String autor, String genero, EstadoContenido estado) {
        super(codigo, titulo, duracion, autor, genero, estado);
        this.capitulos = new ArrayList<>();
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }


}
