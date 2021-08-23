package com.jwd.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class FrontController extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(FrontController.class.getName());
    public static final String COMMAND = "command", SUM = "sum", NUMBER_1 = "number-1", NUMBER_2 = "number-2";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String commandTitle = req.getParameter(COMMAND).trim();
        LOGGER.info("CommandTitle=" + commandTitle);

        if (SUM.equals(commandTitle)) {
            sum(req);
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    private void sum(HttpServletRequest req) {
        final int number1 = Integer.parseInt(req.getParameter(NUMBER_1));
        final int number2 = Integer.parseInt(req.getParameter(NUMBER_2));
        final StringBuilder sb = new StringBuilder()
                .append(number1)
                .append("+")
                .append(number2)
                .append("=")
                .append(number1 + number2);
        req.setAttribute("result", sb);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String command = req.getParameter("command");
        final String message = req.getParameter("message");
        LOGGER.info("Received post method got : " + command);
        LOGGER.info("Received post method got : " + message);
        req.setAttribute("result", "Received is [" + command + ", " + message + "]");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
