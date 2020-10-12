<%@page import="java.util.List"%>
<%@page import="Logica.Odontologo"%>
<%@include file="pantilla/documento-apertura.jsp"%>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<br>
<br>
<br>
<!-- Interfaz para el eliminado o modificado del paciente-->
<div class="text-center">  
    <h1>Elimina el Odontologo</h1>
</div>

<div class="centrar text-center">
    <div>
        <form action="ServletsOdontologo" method="POST">            
            <p><select class="input-password select-login text-center" style=" background-color:black; color:white" name="accion">
                    <option value="eliminar">Digite el dni del odontologo para eliminarlo</option>
                </select></p>
            <p><select class="select-login text-center" name="idOdontologo">
                    <% Clinica ctr = (Clinica) sesionActual.getAttribute("ctr");
                        List<Odontologo> listaOdontologo = ctr.traerOdontologo();

                        for (Odontologo odo : listaOdontologo) {%>       
                    <option value="<%=odo.getId() %>"><%=odo.getNombre()%> <%=odo.getApellido()%> </option>
                    <% }%>
            </select></p>
            <input type="submit" class="btn-ingreso" value="Ejecutar">
        </form>
    </div>
</div>

<%@include file="pantilla/documento-cierre.jsp"%>