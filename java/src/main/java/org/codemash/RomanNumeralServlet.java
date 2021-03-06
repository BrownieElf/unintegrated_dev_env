package org.codemash;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.nio.charset.Charset;

public class RomanNumeralServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        
    int number = Integer.parseInt((String) req.getParameter("n"));
    String roman = new RomanNumeral().convert(number);
    resp.getOutputStream().write(roman.getBytes(Charset.forName("UTF-8")));
  }
}