/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
	    Scanner scanner = new Scanner(System.in);
	    Cliente nuevoCliente = new Cliente();
	    int opciones;
	    do{
	        System.out.println("Menu de opciones: ");
	        System.out.println("1) Crear una cuenta. ");
	        System.out.println("2) Iniciar sesión. ");
	        System.out.println("3) Cerrar programa. ");
	        opciones = scanner.nextInt();
	        switch(opciones){
	            case 1: 
	                scanner.nextLine();
	                System.out.println("Ingrese su nombre: ");
	                String nombre = scanner.nextLine();
	                
	                System.out.println("Ingrese su edad: ");
	                int edad = scanner.nextInt();
	                
	                System.out.println("Ingrese su telefono: ");
	                int telefono = scanner.nextInt();
	                scanner.nextLine();
	                System.out.println("Ingrese su correo electronico: ");
	                String correoElectronico = scanner.nextLine();
	                
	                System.out.println("Ingrese su contraseña: ");
	                String contraseña = scanner.nextLine();
	                
	                System.out.println("Ingrese su pais: ");
	                String pais = scanner.nextLine();
	            
	                nuevoCliente = new Cliente(nombre, edad, telefono, correoElectronico, contraseña, pais);
	                System.out.println("Su nombre de usuario es: " + nuevoCliente.getNombre());
	                System.out.println("Su edad es: " + nuevoCliente.getEdad());
	                System.out.println("Su telefono de usuario es: " + nuevoCliente.getTelefono());
	                System.out.println("Su correo electronico de usuario es: " + nuevoCliente.getCorreoElectronico());
	                System.out.println("Su contraseña es: " + nuevoCliente.getContraseña());
	                System.out.println("Su pais es: " + nuevoCliente.getPais());
	                
	            case 2:
	                scanner.nextLine();
	                System.out.println("Ingresa tu nombre de usuario: ");
	                String intentoNombre = scanner.nextLine();
	                System.out.println("Ingrese su contraseña de usuario: ");
	                String intentoContraseña = scanner.nextLine();
	                if (intentoNombre == nuevoCliente.getNombre() && intentoContraseña == nuevoCliente.getContraseña()){
	                    System.out.println("Iniciaste sesión exitosamente.");
	                }
	        }
	    }
	    while(opciones != 3);
	    
	}
	
}
