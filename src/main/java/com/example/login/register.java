package com.example.login;
import jakarta.servlet.annotation.WebServlet;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse ;


@WebServlet("/register")
public class register extends HttpServlet{

    public void doPost(HttpServletRequest req
 , HttpServletResponse res){
        String username=req.getParameter("name");
        String email=req.getParameter("email");
        String password=req.getParameter("password");

        model user = new model();
        user.setName(username);
        user.setEmail(email);
        user.setPassword(password);

        usrDAO dao = new usrDAO();
        Boolean saved = dao.registrationUser(user);

        try{
            if(saved){
                res.getWriter().println("registration successful");
            }else{
                res.getWriter().println("registration failed");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

    
