package com.jwd.service.commandImpl;

import com.jwd.service.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logination implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        // process logination
        // forward to main page OR redirect to authorization error servlet
    }
}
