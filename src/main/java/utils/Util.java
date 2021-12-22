package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {

    public static String getPeruRailURLL() throws IOException {
        return getValue("peruRailURL");
    }

    private static String getValue(String clave) throws IOException {
        Properties properties = new Properties();
        String nombreArchivo = "config.properties";
        InputStream inputStream;
        inputStream = Util.class.getClassLoader().getResourceAsStream(nombreArchivo);
        properties.load(inputStream);
        inputStream.close();
        String valor = properties.getProperty(clave);
        if (valor != null) {
            return valor;
        } else {
            throw new RuntimeException(clave + " no especificado en el archivo " + nombreArchivo);
        }
    }
}
