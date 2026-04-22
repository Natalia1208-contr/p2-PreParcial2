public abstract class SesionDec implements SesionIntDec{
    protected SesionIntDec sesionb;

    public SesionDec(SesionIntDec sesionb) {
        this.sesionb =  sesionb;
    }

    @Override
    public String verEfectos() {
        return "Efectos: ";
    }
}
