package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPacientes implements IDAOPaciente {

    Connection conexion;

    // constructor
    public DAOPacientes() { // Conexion con la base de datos
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }

    @Override
    public List<Pacientes> listarPacientes() {
        PreparedStatement ps;
        ResultSet rs;
        List<Pacientes> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT * FROM pacientes");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idPaciente");
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidop = rs.getString("apellidop");
                String apellidom = rs.getString("apellidom");
                String genero = rs.getString("genero");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String ocupacion = rs.getString("ocupacion");
                String direccion = rs.getString("direccion");

                Pacientes paciente = new Pacientes(id, dni, nombre, apellidop, apellidom, genero, email, telefono, ocupacion, direccion);
                lista.add(paciente);
            }
            return lista;

        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }

    }

    @Override
    public Pacientes mostrarPacientes(int _id) {
        PreparedStatement ps;
        ResultSet rs;
        Pacientes paciente = null;

        try {
            ps = conexion.prepareStatement("SELECT * FROM pacientes WHERE idPaciente=?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idPaciente");
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidop = rs.getString("apellidop");
                String apellidom = rs.getString("apellidom");
                String genero = rs.getString("genero");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String ocupacion = rs.getString("ocupacion");
                String direccion = rs.getString("direccion");

                paciente = new Pacientes(id, dni, nombre, apellidop, apellidom, genero, email, telefono, ocupacion, direccion);
            }
            return paciente;

        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @Override
    public boolean insertarPacientes(Pacientes paciente) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO pacientes(dni,nombre,apellidop,apellidom,genero,email,telefono,ocupacion,direccion) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, paciente.getDni());
            ps.setString(2, paciente.getNombre());
            ps.setString(3, paciente.getApellidop());
            ps.setString(4, paciente.getApellidom());
            ps.setString(5, paciente.getGenero());
            ps.setString(6, paciente.getEmail());
            ps.setString(7, paciente.getTelefono());
            ps.setString(8, paciente.getOcupacion());
            ps.setString(9, paciente.getDireccion());

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
    public boolean actualizarPacientes(Pacientes paciente) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE pacientes SET dni=?, nombre=?, apellidop=?,apellidom=?,genero=?,email=?,telefono=?, ocupacion=?,direccion=? WHERE idPaciente=?");
            ps.setString(1, paciente.getDni());
            ps.setString(2, paciente.getNombre());
            ps.setString(3, paciente.getApellidop());
            ps.setString(4, paciente.getApellidom());
            ps.setString(5, paciente.getGenero());
            ps.setString(6, paciente.getEmail());
            ps.setString(7, paciente.getTelefono());
            ps.setString(8, paciente.getOcupacion());
            ps.setString(9, paciente.getDireccion());
            ps.setInt(10, paciente.getId());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public boolean eliminarPacientes(int _id) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM pacientes WHERE idPaciente=?");
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
        List<Pacientes> lista = new ArrayList<>();
        String sql;
        sql = "SELECT * FROM pacientes WHERE dni LIKE '%" + texto + "%' OR nombre LIKE '%" + texto + "%'";
        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pacientes paciente = new Pacientes();
                paciente.setId(rs.getInt("idPaciente"));
                paciente.setDni(rs.getString("dni"));
                paciente.setApellidop(rs.getString("apellidop"));
                paciente.setApellidom(rs.getString("apellidom"));
                paciente.setGenero(rs.getString("genero"));
                paciente.setEmail(rs.getString("email"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setOcupacion(rs.getString("ocupacion"));
                paciente.setDireccion(rs.getString("direccion"));
                lista.add(paciente);
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
