<%@page import="Logica.Turno"%>
<%@page import="java.util.List"%>
<%@include file="pantilla/documento-apertura.jsp"%>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<br>
<br>
<br>
<!-- Interfaz para el eliminado o modificado del paciente-->
<div class="text-center">  
    <h1>Elimina Turno</h1>
    <h3>Digite el dni del Paciente para eliminarlo</h3>
</div>

<div class="centrar text-center">
    <div>
        <form action="ServletsTruno" method="POST">            
            <p><select class="select-login text-center" name="accion">
                    <option value="eliminar">Eliminar</option>
                </select></p>
            <p><select class="select-login text-center" name="turnos">
                    <% Clinica ctr = (Clinica) sesionActual.getAttribute("ctr");
                        List<Turno> listaTurno = ctr.traerTurnos();

                        for (Turno tur : listaTurno) {%>       
                    <option value="<%=tur.getPacient().getId()%>"><%=tur.getPacient().getNombre()%> </option>
                    <% }%>
            </select></p>
            <input type="submit" class="btn-ingreso" value="Ejecutar">
        </form>
    </div>
</div>

<%@include file="pantilla/documento-cierre.jsp"%>