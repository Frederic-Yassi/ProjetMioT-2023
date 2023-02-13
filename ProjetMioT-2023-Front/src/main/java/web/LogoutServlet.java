package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet({"/ProjetMiot/logout", "/logout"})
public class LogoutServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    request.getSession().invalidate();
    request.getRequestDispatcher("login.jsp").forward(request, response);
  }
}
