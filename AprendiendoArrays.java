package cl.nombreorg.nomproyecto;

import java.util.Scanner;

public class AprendiendoArrays {
	
 public static void main(String[] args) {
	
	 // instancia de clase scanner llamada sc
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("indica la longitud del Array: ");
	 //nextLine() es para caracteres, nextint() para enteros.
	 int longitud =sc.nextInt();
	 //declaracion del Array numeros
	 int [] numeros = new int [longitud];
	  
	 // int numeros [],tambien se puede declarar de esta forma
	 
	 System.out.println("indicar los numeros del Array: ");
	 
	 for (int i=0; i<longitud; i++) {
		 numeros[i] = sc.nextInt();
	 }
	 imprimirArray(numeros);
	//utilizamos un metodo creado a continuacion en el codigo para imprimir el array
	 
	 //menu de opciones 
	 int opcion;
	 int suma; // contiene la sumatoria 
	 int [] maxMin; // contiene el valor maximo y el minimo
	 
	 do {
		 System.out.println("selecccione una opción: ");
		 System.out.println("1.Sumar");
		 System.out.println("2.Encontrar el máximo");
		 System.out.println("3.Encontrar el minimo");
		 System.out.println("4.Salir");
		 opcion = sc.nextInt();
		 sc.close();
		 // switch case
		 switch(opcion) {
		 
		   case 1:
			   suma = calcularSuma(numeros);
			   System.out.println("la suma de los numeros es: " + suma);
			   break;
		   case 2: 
			   maxMin = encontrarMaxMin(numeros);
			   System.out.println("el valor maximo del array es: " + maxMin[0]);
			   break;
		   case 3:
			   maxMin = encontrarMaxMin(numeros);
			   System.out.println("el valor minimo del array es: " + maxMin[1]);
			   break;
		   case 4:
			   System.out.println("Hasta pronto!");
			   break;
			  default:
				  System.out.println("porfavor escojer un numero valido (entre 1 y 4)"); 
		 }
		 
	 } while(opcion !=4);
	 
	 
}//finaliza el metodo main
 
 //metodo imprimirArray
 public static void imprimirArray(int [] array) {
	 
	 //codigo necesarios para imprimir el array 
	
	 System.out.println("los numeros en el array son: ");
	 
	 for (int i=0; i < array.length;i++) {
		 System.out.println(array[i] + " ");
	
	 }// se cierra el ciclo
 
 }//se cierra el metodo imprimirArray

public static int calcularSuma(int [] array) {
	int suma = 0; // un contador o acumulador que comienza en 0
	for (int i=0; i<array.length; i++) {
		suma += array[i];
	}
	return suma;
}//finaliza el metodo calcular suma

//metodo creado para encontrar el maximo y el minimo en el array
public static int[] encontrarMaxMin(int [] array) {
	
	int max = array[0];
	int min = array[0];
	
	//ciclo para buscar mayor y menor dentro del array
	
	for (int i=1; i<array.length; i++) {
		
		if (array[1] > max) {
			max = array[i];//almacena el valor mas alto encontrado
		}
		if (array[1] < min) {
			min = array[i];//almacena el valor mas pequeño encontrado
		}
	}//finaliza el ciclo
	
	return new int[] {max,min}; //retorna el maximo y el minimo encontrado
}
  
}//finaliza la clase 
