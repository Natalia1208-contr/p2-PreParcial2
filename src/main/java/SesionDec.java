public abstract class SesionDec implements SesionIntDec{
    protected SesionBase sesionb;

    public SesionDec(SesionIntDec sesionb) {
        this.sesionb = (SesionBase) sesionb;
    }

    @Override
    public String verEfectos() {
        return "Efectos: ";
    }
}
