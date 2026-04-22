public class SesionProxy implements SesionService {
    private SesionBase sesion;
    private Contenido c;
    public SesionProxy(Contenido c){
        this.c=c;
    }

    public boolean validarUsuario(Usuario usuario) {
        if (usuario.isGratuito() && c.getEstado() == EstadoContenido.DISPONIBLE) {
            System.out.println("Puede ver el contenido con anuncios");
            return true;
        } else if(!usuario.isGratuito() && c.getEstado() == EstadoContenido.DISPONIBLE) {
            System.out.println("Puede ver el contenido sin anuncios. <3");
            return true;
        }
        return false;
    }
    public void cargarContenido () {
        System.out.println("puede cargar contenido");
    }

    @Override
    public boolean ejecutar (Contenido c, Usuario usuario) {
        if(!validarUsuario(usuario)){
            return false;
        }
        System.out.println("puede cargar contenido");
        return true;
    }
}

