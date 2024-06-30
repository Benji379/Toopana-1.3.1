package DAO;

import MODELO.Sugerencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoSugerencia {

    public static void registrar(Sugerencia sug) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "INSERT INTO sugerencia (idUsuario, tema, tipo, telefono, sugerencia, fecha) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setInt(1, sug.getIdUsuario());
            consulta.setString(2, sug.getTema());
            consulta.setString(3, sug.getTipo());
            consulta.setString(4, sug.getTelefono());
            consulta.setString(5, sug.getDescripcion());
            consulta.setTimestamp(6, sug.getFecha());
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
        }
    }

}
