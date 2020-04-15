/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.clases;

/**
 *
 * @author brian granados
 */
public class Pelicula {
    public int id;
    public String nombre;
    public String director;
    public String año;
    public String reseña;
    public int entradas;

    public Pelicula(int id,String nombre, String director, String año, String reseña) {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
        this.año = año;
        this.reseña = reseña;
        this.entradas = 0;
    }
    
    
}
