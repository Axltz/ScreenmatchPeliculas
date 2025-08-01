import java.util.ArrayList;
import java.util.List;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.filtroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Avengers", 2012);
        miPelicula.setDuracionEnMinutos(143);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(9.7);
        miPelicula.evalua(9.1);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDelasEvaluaciones());
        System.out.println("Media: " + miPelicula.calculaMedia());
 
        Serie breakingBad = new Serie("Breaking Bad", 2008);
        breakingBad.setTemporadas(5);
        breakingBad.setMinutosPorEpisodio(45);
        breakingBad.setEpisodiosPorTemporada(10);
        System.out.println(breakingBad.getDuracionEnMinutos());
        
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye((miPelicula));
        calculadora.incluye((breakingBad));
        System.out.println(calculadora.getTiempoTotal());   
        
        filtroRecomendacion FiltroRecomendacion = new filtroRecomendacion();
        FiltroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Pilot");
        episodio.setSerie(breakingBad);
        episodio.setReproducciones(50);
        
        FiltroRecomendacion.filtra(episodio);

        Pelicula peliculadeAxel = new Pelicula("El señor de los anillos", 2001);
        peliculadeAxel.setDuracionEnMinutos(180);
 
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculadeAxel);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());
                
    }

}

