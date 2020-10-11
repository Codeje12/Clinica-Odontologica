package Servlets;

import Logica.Clinica;
import Logica.Odontologo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletsTruno", urlPatterns = {"/ServletsTruno"})
public class ServletsTruno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String dia = request.getParameter("dia");
        String hora = request.getParameter("hora");
        String tratamiento = request.getParameter("tratamiento");
        String diagnostico = request.getParameter("diagnostico");
        double costo = Double.parseDouble(request.getParameter("costo"));
        int odontologo = Integer.parseInt(request.getParameter("odontologo"));
        int paciente = Integer.parseInt(request.getParameter("paciente"));

        String accion = request.getParameter("accion");
        
        //Response = Respuesta  /  Request = Consulta
        //Hago una solicitud de la session actual e introduciomos los atributos por parametros
        request.getSession().setAttribute("dia", dia);
        request.getSession().setAttribute("hora", hora);
        request.getSession().setAttribute("tratamiento", tratamiento);
        request.getSession().setAttribute("diagnostico", diagnostico);
        request.getSession().setAttribute("costo", costo);
        request.getSession().setAttribute("odontologo", odontologo);
        request.getSession().setAttribute("paciente", paciente);
        request.getSession().setAttribute("accion", accion);
        
        Clinica control = new Clinica();

        //Hay que referenciarlo con la clase controladora, intanciar un objeto del mismo para acceder a lso atributos
        // de la misma, en  donde estaran los abml del JPA
        if (accion.equals("crear")) {
            if (control.crear(dia, hora, tratamiento, diagnostico, costo, odontologo,paciente)) {
                response.sendRedirect("carga-Correcta.jsp");
            } else {
                response.sendRedirect("carga-Error.jsp");
            }
        } else if (accion.equals("modificar")) {
            if (!dia.isEmpty() || !hora.isEmpty()) {
                control.modificar(dia, hora, tratamiento, diagnostico, costo,odontologo, paciente);
                response.sendRedirect("carga-Correcta.jsp");
            } else {
                response.sendRedirect("carga-Error.jsp");
            }

        } else if (accion.equals("eliminar")) {
            if (!dia.isEmpty()) {
                control.eliminarTurno(paciente);
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
