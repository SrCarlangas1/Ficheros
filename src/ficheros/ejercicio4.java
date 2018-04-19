package ficheros;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
                
		// Fichero del que queremos leer
		File fichero = new File("notas.txt");
		Scanner s = null;
		try {
                    s = new Scanner(fichero);
                    FileWriter fichero2;
                    
                    String sl = System.lineSeparator();
                    fichero2 = new FileWriter("ejercicio5.txt");
                    Personas alumno = new Personas();
                    while (s.hasNextLine()) {
                        String linea = s.nextLine();
                        String[] contenido = linea.split(" ");// Aqui le estamos diciendo que nos coja el stream hasta el espacio.
                        String nombre = contenido[0];
                        alumno.setNombre(nombre);
                        
                        String apellido = contenido[1];
                        alumno.setApellido1(apellido);
                        
                        String apellido2 = contenido[2];
                        alumno.setApellido2(apellido2);
                        
                        String nota1 = contenido[3];
                        alumno.setNota1(Integer.parseInt(nota1));
                        
                        String nota2 = contenido[4];
                        alumno.setNota2(Integer.parseInt(nota2));
                        
                        String nota3 = contenido[5];
                        alumno.setNota3(Integer.parseInt(nota3));
                        
                        String nota4 = contenido[6];
                        alumno.setNota4(Integer.parseInt(nota4));
                        
                        String nota5 = contenido[7];
                        alumno.setNota5(Integer.parseInt(nota5));
                        
                        String nota6 = contenido[8];
                        alumno.setNotaFOL(nota6);
                         
                        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ejercicio5.txt"));
                        out.writeObject(alumno);
                        
                        
                        
                        
                        
                        alumno.mostrarnotas();
                    }
                    fichero2.close();
		} catch (IOException ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
                
	}
}