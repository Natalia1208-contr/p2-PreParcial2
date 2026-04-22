public class Main {
    public static void main(String[] args) {
        Reproductor rep= Reproductor.getInstancia();
        Reproductor rep2= Reproductor.getInstancia();
        System.out.println(rep==rep2);

        ContFactory fabrica=new CancionFact();
        Contenido cancion=fabrica.crearContenido("2831","oh que será",240,"Willie Colon", "salsa", EstadoContenido.DISPONIBLE);
        Contenido cancion2=fabrica.crearContenido("2461","pies descalzos",240,"shakira", "pop", EstadoContenido.DISPONIBLE);
        fabrica=new AudioFact();
        Contenido audioLibro= fabrica.crearContenido("5684","El principito", 12334555, "Antoine de Saint-Exupery","literatura infantil", EstadoContenido.DISPONIBLE);
        fabrica=new PodFact();
        Contenido podcast=fabrica.crearContenido("3628","chisme time", 22827281,"Miguel V","entretenimiento", EstadoContenido.DISPONIBLE);

        PlayList subPlay=new PlayList("subPlayList");
        subPlay.getContenidos().add(cancion);
        subPlay.getContenidos().add(audioLibro);
        subPlay.getContenidos().add(podcast);
        PlayList playList=new PlayList("Global playList");
        playList.getContenidos().add(subPlay);
        playList.getContenidos().add(cancion2);
        System.out.println(playList.duracionTotal());

        SesionBase sesionBase=new SesionBase("9549","05/11/23", "11:45","lenovo 24");
        sesionBase.getContenidos().add(subPlay);
        sesionBase.getContenidos().add(podcast);
        sesionBase.setDuracion(sesionBase.duracionSesion());

        Usuario user=new Usuario("Miguel Vargas", "miguel@gmail.com","03/06/21",2832292, true);
        SesionProxy proxy=new SesionProxy(cancion);
        System.out.println(proxy.ejecutar(cancion,user));
        SesionIntDec sesion2= new SesionBase("18392", "07/03/22", "13:22", "samsung a26");
        sesion2=new EqEfecto(sesion2);
        sesion2=new Efecto8D(sesion2);
        System.out.println(sesion2.verEfectos());




    }
}
