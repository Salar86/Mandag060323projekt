package com.example.mandag060323projekt;

import com.example.mandag060323projekt.Entitet.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletOversigt", value = "/ServletOversigt")
public class ServletOversigt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Person person = (Person) request.getSession().getAttribute("brugere");
        if (person.getRole().equalsIgnoreCase("admin")) {
            request.getRequestDispatcher("/WEB-INF/oversigt.jsp").forward(request, response);
        }
        request.setAttribute("besked", "Du er ikke admin");
        request.getRequestDispatcher("/WEB-INF/minSide.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
