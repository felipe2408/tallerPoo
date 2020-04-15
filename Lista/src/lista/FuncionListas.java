/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.ArrayList;
import java.util.Scanner;
import lista.clases.Pelicula;
/**
 *
 * @author brian granados
 */
public class FuncionListas  extends Cinema{
static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
public final static int limiteEntradas=80;

public  static void cargarLista(){
        Pelicula pelicula;
        int id;
        String nombre;
        String director;
        String año;
        String reseña;  
        id =1;
        nombre="El Padrino";
        director="Francis Ford Coppola";
        año="2018";
        reseña="Película no recomendada a menores de 16 años. \n En el verano de 1945, se celebra la boda de Connie (Talia Shire) y Carlo Rizzi (Gianni Russo). Connie es la única hija de Don Vito Corleone (Marlon Brando), jefe de una de las familias que ejercen el mando de la Cosa Nostra en la ciudad de Nueva York. Don Vito además tiene otros tres hijos: su primogénito Sonny (James Caan), el endeble Fredo (John Cazale) y el más joven se todos, Michael (Al Pacino), un marine condecorado por su lucha en la Segunda Guerra Mundial que acaba de regresar a su hogar en Nueva York. Por designios de la fortuna, Michael terminará llevando la vida que no deseaba, tomando las riendas del negocio familiar, cambiando su moral y sus valores, para defender a toda costa a su familia.";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =2;
        nombre="FORREST GUMP";
        director="Robert Zemeckis";
        año="1994";
        reseña="Todos los públicos. \n Al tener el coeficiente intelectual de un niño, Forrest Gump siempre ha sido considerado el “tonto” de clase. Bajo las faldas de su madre se siente protegido y junto a su amiga Jenny es feliz, aunque en su propio mundo. Un problema en su columna vertebral no le impide convertirse en un ágil corredor. Ya más mayor, Forrest luchará en la guerra de Vietnam y conocerá al mismísimo presidente de los Estados Unidos. Llegará a ser muy rico, pero para Forrest hay algo que no cambia: el amor de su vida es y será Jenny.";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =3;
        nombre="EN BUSCA DE LA FELICIDAD";
        director="Gabriele Muccino";
        año="2007";
        reseña="Todos los públicos. \n Chris Gardner, un joven padre de familia, está tratando de ganarse la vida. Nunca ha tenido un trabajo estable y se pasa los días haciendo malabares. Su mujer en cambio, va en contra de la forma que tiene para salir adelante. Un día, harta de todo, decide abandonar a Chris y a su hijo de cinco años, Christopher. En ese momento, la vida de ambos cambiará para siempre cuando todo se complique y tengan que vivir momentos difíciles, como el embargo de su casa o el esfuerzo en vano por buscar un buen empleo con el que poder mantenerse. Perdido en el peor calvario de su vida, Chris seguirá velando por Christopher, basándose en el afecto y la confianza de su hijo, que se convertirá en la fuerza que le ayudará a superar los obstáculos ...";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =4;
        nombre="INTOCABLE";
        director="Eric Toledano, Olivier Nakache";
        año="2012";
        reseña="Película no recomendada a menores de 7 años. \n Philippe (François Cluzet, 'No se lo digas a nadie') es un hombre adinerado que pertenece a la alta sociedad. Sin embargo, su vida cambiará para siempre después de un aparatoso accidente de parapente que lo dejará inválido y en silla de ruedas. Ya no podrá hacer nada por sí mismo, así que tendrá que contratar a un asistente para que le ayude a desplazarse y a cuidar de él en la casa. La persona que quedará a su cargo será Driss (Omar Sy, 'Micmacs'), un joven de color necesitado de dinero que procede de un barrio marginal y que para colmo acaba de ser liberado de la cárcel. Aunque parecen destinados a no llevarse bien, Philippe y Driss encontrarán el uno en el otro la ilusión que les falta en sus vidas. Aprenderán a apreciar y a mezclar a Vivaldi con el hip hop, los trajes hechos a medida con la ropa holgada y el chándal y la exquisitez en el paladar con la hamburguesa callejera. Si separados son personas frágiles, juntos serán intocables.";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =5;
        nombre="LA VIDA ES BELLA";
        director="Roberto Benigni";
        año="1999";
        reseña="Todos los públicos. \n La Segunda Guerra Mundial está a punto de estallar en Europa. Mientras tanto, Guido llega a un pueblo italiano con la intención de abrir una librería. Allí se enamora de la novia de un fascista italiano, Dora. Ésta sucumbirá a sus encantos y Guido consigue que se case con él.";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =6;
        nombre="EL REY LEÓN";
        director="Roger Allers, Rob Minkoff";
        año="1994";
        reseña="Películas para niños a partir de 6 años. \n Recuperación del clásico de Disney de 1994, adaptado a las nuevas generaciones gracias a la tecnología 3-D. La productora de animación sigue así el camino que emprendió con 'La bella y la bestia' de adaptar sus cintas más populares a dicha tecnología para que los nuevos espectadores puedan disfrutarla mejor (y sacar de paso rendimiento, ahora que estamos en época de crisis, a las apuestas seguras de su fondo de armario).";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =7;
        nombre="SIEMPRE A TU LADO. HACHIKO";
        director="Lasse Hallström";
        año="2009";
        reseña="Todos los públicos. \n Parker Wilson (Richard Gere, 'El caso Wells') es un profesor de universidad que trabaja lejos de su casa. Todos los días se acerca a la estación de tren para trasladarse a su oficio. No obstante, un día en el que regresa del trabajo, encuentra en la estación de tren un perro, aún cachorro, de la raza akita. Sin saber con quién dejar al animal, decide llevárselo a su casa aun sabiendo que su esposa no quiere tener animales en casa. Con el paso del tiempo, Parker y \"Hachi\", su nueva mascota, se terminan haciendo inseparables, acompañando el perro a su dueño en todas las tareas de casa. Tanto es el grado en el que se quieren que Hachi, al crecer, termina yendo a buscar a su dueño cada día a la estación de tren, ya que le echa de menos. Sin embargo, un inesperado acontecimiento, termina cambiando de nuevo sus vidas.";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =8;
        nombre="COCO";
        director="ee Unkrich, Adrian Molina";
        año="2017";
        reseña="Películas para niños a partir de 6 años. \n En un pequeño y alegre pueblo mexicano vive Miguel, un niño de 12 años que pertenece a una familia de zapateros, en la que la música está prohibida. Durante generaciones, los Rivera han censurado la música porque creen que hay una maldición en ella. Y es que, hace muchos años, su bisabuelo abandonó a su mujer para seguir su sueño de ser músico, y por eso la música se declaró muerta para todos ellos.";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =9;
        nombre="VENGADORES: ENDGAME";
        director="oe Russo, Anthony Russo";
        año="2019";
        reseña="Después de los devastadores eventos ocurridos en Vengadores: Infinity War, el universo está en ruinas debido a las acciones de Thanos, el Titán Loco. Tras la derrota, las cosas no pintan bien para los Vengadores. Mientras Iron Man (Robert Downey Jr.) vaga en soledad junto a Nebula (Karen Gillan) en una nave lejos de la Tierra, el grupo encabezado por Capitán América (Chris Evans), Viuda Negra (Scarlett Johansson), Hulk (Mark Ruffalo) y Thor (Chris Hemsworth) deberá tratar de revertir los efectos de la catástrofe provocada por Thanos. Los Vengadores deberán reunirse una vez más para deshacer sus acciones y restaurar el orden en el universo de una vez por todas. Esta vez, contarán también con aliados como Ojo de Halcón (Jeremy Renner) y Capitana Marvel (Brie Larson), además de Ant-Man (Paul Rudd), que presumiblemente podría haber estado atrapado en el Reino Cuántico. Juntos, se prepararán para la batalla final, sin importar cuáles sean las consecuencias.";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
        id =10;
        nombre="UP";
        director="Pete Docter, Bob Peterson";
        año="2019";
        reseña="Películas para niños a partir de 6 años. \n Cuando amenazan con demoler su vivienda para construir un establecimiento, Carl Fredricksen, un antiguo vendedor de globos de 78 años, decide que ha llegado el momento de hacer realidad el sueño que siempre había compartido con su ya difunta esposa Ellie: explorar Sudamérica a lo largo y a lo ancho del continente. Sin pensárselo mucho, el anciano ata su casa a miles de globos y emprende un viaje a través del aire.";
        pelicula = new Pelicula(id,nombre,director,año,reseña);
        peliculas.add(pelicula);
        
    }
    public static void totalEntradasVendidas(){
        int acumulador=0;
        
        for(Pelicula i: peliculas){
            acumulador+=i.entradas;
        }
        System.out.println("el numero total de entradas vendidas es: "+acumulador);
    }
    
