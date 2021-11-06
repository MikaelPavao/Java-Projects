<%-- 
    Document   : livro_view
    Created on : 04/11/2021, 09:03:59
    Author     : Mikael
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/estilo.css"/>
        <title>Coffee Shop</title>
        
    </head>
    <body>
        <div class="container">
            <div class="header">
                <header class="cabecalho"> 
                    <img src="../img/cafe.jpeg" alt="Coffee Shop" title="Coffee Shop"/>                    
                </header>    
                <nav class="menu">
                    <a href="livro_form.jsp" target="_self">Registrar recados </a>
                    <a href="livro_view.jsp" target="_self">Ver recados</a>
                </nav>
            </div>
            <div class="divCentral">
                <main>
                    <div class="conteudo">
                        <h1>Lista de Recados</h1>
                        <%
                            
                            try{
                                String dir = request.getRealPath("/");
                                String arq = dir + "/txt/arquivo.txt";

                                BufferedReader br = new BufferedReader(new FileReader(arq));
                                String linha = "";
                                while((linha = br.readLine())!= null){
                                    String[] vet = linha.split(" # ");
                                    out.print(vet[2]+"<br/>");
                                    out.print(vet[0] + " | " + vet[1]);
                                    out.print("<br/><br/>");

                                }
                                br.close();
                            }catch(Exception ex){
                                System.out.println("Erro ao processar as mensagens");
                            }
                        %>
                    </div>
                </main>
            </div>
            <div class="footer">
                <footer>
                    <p>By Mikael Pavão</p>
                </footer>
            </div>
        </div>
    </body>
</html>
