<%-- 
    Document   : livro_exec
    Created on : 04/11/2021, 09:03:15
    Author     : Mikael
--%>

<%@page import="java.io.*"%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%
    try{
    if (request.getParameter("botao") != null) {
        //pega o texto dos parâmetros que vem da pagina livro_form
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String txt = request.getParameter("txt");

        String linha = nome + " # " + email + " # " + txt;
        String dir = request.getRealPath("/");
        String arq = dir + "/txt/arquivo.txt";

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(arq, true)));
        pw.println(linha);        
        pw.close();

    }
    }catch(Exception ex){
        System.out.println("Erro na incerção dos dados " + ex);
    }
    response.sendRedirect("livro_view.jsp");
%>