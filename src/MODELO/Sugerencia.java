package MODELO;

import java.sql.Timestamp;

public class Sugerencia {

    private int idUsuario;
    private String tema;
    private String tipo;
    private String telefono;
    private String descripcion;
    private Timestamp fecha;

    public Sugerencia(int idUsuario, String tema, String tipo, String telefono, String descripcion, Timestamp fecha) {
        this.idUsuario = idUsuario;
        this.tema = tema;
        this.tipo = tipo;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

}
