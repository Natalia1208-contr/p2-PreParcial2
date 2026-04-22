public class ReverbEfecto extends SesionDec{
    public ReverbEfecto(SesionIntDec sesionb) {
        super(sesionb);
    }

    @Override
    public String verEfectos() {
        return sesionb.verEfectos()+"\n\t Efecto 8D";
    }
}
