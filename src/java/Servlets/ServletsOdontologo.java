package Servlets;

import Logica.Clinica;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletsOdontologo", urlPatterns = {"/ServletsOdontologo"})
public class ServletsOdontologo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        String edad = request.getParameter("edad");
        String especialidad = request.getParameter("especialidad");
        String horarioInicioTrabajo = request.getParameter("horarioInicioTrabajo");
        String horarioFinTrabajo = request.getParameter("horarioFinTrabajo");
        String accion = request.getParameter("accion");
        //Response = Respuesta  /  Request = Consulta
        //Hago una solicitud de la session actual e introduciomos los atributos por parametros
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("apellido", apellido);
        request.getSession().setAttribute("dni", dni);
        request.getSession().setAttribute("edad", edad);
        request.getSession().setAttribute("especialidad", especialidad);
        request.getSession().setAttribute("horarioInicioTrabajo", horarioInicioTrabajo);
        request.getSession().setAttribute("horarioFinTrabajo", horarioFinTrabajo);

        Clinica control = new Clinica();
        if (accion.equals("crear")) {
            if (control.crearOdontologo(nombre, apellido, dni, edad, especialidad, horarioInicioTrabajo, horarioFinTrabajo)) {
                response.sendRedirect("carga-Correcta.jsp");
            } else {
                response.sendRedirect("carga-Error.jsp");
            }
        } else if (accion.equals("modificar")) {
            if (!dni.isEmpty()) {
                control.modificarOdontologo(nombre, apellido, dni, edad, horarioInicioTrabajo, horarioFinTrabajo);
                response.sendRedirect("carga-Correcta.jsp");
            } else {
                response.sendRedirect("carga-Error.jsp");
            }

        } else if (accion.equals("eliminar")) {
            if (!dni.isEmpty()) {
                control.eliminarOdontologo(dni);
                response.sendRedirect("carga-Correcta.jsp");
            } else {
                response.sendRedirect("carga-Error.jsp");
            }
        }

}

@Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
