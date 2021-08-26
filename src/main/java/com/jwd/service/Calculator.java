package com.jwd.service;

import com.jwd.exception.MyCustomException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Calculator {
    void calculate(HttpServletRequest req, HttpServletResponse resp) throws MyCustomException;
}
