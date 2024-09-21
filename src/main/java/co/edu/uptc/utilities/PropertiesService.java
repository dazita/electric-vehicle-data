package co.edu.uptc.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesService {

    private String filePath = "src/main/java/co/edu/uptc/resources/app.properties";

   public String getKeyValue(String key) {
    Properties properties = new Properties();
    String value = "";
    try (InputStream input = getClass().getClassLoader().getResourceAsStream(filePath)) {
        if (input == null) {
            System.out.println("Archivo de propiedades no encontrado");
            return value;
        }
        properties.load(input);
        value = properties.getProperty(key);
    } catch (IOException e) {
        System.out.println("Error al leer propiedades: " + e.getMessage());
    }
    return value;
}

}
