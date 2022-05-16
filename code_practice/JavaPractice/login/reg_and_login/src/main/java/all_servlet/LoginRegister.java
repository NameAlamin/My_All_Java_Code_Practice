package all_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginRegister extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerDAO cd = new CustomerDAOInmpl();
        String userName = request.getParameter("username");
        String password = request.getParameter("password1");
        String submitType = request.getParameter("submit");
        Customer c = cd.getCustomer(userName,password);
        if(submitType.equals("login") && c != null && c.getName() != null){
            request.setAttribute("message",c.getName());
            request.getRequestDispatcher("/welcome.jsp").forward(request,response);
        }
        else if(submitType.equals("register")){
            c.setName(request.getParameter("name"));
            c.setPassword(password);
            c.setUsername(userName);
            cd.insertCustomer(c);
            request.setAttribute("successMessage","Registration done, please login now");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        else {
            request.setAttribute("message","Data not found, click on register button");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }



//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/login.jsp").forward(req,resp);
//        req.getRequestDispatcher("/regestration.jsp").forward(req,resp);
//    }
}
