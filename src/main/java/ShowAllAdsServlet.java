import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/students")
public class ShowAllAdsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Ad> ads = DaoFactory.getAdsDao().findAll();

        String html ="";

        for (Ad a: ads) {
            System.out.println("a.getId() = " + a.getId());
            System.out.println("a.getTitle() = " + a.getTitle());
            html += "<h2>" + a.getId() + "</h2>";
            html += "<h2>" + a.getTitle() + "</h2>";
            html += "<h2>" + a.getDescription() + "</h2>";
        }

        response.getWriter().println(html);
    }
}
