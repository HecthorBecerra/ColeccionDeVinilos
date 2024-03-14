package Paquete;

class Vinilo {
    String artista;
    String nombreDisco;
    String year;

    public Vinilo(String artista, String nombreDisco, String year) {
        this.artista = artista;
        this.nombreDisco = nombreDisco;
        this.year = year;
    }
}

class ColeccionVinilos {
    public static final int MAX_VINILOS = 100;
    Vinilo[] vinilos;
    int cantidadVinilos;

    public ColeccionVinilos() {
        this.vinilos = new Vinilo[MAX_VINILOS];
        this.cantidadVinilos = 0;
    }

    public int obtenerCantidadVinilos() {
        return cantidadVinilos;
    }

    public int obtenerEspaciosDisponibles() {
        return MAX_VINILOS - cantidadVinilos;
    }

    public void agregarVinilo(String artista,String nombreDisco, String year) {
        if (cantidadVinilos < MAX_VINILOS) {
            Vinilo nuevoVinilo= new Vinilo(artista,nombreDisco,year);
            vinilos[cantidadVinilos] = nuevoVinilo;
            cantidadVinilos++;
            System.out.println("vinilo agregado ");
        } else {
            System.out.println("No se agrego el vinilo, la coleccion esta llena ");
        }
    }
    public void buscarVinilosPorArtista(String nombreArtista) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadVinilos; i++) {
            Vinilo vinilo = vinilos[i];
            if (vinilo.artista.equalsIgnoreCase(nombreArtista)) {
                if (!encontrado) {
                    System.out.println("Vinilos encontrados del artista '" + nombreArtista + "':");
                }
                System.out.println("Nombre del disco: " + vinilo.nombreDisco);
                System.out.println("Año de lanzamiento: " + vinilo.year);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron vinilos del artista '" + nombreArtista + "'.");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        ColeccionVinilos coleccion = new ColeccionVinilos();

        coleccion.agregarVinilo("Charly Garcia", "Parte de la religion", "1987");
        coleccion.agregarVinilo("Charly Garcia","clics modernos","1983");
        coleccion.agregarVinilo("Charly Garcia", "Parte de la religion", "1987");
        coleccion.agregarVinilo("The Beatles", "Sgt. Pepper's Lonely Hearts Club Band", "1967");
        coleccion.agregarVinilo("Pink Floyd", "The Dark Side of the Moon", "1973");
        coleccion.agregarVinilo("Led Zeppelin", "Led Zeppelin IV", "1971");
        coleccion.agregarVinilo("David Bowie", "The Rise and Fall of Ziggy Stardust and the Spiders from Mars", "1972");
        coleccion.agregarVinilo("The Rolling Stones", "Exile on Main St.", "1972");
        coleccion.agregarVinilo("Bob Dylan", "Highway 61 Revisited", "1965");
        coleccion.agregarVinilo("Nirvana", "Nevermind", "1991");
        coleccion.agregarVinilo("The Velvet Underground", "The Velvet Underground & Nico", "1967");
        coleccion.agregarVinilo("Radiohead", "OK Computer", "1997");
        coleccion.agregarVinilo("Queen", "A Night at the Opera", "1975");
        coleccion.agregarVinilo("The Clash", "London Calling", "1979");
        coleccion.agregarVinilo("Joy Division", "Unknown Pleasures", "1979");
        coleccion.agregarVinilo("Prince", "Purple Rain", "1984");
        coleccion.agregarVinilo("Fleetwood Mac", "Rumours", "1977");
        coleccion.agregarVinilo("Bob Marley and The Wailers", "Legend", "1984");
        coleccion.agregarVinilo("Michael Jackson", "Thriller", "1982");
        coleccion.agregarVinilo("The Beach Boys", "Pet Sounds", "1966");
        coleccion.agregarVinilo("Jimi Hendrix", "Are You Experienced", "1967");
        coleccion.agregarVinilo("Bruce Springsteen", "Born to Run", "1975");
        coleccion.agregarVinilo("The Doors", "The Doors", "1967");
        coleccion.agregarVinilo("R.E.M.", "Automatic for the People", "1992");
        coleccion.agregarVinilo("Pearl Jam", "Ten", "1991");
        coleccion.agregarVinilo("Elvis Presley", "Elvis Presley", "1956");
        coleccion.agregarVinilo("The Smiths", "The Queen Is Dead", "1986");
        coleccion.agregarVinilo("U2", "The Joshua Tree", "1987");
        coleccion.agregarVinilo("The Who", "Who's Next", "1971");
        coleccion.agregarVinilo("Blur", "Parklife", "1994");
        coleccion.agregarVinilo("Oasis", "(What's the Story) Morning Glory?", "1995");



        int cantidadVinilos = coleccion.obtenerCantidadVinilos();
        System.out.println("Cantidad de vinilos en la colección: " + cantidadVinilos);

        int espaciosDisponibles = coleccion.obtenerEspaciosDisponibles();
        System.out.println("Espacios disponibles en la colección: " + espaciosDisponibles);

        coleccion.buscarVinilosPorArtista("charly garcia");
    }
}