public class Efecto8D extends SesionDec{
    public Efecto8D(SesionBase sesionb) {
        super(sesionb);
    }

    @Override
    public String verEfectos() {
        return sesionb.verEfectos()+"\n\t Efecto 8D";
    }
}
