public class CancionFact extends ContFactory{
    @Override
    public Contenido crearContenido(String codigo, String titulo, int duracion, String autor, String genero, EstadoContenido estado) {
        return new Cancion(codigo,titulo, duracion,autor, genero, estado);
    }
}
