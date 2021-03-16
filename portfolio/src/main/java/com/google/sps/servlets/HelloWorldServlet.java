package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
     String[] messages = { "My favorite color is yellow", "Leave The Door Open is my favorite song right now!",
            "I have 2 siblings" };

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            
    String json = convertToJson(messages);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
    
    private String convertToJson(String[] mess) {
    String json = "{";
    json += "\"funfact1\": ";
    json += "\"" + mess[0] + "\"";
    json += ", ";
    json += "\"funfact2\": ";
    json += "\"" + mess[1] + "\"";
    json += ", ";
    json += "\"funfact3\": ";
    json += "\"" + mess[2] + "\"";
    json += "}";
    return json;
  }
}
