public class Usuario{

    protected String nombre;
    protected int edad;
    protected int telefono;
    protected String correoElectronico;
    protected String contraseña;
    protected String pais;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    public void setPais(String pais){
        this.pais = pais;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public String getContraseña(){
        return contraseña;
    }
    public String getPais(){
        return pais;
    }
}