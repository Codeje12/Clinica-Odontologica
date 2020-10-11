
package Servlets;

import Logica.Clinica;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletsSecretaria", urlPatterns = {"/ServletsSecretaria"})
public class ServletsSecretaria extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        String horario = request.getParameter("sexo");
        String accion = request.getParameter("accion");
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("apellido", apellido);
        request.getSession().setAttribute("dni", dni);
        request.getSession().setAttribute("horario", horario);
        
        Clinica control = new Clinica();

        //Hay que referenciarlo con la clase controladora, intanciar un objeto del mismo para acceder a lso atributos
        // de la misma, en  donde estaran los abml del JPA
        if (accion.equals("crear")) {
            if (!nombre.isEmpty() || !apellido.isEmpty() ) {
                if (control.crear(nombre, apellido, dni,horario)) {
                    response.sendRedirect("carga-Correcta.jsp");
                } else {
                    response.sendRedirect("carga-Error.jsp");
                }
            } else {
                response.sendRedirect("carga-Error.jsp");
            }
        } else if (accion.equals("modificar")) {
            if (!dni.isEmpty()) {
                control.modificar(nombre, apellido, dni,horario);
                response.sendRedirect("carga-Correcta.jsp");
            } else {
                response.sendRedirect("carga-Error.jsp");
            }

        } else if (accion.equals("eliminar")) {
            if (!dni.isEmpty()) {
                control.eliminarSecretaria(dni);
                response.sendRedirect("carga-Correcta.jsp");
            } else {
                response.sendRedirect("carga-Error.jsp");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
