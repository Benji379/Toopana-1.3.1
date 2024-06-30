package DAO;

import MODELO.PasswordHasher;
import MODELO.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DaoUsuario {

    public static boolean registrarUsuario(Usuario us) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "INSERT INTO usuario (nick, nombres, apellidos, password, email, telefono, foto, fecha) VALUES (?,?,?,?,?,?,?,?)";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, us.getUsuario());
            consulta.setString(2, us.getNombres());
            consulta.setString(3, us.getApellidos());
            String hashPass = PasswordHasher.hashearPassword(us.getPassword());
            consulta.setString(4, hashPass);
            consulta.setString(5, us.getEmail());
            consulta.setString(6, us.getTelefono());
            consulta.setBinaryStream(7, us.getImagen());
            consulta.setTimestamp(8, us.getFecha());
            int res = consulta.executeUpdate();
            if (res == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
        }
        return false;
    }

    public static boolean usuarioValido(String usuario) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        String sql = "SELECT * FROM usuario WHERE nick=?";

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
            DaoUtils.cerrar(resultado);
        }
        return false;
    }

    public static int idUsuario(String usuario) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        String sql = "SELECT * FROM usuario WHERE nick=?";

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                return resultado.getInt("idUsuario");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
            DaoUtils.cerrar(resultado);
        }
        return 0;
    }

}
