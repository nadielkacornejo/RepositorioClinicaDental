package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import modelo.DAOServicios;
import modelo.Servicios;

public class ControllerServicios extends HttpServlet {

    @Override
    // como parametros, pide una solicitud y una respuesta
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DAOServicios daoServicios = new DAOServicios();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Servicios/servicios.jsp");
            List<Servicios> listaServicios = daoServicios.listarServicios();
            request.setAttribute("lista", listaServicios);

        } else if (accion.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("Servicios/nuevo.jsp");

        } else if (accion.equals("insertar")) {
            // recibe informacion para agregarla al metodo
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            Double costo = Double.parseDouble(request.getParameter("costo"));

            Servicios servicio = new Servicios(0, codigo, nombre, costo);
            daoServicios.insertarServicios(servicio);
            dispatcher = request.getRequestDispatcher("Servicios/servicios.jsp"); // redirigimos a la pag servicios
            List<Servicios> listaServicios = daoServicios.listarServicios();    // listamos los servicios en la pagina 
            request.setAttribute("lista", listaServicios);

        } else if (accion.equals("modificar")) {
            dispatcher = request.getRequestDispatcher("Servicios/modificar.jsp");
            int id = Integer.parseInt(request.getParameter("id"));
            Servicios servicio = daoServicios.mostrarServicios(id);
            request.setAttribute("servicio", servicio);
            //System.out.println("id" + id);

        } else if (accion.equals("actualizar")) {

            int id = Integer.parseInt(request.getParameter("id"));
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            Double costo = Double.parseDouble(request.getParameter("costo"));

            Servicios servicio = new Servicios(id, codigo, nombre, costo);
            daoServicios.actualizarServicios(servicio);

            dispatcher = request.getRequestDispatcher("Servicios/servicios.jsp");
            List<Servicios> listaServicios = daoServicios.listarServicios();
            request.setAttribute("lista", listaServicios);

        } else if (accion.equals("eliminar")) {

            int id = Integer.parseInt(request.getParameter("id"));

            daoServicios.eliminarServicios(id);
            // redirigir al index
            dispatcher = request.getRequestDispatcher("Servicios/servicios.jsp");
            request.setAttribute("lista", daoServicios.listarServicios()); // con la lista

        } else if (accion.equals("buscar")) {
            // recibe informacion
            String dato = request.getParameter("txtBuscar");
            List<Servicios> lista = daoServicios.buscar(dato);
            dispatcher = request.getRequestDispatcher("Servicios/servicios.jsp");
            request.setAttribute("lista", lista);
        } else {
            dispatcher = request.getRequestDispatcher("Servicios/servicios.jsp");
            List<Servicios> listaServicios = daoServicios.listarServicios();
            request.setAttribute("lista", listaServicios);
        }

        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
