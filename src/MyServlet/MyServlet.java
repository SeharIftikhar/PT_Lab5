package MyServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");

        String UserEmail =request.getParameter("UserEmail");
        String UserPass =request.getParameter("UserPass");
        String UserCity =request.getParameter("UserCity");
        String UserProvince =request.getParameter("UserProvince");
        String UserZip =request.getParameter("UserZip");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
