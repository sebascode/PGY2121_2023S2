package cl.duoc.spotifytrucho;

import cl.duoc.spotifytrucho.models.Cancion;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Cancion exiliadaAlSur = new Cancion();
        exiliadaAlSur.setId(10);
        exiliadaAlSur.setArtista("Violeta Parra");
        exiliadaAlSur.setTitulo("Exiliada al Sur");
        exiliadaAlSur.setDuracion(3, 20);
        exiliadaAlSur.setDescargada(true);
        exiliadaAlSur.setFavorita(true);

        System.out.println("Nombre: " + exiliadaAlSur.getTitulo());
        System.out.println("Duracion: "+ exiliadaAlSur.getDuracionStr());
    }
}