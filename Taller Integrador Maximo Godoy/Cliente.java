import java.util.ArrayList;

public class Cliente extends Usuario{

    private boolean estadoUsuario;

    private ArrayList<Juegos> juegosComprados = new ArrayList<Juegos>();
    private ArrayList<Juegos> listaFavoritos = new ArrayList<Juegos>();
    private ArrayList<Juegos> listaDeseados = new ArrayList<Juegos>();
    private ArrayList<Cliente> listaAmigos = new ArrayList<Cliente>();

    public Cliente(){
        
    }
    public Cliente(String nombre, int edad, int telefono, String correoElectronico, String contraseña, String pais){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.pais = pais;
    }

    public void comprarJuego(Juegos juego){
        this.juegosComprados.add(juego);
    }
    public void añadirFavoritos(Juegos juego){
        this.listaFavoritos.add(juego);
    }
    public void añadirDeseados(Juegos juego){
        this.listaDeseados.add(juego);
    }
    public void añadirAmigos(Cliente amigo){
        this.listaAmigos.add(amigo);
    }
}