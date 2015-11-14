package by.AndrewMedvedev.Pizza.controller;

import by.AndrewMedvedev.Pizza.Command.Command;
import by.AndrewMedvedev.Pizza.Command.CommandFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Andrew on 09.05.2015.
 * Web-Servlet
 */
@WebServlet(name = "MakeController", urlPatterns = {"/done"})
public class MakeController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.requestHandler(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.requestHandler(request, response);
    }

    //custom request handler
    protected void requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = null;
        Command command = CommandFactory.receiveHandler(request);

        if(command != null)
            page = command.execute(request, response);
        if(page == null)
            return;
        request.getRequestDispatcher(page).forward(request, response);
    }
}
