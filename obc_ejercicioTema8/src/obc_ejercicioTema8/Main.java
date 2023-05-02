package obc_ejercicioTema8;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.setEdad(35);
		persona.setNombre("Carlos");
		persona.setTelefono("656656656");
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getEdad());
		System.out.println(persona.getTelefono());
	}
}
