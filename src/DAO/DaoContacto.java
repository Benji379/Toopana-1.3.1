package DAO;

import MODELO.Contacto;
import MODELO.JsonUtil;
import MODELO.UIController;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.io.InputStream;
import javax.swing.Icon;

public class DaoContacto {

    public static void registrar(Contacto con) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "INSERT INTO contacto (idUsuario, nombre, telefono, etiquetas, descripcion, fecha) VALUES (?,?,?,?,?,?)";
        try {

            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setInt(1, con.getIdUsuario());
            consulta.setString(2, con.getNombre());
            consulta.setString(3, con.getTelefono());
            consulta.setString(4, JsonUtil.arrayListToJson(con.getEtiquetas()));
            consulta.setString(5, con.getDescripcion());
            consulta.setTimestamp(6, con.getFecha());
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
        }
    }

    public static void actualizar(Contacto con, int idContacto) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "UPDATE contacto set nombre= ?, telefono=?, etiquetas=?, descripcion=?, foto=?, fecha=? WHERE idContacto=?";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, con.getNombre());
            consulta.setString(2, con.getTelefono());
            consulta.setString(3, JsonUtil.arrayListToJson(con.getEtiquetas()));
            consulta.setString(4, con.getDescripcion());
            consulta.setBinaryStream(5, con.getFoto());
            consulta.setTimestamp(6, con.getFecha());
            consulta.setInt(7, idContacto);
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
        }
    }

    public static void eliminar(int idContacto) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "DELETE FROM contacto WHERE idContacto=?";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setInt(1, idContacto);
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
        }
    }

    public static ArrayList<Contacto> consultarContactos() {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        String sql = "SELECT * FROM contacto WHERE idUsuario=?";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setInt(1, DaoLogin.ID_USUARIO);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                int idUsuario = resultado.getInt("idContacto");
                String nombre = resultado.getString("nombre");
                String telefono = resultado.getString("telefono");
                ArrayList<String> etiquetas = JsonUtil.jsonToArrayList(resultado.getString("etiquetas"));
                String descripcion = resultado.getString("descripcion");
                InputStream icono = resultado.getBinaryStream("foto");
                Timestamp fecha = resultado.getTimestamp("fecha");
                Contacto con = new Contacto(telefono, idUsuario, nombre, descripcion, etiquetas, icono, fecha);
                listaContactos.add(con);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
            DaoUtils.cerrar(resultado);
        }
        return listaContactos;
    }

    public static ArrayList<VISTA.Contacto> toContactos() {
        ArrayList<VISTA.Contacto> listaContactos = new ArrayList<>();

        for (Contacto con : consultarContactos()) {
            try {
                VISTA.Contacto contacto = new VISTA.Contacto();
                contacto.setId(con.getIdUsuario());
                contacto.setNombre(con.getNombre());
                contacto.setTelefono(con.getTelefono());
                contacto.setDescripcion(con.getDescripcion());
                if (con.getFoto() != null) {
                    Icon icono = UIController.toIcon(con.getFoto());
                    contacto.setImagenPerfil(icono);
                }
                contacto.setEtiquetas(con.getEtiquetas());
                listaContactos.add(contacto);
            } catch (IOException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }

        }
        return listaContactos;
    }

}
