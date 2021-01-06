  
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Registrar", urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String dni = request.getParameter("txtDni");
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");
        String edad = request.getParameter("txtEdad");
        
        request.getSession().setAttribute("txtDni", dni);
        request.getSession().setAttribute("txtNombre", nombre);
        request.getSession().setAttribute("txtApellido", apellido);
        request.getSession().setAttribute("txtEdad", edad);
        response.sendRedirect("Mostrar.jsp");
          
        
        Controladora control = new Controladora();
        control.crearAlumno(dni, nombre, apellido, edad);
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
