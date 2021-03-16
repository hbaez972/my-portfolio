package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
     String[] messages = { "My favorite color is yellow ", "'Leave The Door Open' is my favorite song right now! ",
            "I have 2 siblings" };

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            
    String json = convertToJsonUsingGson(messages);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

    private String convertToJsonUsingGson(String[] messages) {
    Gson gson = new Gson();
    String json = gson.toJson(messages);
    return json;
  }
  
}
