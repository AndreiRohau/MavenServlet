package com.jwd.service.calculatorImpl;

import com.jwd.exception.MyCustomException;
import com.jwd.service.Calculator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.jwd.controller.FrontController.NUMBER_1;
import static com.jwd.controller.FrontController.NUMBER_2;

public class Subtract implements Calculator {

    @Override
    public void calculate(HttpServletRequest req, HttpServletResponse resp) throws MyCustomException {
        try {
            final int number1 = Integer.parseInt(req.getParameter(NUMBER_1));
            final int number2 = Integer.parseInt(req.getParameter(NUMBER_2));
            final StringBuilder sb = new StringBuilder()
                    .append(number1)
                    .append("-")
                    .append(number2)
                    .append("=")
                    .append(number1 - number2);
            req.setAttribute("result", sb);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } catch (Exception e) {
            throw new MyCustomException(e);
        }
    }
}
