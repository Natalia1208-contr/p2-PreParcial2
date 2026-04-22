import java.util.ArrayList;
import java.util.List;

public class SesionBase implements SesionService, SesionIntDec{
    private String codigo;
    private String fecha;
    private String hora;
    private List<ComponentePlayList> contenidos;
    private int duracion;
    private String dispositivo;

    public SesionBase(String codigo, String fecha, String hora, String dispositivo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.contenidos = new ArrayList<>();
        this.duracion = 0;
        this.dispositivo = dispositivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<ComponentePlayList> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<ComponentePlayList> contenidos) {
        this.contenidos = contenidos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public int duracionSesion (){
        int duracion=0;
        for(ComponentePlayList c:contenidos){
            duracion+=c.duracionTotal();
        }
        return duracion;
    }

    @Override
    public boolean ejecutar(Contenido c, Usuario usuario){
        System.out.println("reproduciendo contenido");
        return true;
    }

    @Override
    public String verEfectos() {
        return "efectos: ";
    }
}
