<%@page import="Logica.Paciente"%>
<%@page import="Logica.Odontologo"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Turno"%>
<%@include file="pantilla/documento-apertura.jsp"%>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<div class="text-center">  
    <h1>Registro de turno</h1>
</div>
<div class="centrar text-center">
    <div class="col-md-4">
    </div>
    <div class="col-md-4">
        <form action="ServletsTruno" method="POST">
            <p><select class="input-password select-login text-center" style=" background-color:black; color:white" name="accion">
                    <option value="crear" class="select-login centrar" >Datos del turno</option>
                </select></p>
            <p><label class="label-primary">Seleccionar el dia</label></p>
            <p><select class="select-login text-center" name="dia">
                    <option value="lunes">Lunes</option>
                    <option value="martes" >Martes</option>
                    <option value="miercoles" >Miercoles</option>
                    <option value="jueves" >Jueves</option>
                    <option value="viernes" >Viernes</option>
                </select></p>
            <p class="col-md-4"></p>
            <p class="col-md-4"></p>
            <p><label class="label-primary">Seleccionar Odontologo</label></p>
            <p class="text-center">
                <select class="select-login text-center" name="odontologo">
                    <% Clinica ctr = (Clinica) sesionActual.getAttribute("ctr");
                        List<Odontologo> listaOdontologo = ctr.traerOdontologo();
                        Odontologo o = new Odontologo();
                        
                        for (Odontologo odon : listaOdontologo) { 
                            o.setHorarioInicioTrabajo(odon.getHorarioinicioTrabajo());
                            o.setHorarioFinTrabajo(odon.getHorarioFinTrabajo());
                            
                        %>       
                        <option value="<%=odon.getId()%>"><%=odon.getNombre()%> </option>
                    <% } %>
                </select>
            </p>
            <p><label class="label-primary">Seleccionar Hora</label></p>
            <p><select class="select-login text-center" name="hora">
                <%
                       for(int i=7;i<21;i++){%>
                    <option value="<%=i%>" ><%=i%></option>
                <% } %>
                </select></p>
            <p><label class="label-primary">Seleccionar Paciente</label></p>
            <p class="text-center">
                <select class="select-login text-center" name="paciente">
                    <%
                        List<Paciente> listaPaciente = ctr.traerPaciente();

                        for (Paciente pac : listaPaciente) {%>       
                    <option value="<%=pac.getId()%>"><%=pac.getNombre()%> </option>
                    <% }%>

                </select>
            </p>
            
            <p class="col-md-4">
            </p>
            <p><textarea class="input-password text-center" name="diagnostico" placeholder="Escriba el diagnostico del paciente" ></textarea></p>      
            <p><textarea class="input-password text-center" name="tratamiento" placeholder="Escriba el tratamiento que se realizará" ></textarea></p>      
            <p><input class="input-password text-center" type="text" name="costo" placeholder="$costo" ></p>
            <div>
                <p><input type="submit" class="btn-ingreso" value="Guardar"></p>
            </div>
        </form>
    </div>
</div>

<%@include file="pantilla/documento-cierre.jsp"%>