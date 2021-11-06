<%-- 
    Document   : livro_form
    Created on : 04/11/2021, 09:03:32
    Author     : Mikael
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
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
                        <form action="livro_exec.jsp" method="get">
                            Informe seu nome:<br/>
                            <input type="text" name="nome"/><br/>
                            Informe seu e-mail:<br/>
                            <input type="text" name="email"/><br/>
                            Deixe seu recado:<br/>
                            <textarea name="txt" rows="5" cols="30"></textarea><br/>
                            <input type="submit" name="botao" value="Cadastrar"/>
                        </form>
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
