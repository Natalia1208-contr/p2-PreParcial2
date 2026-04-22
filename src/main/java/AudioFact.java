public class AudioFact extends ContFactory{
    @Override
    public Contenido crearContenido(String codigo, String titulo, int duracion, String autor, String genero, EstadoContenido estado) {
        return new Audio(codigo,titulo,duracion,autor,genero, estado);
    }
}
