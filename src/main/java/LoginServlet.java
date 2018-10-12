import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String user = request.getParameter("username");
        String password = request.getParameter("password");

        if (user != null && password != null) {

            if (user.equals("admin") && password.equals("password"))
                response.sendRedirect("/profile.jsp");
        }
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
