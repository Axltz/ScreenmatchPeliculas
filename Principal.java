import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.filtroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDelasEvaluaciones());
        System.out.println("Media: " + miPelicula.calculaMedia());
 
        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionEnMinutos());
        
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye((miPelicula));
        calculadora.incluye((casaDragon));
        System.out.println(calculadora.getTiempoTotal());   
        
        filtroRecomendacion FiltroRecomendacion = new filtroRecomendacion();
        FiltroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targayen");
        episodio.setSerie(casaDragon);
        episodio.setReproducciones(50);
        
        FiltroRecomendacion.filtra(episodio);
    }

}

