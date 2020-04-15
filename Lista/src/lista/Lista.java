/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author brian granados
 */
import java.util.ArrayList;
import java.util.Scanner;
import static lista.FuncionListas.limiteEntradas;
import lista.clases.Pelicula;

public class Lista {
static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
 
//public final static int limiteEntradas=80;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      FuncionListas.cargarLista();   
        do{
            FuncionListas.totalEntradasVendidas();
            FuncionListas.compraEntrada();
        }while(true);
    }   
    
    
}

