public abstract class SesionDec implements SesionIntDec{
    protected SesionBase sesionb;

    public SesionDec(SesionBase sesionb) {
        this.sesionb = sesionb;
    }

    @Override
    public String verEfectos() {
        return "Efectos: ";
    }
}
