

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        
          <form action="Registrar" method="POST">
            
            
            DNI:<input type="text" name="txtDni"/><br>
            Nombre:<input type="text" name="txtNombre"/><br>
            Apellido:<input type="text" name="txtApellido"/><br>
            Edad:<input type="text" name="txtEdad"/><br>
            <input type="submit" value="Registrar"/>
        </form>
        <h1>ah llegado algo!!!!</h1>
        <h1>Ud ingreso los siguientes datos:</h1>
        <p>DNI: <%=session.getAttribute("txtDni")%> </p>
        <p>NOMBRE: <%=session.getAttribute("txtNombre")%> </p>
        <p>APELLIDO: <%=session.getAttribute("txtApellido")%></p>
        <p>EDAD: <%=session.getAttribute("txtEdad")%> </p>
        
        <br/>
        <p><a href="index.jsp">volver a menu</a></p>
    </body>
</html>
