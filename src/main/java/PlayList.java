import java.util.ArrayList;
import java.util.List;

public class PlayList implements ComponentePlayList{
    private List<ComponentePlayList> contenidos;
    private String nombre;

    public PlayList(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    public List<ComponentePlayList> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<ComponentePlayList> contenidos) {
        this.contenidos = contenidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int duracionTotal() {
        int resultado=0;
        for (ComponentePlayList contenido : contenidos) {
            resultado+=contenido.duracionTotal();
        }
        return resultado;
    }
    public void agregarContenido(ComponentePlayList contenido) {
        this.contenidos.add(contenido);
    }
}
