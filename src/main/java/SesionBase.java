import java.util.List;

public class SesionBase implements SesionService, SesionIntDec{
    private String codigo;
    private String fecha;
    private String hora;
    private List<Contenido> contenidos;
    private int duracion;
    private String dispositivo;

    public SesionBase(String codigo, String fecha, String hora, List<Contenido> contenidos, int duracion, String dispositivo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.contenidos = contenidos;
        this.duracion = duracion;
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

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
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

    @Override
    public void ejecutar(Contenido c, boolean g){
        System.out.println("reproduciendo contenido");
    }

    @Override
    public String verEfectos() {
        return "efectos: ";
    }
}
