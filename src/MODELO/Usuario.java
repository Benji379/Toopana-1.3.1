package MODELO;

import java.io.InputStream;
import java.sql.Timestamp;

public class Usuario {
    
    private String usuario;
    private String nombres;
    private String apellidos;
    private String password;
    private String email;
    private String telefono;
    private InputStream imagen;
    private Timestamp fecha;

    public Usuario(String usuario, String nombres, String apellidos, String password, String email, String telefono, InputStream imagen, Timestamp fecha) {
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.password = password;
        this.email = email;
        this.telefono = telefono;
        this.imagen = imagen;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public InputStream getImagen() {
        return imagen;
    }

    public void setImagen(InputStream imagen) {
        this.imagen = imagen;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
    
}
