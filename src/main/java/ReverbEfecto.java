public class ReverbEfecto extends SesionDec{
    public ReverbEfecto(SesionBase sesionb) {
        super(sesionb);
    }

    @Override
    public String verEfectos() {
        return sesionb.verEfectos()+"\n\t Efecto 8D";
    }
}
