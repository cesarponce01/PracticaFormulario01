package ejemplos.servlet.curso;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML de Bienvenida</title></head>");
		out.println("<body>");
		out.println("<h1>Ejemplo Servlet</h1>");
		out.println("<p>Nombre: </p>");
		out.println("<form action=\"/myServlet2\" method=\"GET\">");
		out.println("<input type=\"text\" name=\"lname\" value=\"César\"/>");
		out.println("<button type=\"submit\">Enviar</button>");
		out.println("</form>");
		out.println("</body></html>");
	}

}