package ficheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LecturaFicheros {

	public static void main(String[] args) {

		// Fichero del que queremos leer
		File fichero = new File("streams.txt");
		Scanner s = null;
		try {
                    s = new Scanner(fichero);
                    FileWriter fichero2;
                    
                    String sl = System.lineSeparator();
                    fichero2 = new FileWriter("fichero_escritura.txt");
                    fichero2.write("---------------------------"+sl);
                    fichero2.write("Listado de alumnos "+ sl);
                    fichero2.write("---------------------------"+sl);
                    int incremento = 1;
                    while (s.hasNextLine()) {
                        String linea = s.nextLine();
                        String[] contenido = linea.split(" ");// Aqui le estamos diciendo que nos coja el stream hasta el espacio.
                        String nombre = contenido[0];
                        String apellido = contenido[1];
                        String edad = contenido[2];
                        if (Integer.parseInt(edad) > 17){
                            fichero2.write("-------Alumno nº" +incremento+"------------"+sl);
                            fichero2.write("Nombre: " +nombre+sl);
                            fichero2.write("Apellido: " +apellido+sl);
                            fichero2.write("Edad: " +edad+sl);
                        }
                        incremento++;// Aqui le incrementamos el valor del alumno.
                    }
                    fichero2.close();// Aqui cerramos el fichero es OBLIGATORIO

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