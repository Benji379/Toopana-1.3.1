package Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.ArrayList;

public class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Método para convertir ArrayList<String> a JSON
    public static String arrayListToJson(ArrayList<String> list) {
        try {
            return objectMapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    // Método para convertir JSON a ArrayList<String>
    public static ArrayList<String> jsonToArrayList(String json) {
        try {
            return objectMapper.readValue(json, new TypeReference<ArrayList<String>>() {
            });
        } catch (JsonProcessingException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear un ArrayList<String>
        ArrayList<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("dato1");
        listaOriginal.add("dato2");
        listaOriginal.add("dato3");

        // Convertir ArrayList<String> a JSON
        String json = arrayListToJson(listaOriginal);
        System.out.println("JSON generado: " + json);

        // Convertir JSON a ArrayList<String>
        ArrayList<String> listaRecuperada = jsonToArrayList(json);
        System.out.println("ArrayList recuperado del JSON:");
        for (String dato : listaRecuperada) {
            System.out.println(dato);
        }
    }
}
