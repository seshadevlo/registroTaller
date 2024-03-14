package cl.nombreorg.nomproyecto;
import java.util.Scanner;


public class RegistroUsuariosSalud {
 public static void main(String[] args) {
 
	 //variables de base
	 String nombre;
	 String fechaNacimiento;
	 String numIdentificacion;
	 String tipoUsuario;
	 
	 //instancia de clase scanner
	 
	 Scanner sc = new Scanner(System.in);
     
	 System.out.println("Ingrese un nombre de usuario: ");
     nombre = sc.nextLine();
     
     System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy): ");
     fechaNacimiento = sc.nextLine();
     
     System.out.println("Ingrese un número de identificación: ");
     numIdentificacion = sc.nextLine();
     
     System.out.println("Ingrese el tipo de usuario(paciente, médico, administrativo) : ");
     tipoUsuario = sc.nextLine();
     
     //equalIgnoreCase = no distinguir entre mayusc. y minusc. 
     
     if ("paciente".equalsIgnoreCase(tipoUsuario)) {
    	 
    	 //datos especificos del paciente
    	 System.out.println("Ingrese la dirección: ");
         String direccion = sc.nextLine();
         
    	 System.out.println("Ingrese el número de telefono: ");
         String numTelefono = sc.nextLine();
         
    	 System.out.println("Ingrese alergia preexistente (si más de una, separadas por comas): ");
         String alergias = sc.nextLine();
         
         //presentamos la información registrada
         
         System.out.println("Usuario registrado: ");
         System.out.println("Nombre: " + nombre);
         System.out.println("Fecha de naciemiento: " + fechaNacimiento);
         System.out.println("Numero de identificacion: " + numIdentificacion);
         
         System.out.println("Direccion: " + direccion);
         System.out.println("Telefono: " + numTelefono);
         System.out.println("Alergias: " + alergias);
         } else if("administrativo".equalsIgnoreCase(tipoUsuario)) {
        
         //datos especificos del administrativo 	 
         System.out.println("Ingrese la función a emplear: ");
         String funcionLaboral = sc.nextLine(); 
        
         System.out.println("Ingrese el departamento al que corresponde: ");
         String departamentoLaboral = sc.nextLine();
         
         //presentamos la informacion registrada
         System.out.println("Usuario registrado: ");
         System.out.println("Nombre: " + nombre);
         System.out.println("Fecha de naciemiento: " + fechaNacimiento);
         System.out.println("Numero de identificacion: " + numIdentificacion);
         
         System.out.println("Función: " + funcionLaboral);
         System.out.println("Departamento: " + departamentoLaboral);
         
         } else if ("médico".equalsIgnoreCase(tipoUsuario)) {
        
         //datos especificos del medico 
         System.out.println("Ingrese especialidad: ");
         String especialidad = sc.nextLine();
         
         System.out.println("Ingrese años de experiencia: ");
         String aniosExperiencia = sc.nextLine();
         
         System.out.println("Ingrese número de colegiado: ");
         String colegiadoId = sc.nextLine();
         
         //presentamos la informacion registrada 
         System.out.println("Usuario registrado: ");
         System.out.println("Nombre: " + nombre);
         System.out.println("Fecha de naciemiento: " + fechaNacimiento);
         System.out.println("Numero de identificacion: " + numIdentificacion);
         
         System.out.println("Especialidad: " + especialidad);
         System.out.println("Años de experiencia: " + aniosExperiencia);
         System.out.println("Número de colegiado: " + colegiadoId);
         } else {
        	 System.out.println("no existe este tipo de usuario");
         } 
     sc.close();
}//fin del metodo main 
}//fin de la clase
