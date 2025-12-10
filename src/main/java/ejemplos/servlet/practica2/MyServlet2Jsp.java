package ejemplos.servlet.practica2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet2Jsp")
public class MyServlet2Jsp extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("lname");

        request.setAttribute("nombreUsuario", nombre);

        request.getRequestDispatcher("/bienvenida.jsp").forward(request, response);
    }
}
