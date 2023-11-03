package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import modelo.DAOPacientes;
import modelo.Pacientes;

public class ControllerPacientes extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControllerPacientes</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControllerPacientes at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAOPacientes daoPacientes = new DAOPacientes();
        String action;
        RequestDispatcher dispatcher = null;
        action = request.getParameter("action");

        if (action == null || action.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Pacientes/pacientes.jsp");
            List<Pacientes> listaPacientes = daoPacientes.listarPacientes();
            request.setAttribute("lista", listaPacientes);
        } else if (action.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("Pacientes/nuevo.jsp");
        } else if (action.equals("insertar")) {
            // recibo informacion de la pagina jsp
            String dni = request.getParameter("dni"); // conversion a int 
            String nombre = request.getParameter("nombre");
            String apep = request.getParameter("apellidop");
            String apem = request.getParameter("apellidom");
            String genero = request.getParameter("genero");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");
            String ocupacion = request.getParameter("ocupacion");
            String direccion = request.getParameter("direccion");

            Pacientes paciente = new Pacientes(0, dni, nombre, apep, apem, genero, email, telefono, ocupacion, direccion);
            daoPacientes.insertarPacientes(paciente); // insertamos
            dispatcher = request.getRequestDispatcher("Pacientes/pacientes.jsp"); // redirigimos a la pag pacientes
            List<Pacientes> listaPacientes = daoPacientes.listarPacientes();            // listamos a pacientes
            request.setAttribute("lista", listaPacientes);                      // pasamos datos
        } else if (action.equals("modificar")) {
            dispatcher = request.getRequestDispatcher("Pacientes/modificar.jsp");
            int id = Integer.parseInt(request.getParameter("id"));
            Pacientes paciente = daoPacientes.mostrarPacientes(id);
            request.setAttribute("paciente", paciente);

        } else if (action.equals("actualizar")) {

            // recibo informacion de la pagina jsp
            int id = Integer.parseInt(request.getParameter("id"));// conversion a int 
            String dni = request.getParameter("dni"); 
            String nombre = request.getParameter("nombre");
            String apep = request.getParameter("apellidop");
            String apem = request.getParameter("apellidom");
            String genero = request.getParameter("genero");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");
            String ocupacion = request.getParameter("ocupacion");
            String direccion = request.getParameter("direccion");
            Pacientes paciente = new Pacientes(id, dni, nombre, apep, apem, genero, email, telefono, ocupacion, direccion);
            daoPacientes.actualizarPacientes(paciente);

            dispatcher = request.getRequestDispatcher("Pacientes/pacientes.jsp");
            List<Pacientes> listaPacientes = daoPacientes.listarPacientes();
            request.setAttribute("lista", listaPacientes);
        } else if (action.equals("eliminar")) {

            int id = Integer.parseInt(request.getParameter("id"));

            daoPacientes.eliminarPacientes(id);
            // redirigir al index
            dispatcher = request.getRequestDispatcher("Pacientes/pacientes.jsp");
            request.setAttribute("lista", daoPacientes.listarPacientes()); // le paso lista

        } else if (action.equals("buscar")) {
            // recibe informacion
            String dato = request.getParameter("txtBuscar");
            List<Pacientes> lista = daoPacientes.buscar(dato);
            dispatcher = request.getRequestDispatcher("Pacientes/pacientes.jsp");
            request.setAttribute("lista", lista);
        } else {
            dispatcher = request.getRequestDispatcher("Pacientes/pacientes.jsp");
            List<Pacientes> listaPacientes = daoPacientes.listarPacientes();
            request.setAttribute("lista", listaPacientes);
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
    }// </editor-fold>

}
