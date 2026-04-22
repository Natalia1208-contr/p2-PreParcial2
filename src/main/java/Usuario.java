public class Usuario {
    private String nombre;
    private String correo;
    private String fechareg;
    private double minAcum;
    boolean gratuito;

    public Usuario(String nombre, String correo, String fechareg, double minAcum, boolean gratuito) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechareg = fechareg;
        this.minAcum = minAcum;
        this.gratuito = gratuito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechareg() {
        return fechareg;
    }

    public void setFechareg(String fechareg) {
        this.fechareg = fechareg;
    }

    public double getMinAcum() {
        return minAcum;
    }

    public void setMinAcum(double minAcum) {
        this.minAcum = minAcum;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }


}
