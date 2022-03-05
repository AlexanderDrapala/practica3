package ces.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class setMap {
	
	static Scanner sc;
	static Set<Persona> conjuntoPersonas;
	static Map<String,String> diccionarioPersonas;
	static List<Persona> listaPersonas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conjuntoPersonas = new HashSet<>();
		listaPersonas = new ArrayList<>();
	    diccionarioPersonas = new HashMap<>();
		
		//listaPersonas = new ArrayList<>();
		sc = new Scanner(System.in);
		
		int opcion = 0;
		
		do {
			
			menu();
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 0:
				System.exit(1);
				break;
			case 1:
				listarPersonas();
				break;
			case 2:
				anadirPersona();
				break;
			case 3:
				anadirListaPersonas();
				break;
			case 4:
				eliminarContacto();
				break;
			case 5: 
				eliminarTodosContactos();
			    break;
			case 6: 
			    listarPersonasAgendaMap();
			    break;
			case 7: 
			    anadirPersonaAgendaMap();
			    break;
			case 8: 
			    eliminarContactoAgendaMap();
			    break;
			case 9: 
			    busquedaPersonaPorTelefonoAgendaMap();
			    break;	
			default:
			    System.out.println("Opci�n no v�lida. Introduzca una opci�n v�lida.");
							
			}
		} while(opcion!=0);
		
		

	}
	
	/*@author 
	 * */
	 
	public static void menu() {
		
		
		
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("                       AGENDA DE CONTACTOS CON SET Y MAP  ");
		System.out.println("                   _________________________________________");
		System.out.println();
		System.out.println("                          1. Listado completo agenda Set ");
		System.out.println("                          2. A�adir un contacto agenda Set ");
		System.out.println("                          3. A�adir una lista de contactos agenda Set");
		System.out.println("                          4. Eliminar un contacto agenda Set ");
		System.out.println("                          5. Eliminar todos los contactos agenda Set");
		System.out.println("                          6. Listado completo agenda Map ");
		System.out.println("                          7. A�adir un contacto agenda Map ");	
		System.out.println("                          8. Eliminar un contacto agenda Map ");	
		System.out.println("                          9. B�squeda de persona por tel�fono en agenda Map");		
		System.out.println("                          0. Salir del programa");
		System.out.println("                          Introduzca una opci�n: ");
		System.out.println("");
		
		
	}
	
	public static void listarPersonas() {
		
	
		
	if(conjuntoPersonas.isEmpty()) {
		System.out.println("La agenda no tiene contactos\n");
		
	}else {
		for(Persona p: conjuntoPersonas) {
		
			System.out.printf(" %s %s (%s) %n",p.getNombre(),p.getApellidos(),p.getTelefono());
		}
		System.out.println("");
	}
		
		
	}
	
	public static void anadirPersona() {
		
		
		
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("                         A�adir nuevo contacto: ");
		System.out.println("                   ________________________________");
		System.out.println();
		System.out.println("                   > Introduzca el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("                   > Introduzca los apellidos: ");
		String apellidos = sc.nextLine();
		System.out.println("                   > Introduzca el tel�fono: ");
		String telefono = sc.nextLine();
		
		Persona nuevaPersona = new Persona(nombre,apellidos,telefono);
		
		if(conjuntoPersonas.contains(nuevaPersona)) {
			System.out.println("Esa persona ya existe en la agenda");
		}else {		
		   conjuntoPersonas.add(new Persona(nombre,apellidos,telefono));		
		   System.out.println("Se ha a�adido correctamente la persona "+ nuevaPersona.getNombre() +" "+nuevaPersona.getApellidos());
		}
		
		
	}
	
	
	public static void anadirListaPersonas() {
		
		
		Persona persona1 = new Persona("Juan","Perez","900123456");
		Persona persona2 = new Persona("Francisco","Perez","900123457");
		Persona persona3 = new Persona("Maria","Perez","900123459");
		
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("                         Adici�n de listado a conjunto  ");
		System.out.println("                   _________________________________________");
		System.out.println();
		System.out.println("                   Lista de personas a�adida a la agenda.");
	
		
        conjuntoPersonas.addAll(listaPersonas);		
        
		conjuntoPersonas.add(persona1);

		
	}
	
	public static void eliminarContacto() {
		
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("                        Eliminar persona: ");
		System.out.println("                   ________________________________");
		System.out.println();
		System.out.println("                   > Introduzca el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("                   > Introduzca los apellidos: ");
		String apellidos = sc.nextLine();
		System.out.println("                   > Introduzca el tel�fono: ");
		String telefono = sc.nextLine();
		
		
		

		Persona personaAEliminar = new Persona(nombre,apellidos,telefono);
		
		if(conjuntoPersonas.contains(personaAEliminar)) {
			System.out.println("Esa persona ya existe en la agenda");
			conjuntoPersonas.remove(personaAEliminar);
		}else {		
		    System.out.println("Esa persona no existe en la agenda");
		}
			
		
		
		
	}
	
	
	
	public static void eliminarTodosContactos() {
		

		
		
		if(!conjuntoPersonas.isEmpty()) {
			
			conjuntoPersonas.clear();
			System.out.println("Eliminados todos los contactos de la agenda");
			
			
		}else {		
		    System.out.println("La agenda ya est� vac�a");
		}
			
		
		
		
	}
	
	
	public static void listarPersonasAgendaMap() {
		
	
		
	if(diccionarioPersonas.isEmpty()) {
		System.out.println("La agenda Map no tiene contactos\n");
		
	}else {
		for(String key: diccionarioPersonas.keySet()) {
		
			System.out.printf(" %s (%s) %n",diccionarioPersonas.get(key),key);
		}
		System.out.println("");
	}
		
		
	}
	
	public static void anadirPersonaAgendaMap() {
		
		
		
		System.out.println("             ");
		System.out.println("           ");
		System.out.println("        ");
		System.out.println("                         A�adir nuevo contacto en Agenda Map: ");
		System.out.println("                   ________________________________");
		System.out.println();
		System.out.println("                   > Introduzca el nombre COMPLETO de la persona (Apellidos,Nombre) : ");
		String nombreCompleto = sc.nextLine();		
		System.out.println("                   > Introduzca el tel�fono: ");
		String telefono = sc.nextLine();
		
		PersonaDiccionario nuevaPersona = new PersonaDiccionario(telefono,nombreCompleto);
		
		if(diccionarioPersonas.containsKey(telefono)) {
			System.out.println("Ese tel�fono ya existe en la agenda Map");
		}else {		
		   diccionarioPersonas.put(telefono,nombreCompleto);		
		   System.out.println("Se ha a�adido correctamente la persona "+ nombreCompleto +" --> "+ telefono);
		}
		
		
	}
	
	
	
    public static void eliminarContactoAgendaMap() {
    	
    	System.out.println("                       ELIMINACI�N DE PERSONA POR TEL�FONO   ");
		System.out.println("                      _____________________________________");
		System.out.println();
		System.out.println("                        > Introduzca el n�mero de tel�fono: ");
		String telefono = sc.nextLine();
		
		if(!diccionarioPersonas.containsKey(telefono)) {
			System.out.println(" -> Ese tel�fono no existe en la agenda");
		}else {
			diccionarioPersonas.remove(telefono);
			System.out.println("La persona con tel�fono " + telefono + " se ha eliminado de la agenda Map");
		}
		
    	
    	
    	
    }

	
	
	public static void busquedaPersonaPorTelefonoAgendaMap() {
		
		System.out.println("                       B�SQUEDA DE PERSONA POR TEL�FONO   ");
		System.out.println("                          ________________________________");
		System.out.println();
		System.out.println("                        > Introduzca el n�mero de tel�fono: ");
		String telefono = sc.nextLine();
		
		if(!diccionarioPersonas.containsKey(telefono)) {
			System.out.println(" -> Ese tel�fono no existe en la agenda");
		}else {
			System.out.println(" RESULTADO: " + telefono + " --> " + diccionarioPersonas.get(telefono));
		}
		
		
	}
	


}
