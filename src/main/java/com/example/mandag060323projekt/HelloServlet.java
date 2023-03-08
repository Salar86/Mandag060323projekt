package com.example.mandag060323projekt;

import com.example.mandag060323projekt.Entitet.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Frank", "pizzaz"));
        personList.add(new Person("Eden", "pigboy"));
        personList.add(new Person("Didier", "2012"));
        personList.add(new Person("Emma", "2022"));
        personList.add(new Person("Heidi", "24gul"));
        personList.add(new Person("Alan", "1234", "admin"));

        Map<String, Person> personMap = new HashMap<>();

        for (Person person : personList) {
            personMap.put(person.getName(), person);
            
        }

        getServletContext().setAttribute("personMap", personMap);
        
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        String uName = request.getParameter("uName");
        String passW = request.getParameter("passW");

        System.out.println(uName+" "+passW);
        request.setAttribute("navn", uName);
        if(request.getSession(false) == null || !request.isRequestedSessionIdValid()) {
            System.out.println("vi kender allerede brugeren");
            request.getRequestDispatcher("/WEB-INF/minSide.jsp").forward(request, response);
        }
        if (!personMap.containsKey(uName)) {
            request.setAttribute("besked", "Brugeren findes ikke!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if (!personMap.get(uName).getPassword().equals(passW)) {
            request.setAttribute("besked", "Forkert kodeord!");
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }


        HttpSession session = request.getSession();
        session.setAttribute("brugere", personMap.get(uName));
        request.setAttribute("id", session.getId());
        session.setAttribute("navn", uName);
        session.setAttribute("kode", passW);

        request.getRequestDispatcher("/WEB-INF/minSide.jsp").forward(request, response);

    }

    public void destroy() {
    }
}