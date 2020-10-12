package Servlets;

import Logica.Clinica;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletsPaciente", urlPatterns = {"/ServletsPaciente"})
public class ServletsPaciente extends HttpServlet {

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
        String sexo = request.getParameter("sexo");
        String edad = request.getParameter("edad");
        String direccion = request.getParameter("direccion");
        boolean obra = Boolean.parseBoolean(request.getParameter("obra"));
        boolean tutor = Boolean.parseBoolean(request.getParameter("tutor"));
        String contacto = request.getParameter("contacto");
        String idPaciente = request.getParameter("idPaciente");

        String accion = request.getParameter("accion");

        //Response = Respuesta  /  Request = Consulta
        //Hago una solicitud de la session actual e introduciomos los atributos por parametros
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("apellido", apellido);
        request.getSession().setAttribute("dni", dni);
        request.getSession().setAttribute("sexo", sexo);
        request.getSession().setAttribute("edad", edad);
        request.getSession().setAttribute("direccion", direccion);
        request.getSession().setAttribute("obra", obra);
        request.getSession().setAttribute("tutor", tutor);
        request.getSession().setAttribute("contacto", contacto);
        request.getSession().setAttribute("idPaciente", idPaciente);
        request.getSession().setAttribute("accion", accion);

        Clinica control = new Clinica();

        //Hay que referenciarlo con la clase controladora, intanciar un objeto del mismo para acceder a lso atributos
        // de la misma, en  donde estaran los abml del JPA
        if (accion.equals("crear")) {
            if (!nombre.isEmpty() || !apellido.isEmpty() || !edad.isEmpty()) {
                if (control.crear(nombre, apellido, dni, sexo, edad, direccion, obra, tutor, contacto)) {
                    response.sendRedirect("carga-Correcta.jsp");
                } else {
                    response.sendRedirect("carga-Error.jsp");
                }
            } else {
                response.sendRedirect("carga-Error.jsp");
            }
        } else if (accion.equals("modificar")) {
            if (!idPaciente.isEmpty()) {
                control.modificar(nombre, apellido, dni, edad, direccion, obra, tutor, contacto,Integer.parseInt(idPaciente));
                response.sendRedirect("carga-Correcta.jsp");
            } else {
                response.sendRedirect("carga-Error.jsp");
            }

        } else if (accion.equals("eliminar")) {
            if (!idPaciente.isEmpty()) {
                control.eliminarPaciente(Integer.parseInt(idPaciente));
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
