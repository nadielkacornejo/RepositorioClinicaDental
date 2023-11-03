
package modelo;

import java.util.List;

public interface IDAOServicio {
    public List<Servicios> listarServicios();
    public Servicios mostrarServicios(int _id);
    public boolean insertarServicios(Servicios servicio);
    public boolean actualizarServicios(Servicios servicio);
    public boolean eliminarServicios(int _id);
    public List buscar(String texto);
    
}
