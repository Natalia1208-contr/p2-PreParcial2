public abstract class Contenido implements ComponentePlayList{
    private String codigo;
    private String titulo;
    private int duracion;
    private String autor;
    private String genero;
    private EstadoContenido estado;

    public Contenido(String codigo, String titulo, int duracion, String autor, String genero, EstadoContenido estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public EstadoContenido getEstado() {
        return estado;
    }

    public void setEstado(EstadoContenido estado) {
        this.estado = estado;
    }
    @Override
    public int duracionTotal() {
        return duracion;
    }
}
