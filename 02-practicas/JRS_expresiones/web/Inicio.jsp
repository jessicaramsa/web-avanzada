<%-- 
    Document   : Inicio
    Created on : 22/03/2020, 10:26:07 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de sesiones y filtros</title>
        <style type="text/css">
            body{
                background: #CEF6F5;
                font-family:Trebuchet MS;
            }
            #aceptar{
                background-color:#088a86;
                -moz-border-radius:20px;
                -webkit-border-radius:20px;
                border-radius:28px;
                border:1px solid #088a86;
                display:inline-block;
                cursor:pointer;
                color:#ffffff;
                font-family:Trebuchet MS;
                font-size:14px;
                padding:10px 20px;
                text-decoration:none;
                text-shadow:0px 1px 0px #088a86;
            }
            #contenedor{
                padding: 0.5em;
                position: right;
                position:relative;
                left: 20em;
                padding:1em;
                width: 35%; height: 220px;
                border: 4px solid #088A85;
                margin-top: 5em;
                background: white;
                border-radius: 10px;
                box-shadow: 5px 5px 5px 10px white;
            }
            #principal{
                padding: 0.5em;
                position: right;
                position:relative;
                left: 20em;
                padding:1em;
                width: 40%; height: 220px;
                border: 4px solid #088A85;
                margin-top: 5em;
                background: white;
                border-radius: 10px;
                box-shadow: 5px 5px 5px 10px white;
            }
            #der{
                float: right;
                width: 50%;
            }
            #izq{
                float:left;
                width: 50%;
            }
        </style>
    </head>
    <body>
        <div id="principal">
            <h2>Ingresa tus datos</h2>
            <div id="der">
                <form action="Principal.jsp" method="get">
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre"/><br><br>
                    <label for="edad">Edad:</label>
                    <input type="text" id="edad" name="edad"/>
                    <br><br><br><br>
                    <input type="submit" value="Aceptar" id="aceptar"/>
                </form>
            </div>
            <div id="izq">
                <img src="imgs/logo.jpg" width="60%">
            </div>
        </div>
    </body>
</html>
