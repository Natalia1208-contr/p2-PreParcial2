public class ReverbEfecto extends SesionDec{
    public ReverbEfecto(SesionBase sesionb) {
        super(sesionb);
    }

    @Override
    public String verEfectos() {
        return getSesionb().toString()+"+ efecto reversa";
    }
}
