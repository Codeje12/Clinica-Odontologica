package Servlets;

import Logica.Clinica;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "servletsLogin", urlPatterns = {"/servletsLogin"})
public class servletsLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        boolean permiso = false;
        Clinica ctr = new Clinica();
        
        permiso = ctr.verficacionAcceso(request.getParameter("usuario"),request.getParameter("password"));

        if (permiso) {
            HttpSession sesionActual = request.getSession(true);
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            sesionActual.setAttribute("usuario", usuario);
            sesionActual.setAttribute("ctr", ctr);
            response.sendRedirect("inicio.jsp");
        }else{
            response.sendRedirect("error-Login.jsp");
        }

        //Hago una consulta a la sesion actual e introduzco los atributos
        
        
        
        //response.sendRedirect(ctr.verficacionAcceso(usuario, password));
        //response.sendRedirect("inicio.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
