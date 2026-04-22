public class EqEfecto extends SesionDec{
    public EqEfecto(SesionBase sesionb) {
        super(sesionb);
    }

    @Override
    public String verEfectos() {
        return sesionb.verEfectos()+"\n\t Efecto Equalizador ";
    }
}