    public static void escribirLista(){
        for(Pelicula i:peliculas){
            System.out.println(i.id+". "+i.nombre);
        }
        
    }
           
    public static void imprimirPelicula(Pelicula pelicula){
        System.out.println(pelicula.id+". "+pelicula.nombre);
        System.out.println("Director: "+pelicula.director);
        System.out.println("Año: "+pelicula.año);
        System.out.println("Reseña "+pelicula.reseña);
        System.out.println("Entradas Vendidas: "+pelicula.entradas);
    }
    public static void compraEntrada(){
        Scanner leer = new Scanner(System.in);
        int opcion=0;
        System.out.println("Seleccione la pelicula que desea ver");
        escribirLista();
        System.out.print("Opcion: ");
        opcion = leer.nextInt();
        Pelicula peliculaSeleccionada = peliculas.get(opcion-1);
        imprimirPelicula(peliculaSeleccionada);
        System.out.println("Cuantos tiquetes desea comprar?");
        opcion=leer.nextInt();
        if(opcion>0){
            if(peliculaSeleccionada.entradas+opcion<=80){
                peliculaSeleccionada.entradas+=opcion;
            }
            else{  
                System.out.println("El numero de tiquetes disponibles es: "+(limiteEntradas-peliculaSeleccionada.entradas));
            }
        }
        peliculas.set(peliculaSeleccionada.id-1, peliculaSeleccionada);
    }

    static Object cargarLista(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
