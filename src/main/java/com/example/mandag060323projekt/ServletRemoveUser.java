package com.example.mandag060323projekt;

import com.example.mandag060323projekt.Entitet.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "ServletRemoveUser", value = "/ServletRemoveUser")
public class ServletRemoveUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String valg = request.getParameter("valg");
        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");
        personMap.remove(valg);
        request.getRequestDispatcher("/WEB-INF/oversigt.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
