
package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hung")
public class StudentController extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("hung");
        System.out.println("nguyenngochung");
        System.out.println("nguyenvana");
    }
}
