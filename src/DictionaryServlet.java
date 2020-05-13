import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", urlPatterns = "/dictionary")
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        Map<String, String> dict = new HashMap<>();
        dict.put("cat", "Con meo");
        dict.put("dog", "Con cho");
        dict.put("pig", "Con lon");
        dict.put("tiger", "Con ho");
        dict.put("lion", "Con su tu");
        dict.put("bird", "Con chim");

        String input = request.getParameter("inputString");
        String output = dict.get(input);
        printWriter.println("<html>");
        if (output == null) {
            printWriter.println("NotFount");
        } else {
            printWriter.println("Input :" + input);
            printWriter.println("Output :" + output);
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
