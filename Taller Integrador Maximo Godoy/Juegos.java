public class Juegos{

    private String nombre;
    private int precio;
    private int ID;
    private String categoria;
    private String motor;
    private boolean verificadorEdad;
    
    public Juegos(){
        
    }
    public Juegos(String nombre, int precio, int ID, String categoria, String motor, boolean verificadorEdad){
        this.nombre = nombre;
        this.precio = precio;
        this.ID = ID;
        this.categoria = categoria;
        this.motor = motor;
        this.verificadorEdad = verificadorEdad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
    public void setVerificadorEdad(boolean verificadorEdad){
        this.verificadorEdad = verificadorEdad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getID(){
        return ID;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getMotor(){
        return motor;
    }
    public boolean getVerificadorEdad(){
        return verificadorEdad;
    }
}

