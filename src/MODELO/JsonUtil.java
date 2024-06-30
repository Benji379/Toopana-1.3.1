package MODELO;

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
}
