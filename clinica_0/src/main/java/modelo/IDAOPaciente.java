
package modelo;

import java.util.List;

public interface IDAOPaciente {
    public List<Pacientes> listarPacientes();
    public Pacientes mostrarPacientes(int _id);
    public boolean insertarPacientes(Pacientes paciente);
    public boolean actualizarPacientes(Pacientes paciente);
    public boolean eliminarPacientes(int _id);
    public List buscar(String texto);
    
}
