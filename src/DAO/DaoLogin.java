package DAO;

import MODELO.PasswordHasher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.io.InputStream;

public class DaoLogin {

    public static String USUARIO;
    public static InputStream FOTO;
    public static String RANGO;
    public static int ID_USUARIO;

    public static boolean ingresar(String usuario, String password) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
//        String sql = "SELECT * FROM usuario WHERE nick=? && password=?";
        String sql = "SELECT * FROM usuario WHERE nick=?";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, usuario);
//            consulta.setString(2, password);

            resultado = consulta.executeQuery();
            if (resultado.next()) {
                if (PasswordHasher.deshashear(password, resultado.getString("password"))) {
                    USUARIO = resultado.getString("nick");
                    FOTO = resultado.getBinaryStream("foto");
                    RANGO = resultado.getString("rango");
                    ID_USUARIO = resultado.getInt("idUsuario");
                    return true;
                }
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
}
