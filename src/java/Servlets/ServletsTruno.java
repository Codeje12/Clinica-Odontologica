package Servlets;

import Logica.Clinica;
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
        String ampm = request.getParameter("ampm");
        String tratamiento = request.getParameter("tratamiento");
        String diagnostico = request.getParameter("diagnostico");
        double costo = Double.parseDouble(request.getParameter("costo"));

        //Response = Respuesta  /  Request = Consulta
        //Hago una solicitud de la session actual e introduciomos los atributos por parametros
        request.getSession().setAttribute("dia",dia);
        request.getSession().setAttribute("hora",hora);
        request.getSession().setAttribute("ampm",ampm);
        request.getSession().setAttribute("tratamiento",tratamiento);
        request.getSession().setAttribute("diagnostico",diagnostico);
        request.getSession().setAttribute("costo", costo);
        response.sendRedirect("carga-Correcta.jsp");
        Clinica control = new Clinica();
        
        //Hay que referenciarlo con la clase controladora, intanciar un objeto del mismo para acceder a lso atributos
        // de la misma, en  donde estaran los abml del JPA
        control.crearTurno(dia,hora,ampm,tratamiento,diagnostico,costo);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
