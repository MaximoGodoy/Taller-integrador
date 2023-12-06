import java.util.ArrayList;

public class Desarrollador{

    private String nombre;
    private ArrayList<Juegos> listaJuegos = new ArrayList<Juegos>();

    public Desarrollador(){
        
    }
    public Desarrollador(String nombre, Juegos listaJuegos){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void agregarJuego(Juegos juego){
        this.listaJuegos.add(juego);
    }
} 
