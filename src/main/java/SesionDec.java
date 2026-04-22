public abstract class SesionDec implements SesionIntDec{
    private SesionBase sesionb;

    public SesionDec(SesionBase sesionb) {
        this.sesionb = sesionb;
    }

    public SesionBase getSesionb() {
        return sesionb;
    }

    public void setSesionb(SesionBase sesionb) {
        this.sesionb = sesionb;
    }


}
