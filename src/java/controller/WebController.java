  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Subject;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.SubjectFacade;
//import session.PersonFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "WebController", urlPatterns = {
    "/showAddSubject", 
    "/createSubject",
    "/listSubjects",

})
public class WebController extends HttpServlet {
@EJB private SubjectFacade subjectFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        switch (path) {
            case "/showAddSubject":
                request.getRequestDispatcher("/showAddSubject.jsp")
                        .forward(request, response);
                break;
            case "/createSubject":
                String name = request.getParameter("name");
                String teacher = request.getParameter("teacher");
                Subject subject = new Subject(name, teacher);
                subjectFacade.create(subject);
            case "/listSubjects":
                List<Subject> listSubjects = subjectFacade.findAll();
                request.setAttribute("listSubjects", listSubjects);
                request.getRequestDispatcher("/listSubject.jsp")
                        .forward(request, response);
                   
             

//            case "/showNewPerson":
//                request.getRequestDispatcher("/showNewPerson.jsp")
//                        .forward(request, response);
 //               break;
//            case "/newPerson":
//                String firstname = request.getParameter("firstname");
//                String lastname = request.getParameter("lastname");
//                String status = request.getParameter("status");
 //               Person person = new Person(firstname,lastname,status);
//                request.setAttribute("info", "Пользователь "
//                        +person.getFirstname()+" "+person.getLastname()
//                        +" зарегистрирован."
//                );
//                personFacade.create(person);
//                request.getRequestDispatcher("/index.jsp")
//                        .forward(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}