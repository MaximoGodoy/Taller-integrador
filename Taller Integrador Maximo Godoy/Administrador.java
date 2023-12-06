public class Administrador extends Usuario{

    private boolean administrarPagina;
    private boolean administrarUsuarios;
    
    public Administrador(){
        
    }
    public Administrador(String nombre, int edad, int telefono, String correoElectronico, String contraseña, String pais){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.pais = pais;
    }

}