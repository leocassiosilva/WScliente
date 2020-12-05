/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import wsaula.ConversorService;

/**
 *
 * @author Leocassio
 */
@WebServlet(name = "ClienteConversor", urlPatterns = {"/ClienteConversor"})
public class ClienteConversor extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8000/conversor.wsdl")
    private ConversorService service;

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

        String tipo_conversao = request.getParameter("tipo_conversao");
        String vs = request.getParameter("valor");
        double vd = Double.parseDouble(vs);
        
        double valor_convertido;
        
        String nome; 
        String nome2 = null;
        switch(tipo_conversao) {
            case "1":
               valor_convertido = realToDolar(vd);
               nome = "Real para dolar";
               nome2 = "Dolar";
                break;
            case "2":
               valor_convertido = dolarParaReal(vd);
               nome = "Dolar para real";
               nome2 = "Real";
               break;
            case "3":
               valor_convertido = realParaEuro(vd);
               nome = "Real para Euro";
               nome2 = "Euro";
               break;
            case "4":
               valor_convertido = euroParaReal(vd);
               nome = "Euro para real";
               nome2 = "Real";
               break;
            case "5":
               valor_convertido = realParaLibras(vd);
               nome = "Real para Libras";
               nome2 = "Libras";
                break;
            case "6":
               valor_convertido = librasParaReal(vd);
               nome = "Libras para real";
               nome2 = "Real";
                break;
            default:
                nome = "Não deu!";
               valor_convertido = 0.0;

        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteConversor</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClienteConversor at " + request.getContextPath() + "</h1>");
            out.println("<h3> "+ nome + " : " + vd + " é igual " + valor_convertido + " " + nome2 + "</h3>");
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

    private double realToDolar(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsaula.Conversor port = service.getConversorPort();
        return port.realToDolar(arg0);
    }

    private double realParaLibras(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsaula.Conversor port = service.getConversorPort();
        return port.realParaLibras(arg0);
    }

    private double realParaEuro(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsaula.Conversor port = service.getConversorPort();
        return port.realParaEuro(arg0);
    }

    private double librasParaReal(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsaula.Conversor port = service.getConversorPort();
        return port.librasParaReal(arg0);
    }

    private double euroParaReal(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsaula.Conversor port = service.getConversorPort();
        return port.euroParaReal(arg0);
    }

    private double dolarParaReal(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsaula.Conversor port = service.getConversorPort();
        return port.dolarParaReal(arg0);
    }

}
