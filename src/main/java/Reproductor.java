public class Reproductor {
    private Reproductor instancia;
    private Usuario usuario;

    private Reproductor getInstancia() {
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
