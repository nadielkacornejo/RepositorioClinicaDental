package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOServicios implements IDAOServicio {

    Connection conexion;

    // constructor
    public DAOServicios() { // Conexion con la base de datos
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }

    @Override
    public List<Servicios> listarServicios() {
        PreparedStatement ps;
        ResultSet rs;
        List<Servicios> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT id_servicios, codigo, nombre, costo FROM servicios");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_servicios");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                Double costo = rs.getDouble("costo");

                Servicios servicio = new Servicios(id, codigo, nombre, costo);
                lista.add(servicio);
            }
            return lista;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }

    }

    @Override
    public Servicios mostrarServicios(int _id) {
        PreparedStatement ps;
        ResultSet rs;
        Servicios servicio = null;

        try {
            ps = conexion.prepareStatement("SELECT id_servicios, codigo, nombre, costo FROM servicios WHERE id_servicios=?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_servicios");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                Double costo = rs.getDouble("costo");

                servicio = new Servicios(id, codigo, nombre, costo);
            }
            return servicio;

        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @Override
    public boolean insertarServicios(Servicios servicio) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO servicios(codigo, nombre, costo) VALUES (?,?,?)");
            ps.setString(1, servicio.getCodigo());
            ps.setString(2, servicio.getNombre());
            ps.setDouble(3, servicio.getCosto());

            ps.execute();
            System.out.println("insertado correctamente");
            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("fallo!");
            return false;
        }
    }

    @Override
    public boolean actualizarServicios(Servicios servicio) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE servicios SET codigo=?, nombre=?, costo=? WHERE id_servicios=?");
            ps.setString(1, servicio.getCodigo());
            ps.setString(2, servicio.getNombre());
            ps.setDouble(3, servicio.getCosto());
            ps.setInt(4, servicio.getId());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public boolean eliminarServicios(int _id) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM servicios WHERE id_servicios=?");
            ps.setInt(1, _id);
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public List buscar(String texto) {
        PreparedStatement ps;
        ResultSet rs;
        List<Servicios> lista = new ArrayList<>();
        String sql;
        sql = "SELECT * FROM servicios WHERE codigo LIKE '%"+texto+"%' OR nombre LIKE '%"+texto+"%'";
        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Servicios servicio = new Servicios();
                servicio.setId(rs.getInt("id_servicios"));
                servicio.setCodigo(rs.getString("codigo"));
                servicio.setNombre(rs.getString("nombre"));
                servicio.setCosto(rs.getDouble("costo"));
                lista.add(servicio);
                System.out.println("exito");

            }
            return lista;
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("falle");
            return null;
        }
    }
}
