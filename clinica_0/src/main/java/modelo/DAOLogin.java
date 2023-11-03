package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOLogin {
    Connection conexion;
    int rspta = 0;
    String sql = "";
    ResultSet rs = null;
    PreparedStatement ps;
    Conexion con = new Conexion();

    public DAOLogin() { // Conexion con la base de datos
        conexion = con.getConexion();
    }

    

    public int validarLogin(Recepcionista tm) throws Exception {
        sql = "SELECT COUNT(idrecep) AS cantidad FROM `recepcionista` WHERE usuario='" + tm.getUsuario() + "' AND contrasenia='" + tm.getContrasenia() + "'";
        ps = conexion.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            rspta = rs.getInt("cantidad");
        }
        return rspta;
    }

}
