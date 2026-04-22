public class Reproductor {
    private static Reproductor instancia;
    private Usuario usuario;

    private Reproductor() {
    }

    public static Reproductor getInstancia() {
        if(instancia == null) {
            instancia = new Reproductor();
        }
        return instancia;
    }

    public void iniciarSesion(Usuario u){

    }

    public void reproducir(Contenido c){

    }
}
