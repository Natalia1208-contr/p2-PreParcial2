public class Capitulo {
    private String narrador;
    private String autor;

    public Capitulo(String narrador, String autor) {
        this.narrador = narrador;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }
}
