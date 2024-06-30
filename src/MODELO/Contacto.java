package MODELO;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Contacto {

    private String telefono;
    private int idUsuario;
    private String nombre;
    private String descripcion;
    private ArrayList<String> etiquetas;
    private InputStream foto;
    private Timestamp fecha;

    public Contacto(String telefono, int idUsuario, String nombre, String descripcion, ArrayList<String> etiquetas, InputStream foto, Timestamp fecha) {
        this.telefono = telefono;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
        this.foto = foto;
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

}
