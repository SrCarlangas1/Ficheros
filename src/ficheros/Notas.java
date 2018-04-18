package ficheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		// Fichero del que queremos leer
		File fichero = new File("notas.txt");
		Scanner s = null;
		try {
                    s = new Scanner(fichero);
                    FileWriter fichero1;
                    
                    String sl = System.lineSeparator();
                    fichero1 = new FileWriter("boletin.txt");
                    fichero1.write("---------------------------"+sl);
                    fichero1.write("Boletin de notas IES FBMOLL "+ sl);
                    fichero1.write("---------------------------"+sl);
                    int aprobados = 0;
                    int suspendidos = 0;
                    int convalidados = 0;
                    while (s.hasNextLine()) {
                        String linea = s.nextLine();
                        String[] contenido = linea.split(" ");// Aqui le estamos diciendo que nos coja el stream hasta el espacio.
                        String nombre = contenido[0];
                        String apellido1 = contenido[1];
                        String apellido2 = contenido[2];
                        String nota1 = contenido[3];
                        String nota2 = contenido[4];
                        String nota3 = contenido[5];
                        String nota4 = contenido[6];
                        String nota5 = contenido[7];
                        String convalidacion = contenido[8];
                            fichero1.write("---------------------------------------------      ------------------"+sl);
                            fichero1.write("Alumno: " +contenido[0]+ " " +contenido[1]+ " " +contenido[2] +sl);
                            fichero1.write("---------------------------------------------      ------------------"+sl);
                            fichero1.write("     Modulo                                             Nota"+sl);
                            fichero1.write("---------------------------------------------      ------------------"+sl);
                            fichero1.write("Lenguaje de Marcas                                         "+contenido[3]+sl);
                            fichero1.write("Programación                                               "+contenido[4]+sl);
                            fichero1.write("Entornos de desarrollo                                     "+contenido[5]+sl);
                            fichero1.write("Base de datos                                              "+contenido[6]+sl);
                            fichero1.write("Sistemas informáticos                                      "+contenido[7]+sl);
                            fichero1.write("FOL                                                        "+contenido[8]+sl);
                            fichero1.write("-----------------------------------------------------------------------"+sl);
                            if (Integer.parseInt(nota1)>=5) {
                            aprobados++;
                        }else{
                                suspendidos++;
                            }
                            
                            if (Integer.parseInt(nota2)>=5) {
                            aprobados++;
                        }else{
                                suspendidos++;
                            }
                            
                            if (Integer.parseInt(nota3)>=5) {
                            aprobados++;
                        }else{
                                suspendidos++;
                            }
                            
                            if (Integer.parseInt(nota4)>=5) {
                            aprobados++;
                        }else{
                                suspendidos++;
                            }
                            
                            if (Integer.parseInt(nota5)>=5) {
                            aprobados++;
                        }else{
                                suspendidos++;
                            }
                            
                            if (convalidacion.equalsIgnoreCase("c")) {
                            convalidados++;
                        }
                            
                            fichero1.write("------------------------------------------------"+sl);
                            fichero1.write("Nº de modulos aprobados :" +aprobados+sl);
                            fichero1.write("Nº de modulos suspendidos :" +suspendidos+sl);
                            fichero1.write("Nº de modulos convalidados :" +convalidados+sl);
                    }
                    fichero1.close();// Aqui cerramos el fichero es OBLIGATORIO

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