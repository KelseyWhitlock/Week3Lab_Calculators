/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kelsey
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            int firstNum = Integer.parseInt(request.getParameter("firstnum"));
            int secondNum = Integer.parseInt(request.getParameter("secondnum"));
            request.setAttribute("message", "--");
             switch(request.getParameter("math")){
                 case "+":request.setAttribute("message", firstNum + secondNum);
                         break;
                 case"-":request.setAttribute("message", firstNum - secondNum);
                        break;
                 case"*":request.setAttribute("message", firstNum * secondNum);
                        break;
                 case"%":request.setAttribute("message", firstNum % secondNum);
                        break;
             }  
        }catch(Exception e){
             request.setAttribute("message", "Invalid");
        }
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
