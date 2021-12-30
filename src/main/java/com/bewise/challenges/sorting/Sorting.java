package com.bewise.challenges.sorting;

import java.util.Collections;
import java.util.Comparator;

import java.util.List;

public class Sorting {

    /**
     * Se debe ordenar primero por puntuación de manera descendente, luego por nombre de manera ascendente.
     *
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
    public static List<Jugador> ordenarPorPuntuacionYNombre(List<Jugador> jugadores) {
        Collections.sort(jugadores, new Comparator<Jugador>() {
            public int compare(Jugador o1, Jugador o2) {
                if(o1.getPuntuacion() == o2.getPuntuacion()){
                    return o1.getNombre().compareTo(o2.getNombre());
                }
                return o1.getPuntuacion() > o2.getPuntuacion()?-1:1;
            }
        });
        return jugadores;
    }

    /**
     * Se debe ordenar primero por puntuación de manera descendente. Cuando 2 jugadores tienen igual cantidad de puntos,
     * el que tiene menos perdidas se lo considerara el mayor. Luego a igual puntos y perdidas se segxxuirá usando el
     * nombre de manera ascendente.
     *
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
    public static List<Jugador> ordenarPorPuntuacionPerdidasYNombre(List<Jugador> jugadores) {
        Collections.sort(jugadores, new Comparator<Jugador>() {
            public int compare(Jugador o1, Jugador o2) {
                if(o1.getPuntuacion() == o2.getPuntuacion()){
                    if(o1.getPerdidas() == o2.getPerdidas()){
                        return o1.getNombre().compareTo(o2.getNombre());
                    }
                    return o1.getPerdidas() > o2.getPerdidas()?1:-1;
                }
                return o1.getPuntuacion() > o2.getPuntuacion()?-1:1;
            }
        });
        return jugadores;
    }
}
