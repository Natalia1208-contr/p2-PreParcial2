public class EqEfecto extends SesionDec{
    public EqEfecto(SesionBase sesionb) {
        super(sesionb);
    }

    @Override
    public String verEfectos() {
        return getSesionb().toString()+"+ efecto ecualizador";
    }
}
