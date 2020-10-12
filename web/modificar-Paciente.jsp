<%@page import="java.util.List"%>
<%@page import="Logica.Paciente"%>
<%@include file="pantilla/documento-apertura.jsp" %>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<br>
<br>
<br>
<div class="centrar text-center">
    <div>
        <form action="ServletsPaciente" method="POST">
            <p><select class="input-password select-login text-center" style=" background-color:black; color:white"  name="accion">
                <option value="modificar">Modificar datos del paciente</option>
        </select> </p>
            <p><input class="input-password text-center" type="text"  name="nombre" onkeypress="return sololetras(event)" placeholder="Nombre " ></p>
            <p><input class="input-password text-center" type="text" name="apellido" placeholder="Apellido"></p>
            <p>
                <select class="select-login text-center" name="idPaciente" required>
                    <% Clinica ctr = (Clinica) sesionActual.getAttribute("ctr");
                    List<Paciente> listaPaciente = ctr.traerPaciente();
                    for (Paciente pac : listaPaciente) {%> 
                    <option value="<%=pac.getId() %>"><%=pac.getNombre()%> <%=pac.getApellido() %> </option>
                    <%}%>
                </select>
            </p> 
            <p><input class="input-password text-center" type="text" onkeypress="validarDni()" name="direccion" placeholder="Direccion"></p>
            <p><input class="input-password text-center" type="date" name="edad" placeholder="Fecha Nacimiento" ></p>
            <p><select class="select-login text-center" name="sexo">
                    <option>Seleccionar Genero</option>
                    <option value="femenino">Femenino</option>
                    <option value="Masculino" >Masculino</option>
                    <option value="Otro"> Otros</option>
                </select></p>
            <p>Tutor: <input type="radio" name="tutor" value="true">Si<input type="radio" name="tutor" value="false">No</p>
            <p><input class="input-password text-center" type="text" name="contacto" placeholder="Contacto tutor"></p>
            <p>Obra social: <input type="radio" name="obra" value="true">Si<input type="radio" name="obra" value="false">No</p>
            <input type="submit" class="btn-ingreso" value="Guardar">
        </form>
    </div>
</div>
<%@include file="pantilla/documento-cierre.jsp" %>