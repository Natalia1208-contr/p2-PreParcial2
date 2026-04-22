public class SesionProxy implements SesionService {
    private SesionBase sesion;
    private Contenido c;
    public SesionProxy(Contenido c){
        this.c=c;
    }

    public boolean validarUsuario(boolean grat) {
        if (grat && c.getEstado() == EstadoContenido.DISPONIBLE) {
            System.out.println("puede ver el contenido");
            return true;
        } else {
            System.out.println("no puede ver el contenido, solo aplica para premium");
        }return false;
    }
    public void cargarContenido () {
        System.out.println("puede cargar contenido");
    }

    @Override
    public void ejecutar (Contenido c, boolean gra) {
        if(!validarUsuario(gra)){
            return;
        }
        System.out.println("puede cargar contenido");
    }
}

