package negocio;

/**
 *
 * @author jessicaramsa
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorArchivo {
    File archivo;
    FileWriter fw;
    PrintWriter pw;

    public boolean guardarResultado(String r1, String r2, String path) throws IOException {
        try {
            archivo = new File(path);
            fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);
            pw.println("Raiz 1: " + r1 + "   Raiz 2:" + r2);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            fw.close();
        }
    }
}