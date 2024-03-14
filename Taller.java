package cl.nombreorg.nomproyecto;

import java.util.Scanner;

public class Taller {
	
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Ingrese la fecha del taller: ");
	  String fecha = sc.nextLine();
	  
	  System.out.println("Ingrese la hora del taller: ");
	  String hora = sc.nextLine();
	  
	  System.out.println("Ingrese la lugar del taller: ");
	  String lugar = sc.nextLine();
	  
	  System.out.println("Ingrese la duración del taller (en horas): ");
	  int duracion = sc.nextInt();
	  sc.nextLine();	  
	  System.out.println("Ingrese numero de participantes del taller: ");
	  int numParticipantes = sc.nextInt();
	  sc.nextLine();	
	  
	  sc.close();
	  //matriz [fila] [columna]
	  
	  String [][] matriz = new String [numParticipantes][3];
	  
	  // i++ = i+1 (auto incremental)
	  
	  for (int i = 0; i< numParticipantes; i++) {
		  System.out.println("Ingrese el nombre del participante: "+(i + 1)+":");

           //fila cero y columna cero
		  matriz[i][0] = sc.nextLine();
		  
		  System.out.println("Ingrese la empresa del participante "+(i+1)+":");
		  matriz[i][1]= sc.nextLine();
		  
		  System.out.println("Ingrese la calificación del participante "+(i+1)+":");
		  
		  //se transforma el valor ingresado de tipo de int a un string mediante el metodo valueOf
		  matriz[i][2]= String.valueOf(sc.nextInt());
		  sc.nextLine();
		  
	  }
	  
	  
	  
	  // se ordenan los datos a traves de un ciclo for y constantes definidas.
	  int suma = 0;
	  int mayor = Integer.MAX_VALUE;//valor maximo que puede tener un entero.
	  int menor = Integer.MIN_VALUE;//valor minimo que puede tener un entero.
	  
	  for(int i=0;i<numParticipantes;i++) {
		  
		// se transforma string dentro de la matriz en un int para realizar calculos.
		  int calificacion = Integer.parseInt(matriz[i][2]);
		  suma+=calificacion; //suma = suma +calificacion.
		  
		  if (calificacion>mayor) {
			  mayor = calificacion;
		  }
		  if(calificacion<menor) {
		  menor = calificacion;
		  } 
	} //fin del ciclo for 
	  
	  //conversion implicita de un doble
	  double promedio = suma/numParticipantes;
	  
	  // conversion explicita  double promedio = (double)suma/numParticipantes;
	  
	  //impresion por consola
	  
	  System.out.println("Detalles del taller: ");
	  System.out.println("Fecha: " + fecha);
	  System.out.println("Hora: " + hora);
	  System.out.println("Lugar: " + lugar);
	  System.out.println("Duración: " + duracion);
	  System.out.println("Promedio de calificaciones" + promedio);
	  System.out.println("Calificación más alta: " + mayor);
	  System.out.println("calificación más baja: " + menor);
  }
}
