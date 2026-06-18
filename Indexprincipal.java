import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivosdetexto {
    public static void main(String[] args) {
        // MODIFICA AQUÍ: Pon tu ruta exacta entre las comillas
        String ruta = "C:/Users/alum.l4/Downloads/lista.txt"; 
        String contenido = "Texto de prueba.";
        try {
            File archivo = new File(ruta);

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con éxito.");
            } else {
                System.out.println("El archivo ya existe en esa ruta.");
            }

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();

        } catch (IOException e) {
            System.out.println("Error: Asegúrate de que las carpetas de la ruta existan.");
            e.printStackTrace();
        }
    }
}
