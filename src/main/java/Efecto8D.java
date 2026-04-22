public class Efecto8D extends SesionDec{
    public Efecto8D(SesionBase sesionb) {
        super(sesionb);
    }

    @Override
    public String verEfectos() {
        return getSesionb().toString()+"+ efecto 8D";
    }
}
