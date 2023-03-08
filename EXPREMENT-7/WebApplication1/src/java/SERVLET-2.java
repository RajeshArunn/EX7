/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author test03
 */
@WebServlet(urlPatterns = {"/asd"})
public class asd extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String a=request.getParameter("option");
        String s = null;
        String name  = null;
        if(null != a)
        switch (a) {
            case "a":
                name="Robert John Downey Jr";
                s="Robert John Downey Jr. (born April 4, 1965) is an American actor and producer. His career has been characterized by critical and popular success in his youth, followed by a period of substance abuse and legal troubles, before a resurgence of commercial success later in his career. In 2008, Downey was named by Time magazine among the 100 most influential people in the world and from 2013 to 2015, he was listed by Forbes as Hollywood's highest-paid actor.";
                break;
            case "b":
                name="Christopher Hemsworth";
                s="Christopher Hemsworth[1] AM (born 11 August 1983[2]) is an Australian actor. He rose to prominence playing Kim Hyde in the Australian television series Home and Away (2004–2007) before beginning a film career in Hollywood. In the Marvel Cinematic Universe (MCU), Hemsworth started playing Thor with the 2011 film of the same name and most recently reprised the role in Thor: Love and Thunder (2022), which established him among the world's highest-paid actors";
                break;
            case "c":
                name="Christopher Robert Evans";
                s="Christopher Robert Evans (born June 13, 1981) is an American actor. He began his career with roles in television series such as Opposite Sex in 2000. Following appearances in several teen films, including 2001's Not Another Teen Movie, he gained attention for his portrayal of Marvel Comics character the Human Torch in Fantastic Four (2005) and Fantastic Four: Rise of the Silver Surfer (2007). Evans made further appearances in film adaptations of comic books and graphic novels: TMNT (2007), Scott Pilgrim vs. the World (2010), and Snowpiercer (2013)";
                break;
            case "d":
                name="Scarlett Ingrid Johansson";
                s="Scarlett Ingrid Johansson (/dʒoʊˈhænsən/; born November 22, 1984) is an American actress. The world's highest-paid actress in 2018 and 2019, she has featured multiple times on the Forbes Celebrity 100 list. Time magazine named her one of the 100 most influential people in the world in 2021. Her films have grossed over $14.3 billion worldwide, making Johansson the highest-grossing box office star of all time. She has received various accolades, including a Tony Award and a British Academy Film Award, in addition to nominations for two Academy Awards and five Golden Globe Awards";
                break;
            default:
                break;
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet asd</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + name + "</h1>");
            out.println("<p>" + s + "</p>");
            out.println("</body>");
            out.println("</html>");
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
