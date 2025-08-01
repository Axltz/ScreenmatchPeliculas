package com.aluracursos.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class PrincipalListas {
    public static void main(String[] args) {
        Pelicula favorita = new Pelicula("El señor de los anillos", 2001);
        favorita.evalua(10);

        Pelicula otra = new Pelicula("John Wick", 2014);
        otra.evalua(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorita);
        lista.add(otra);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println("Nombre: " + item.getNombre());

            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificación: " + pelicula.getClasificacion());
            }
        }

        Collections.sort(lista);

        System.out.println("\nLista ordenada:");
        for (Titulo item : lista) {
            System.out.println(item); 
        }
    }
}
