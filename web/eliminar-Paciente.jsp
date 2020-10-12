<%@page import="java.util.List"%>
<%@page import="Logica.Paciente"%>
<%@include file="pantilla/documento-apertura.jsp"%>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<br>
<br>
<br>
<!-- Interfaz para el eliminado o modificado del paciente-->
<div class="text-center">  
    <h1>Modificacion del Paciente</h1>
</div>

<div class="centrar text-center">
    <div>
        <form action="ServletsPaciente" method="POST">            
            <p><select class="input-password select-login text-center" style=" background-color:black; color:white"  name="accion">
                    <option value="eliminar">Digite el dni del paciente para eliminarlo</option>
                </select></p>
            <p><select class="select-login text-center" name="idPaciente">
                    <% Clinica ctr = (Clinica) sesionActual.getAttribute("ctr");
                        List<Paciente> listaPaciente = ctr.traerPaciente();

                        for (Paciente pac : listaPaciente) {%>       
                    <option value="<%=pac.getId() %>"><%=pac.getNombre()%> <%=pac.getApellido()%> </option>
                    <% }%>
            </select></p>
            <input type="submit" class="btn-ingreso" value="Ejecutar">
        </form>
    </div>
</div>

<%@include file="pantilla/documento-cierre.jsp"%>