<%@page import="Logica.Paciente"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Turno"%>
<%@page import="Logica.Usuario"%>
<%@include file="pantilla/documento-apertura.jsp"%>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<br>
<br>
<br>
<div class="conteiner text-center">
    <div >
        <img src="assets/img/bienvenida.png">
    </div>
    <div>
        <div class="col-md-3">
        </div>
        <div class="col-md-6">
            <div class=" tex-center panel panel-default">
                <div class="panel-heading text-center">
                    Registo de Pacientes
                </div>
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover" id="tablaTurnos">
                            <thead>
                                <tr>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>F. Nacimiento</th>
                                    <th>Direccion</th>
                                    <th></th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr>
                                    <%  
                                        Clinica ctr = (Clinica) sesionActual.getAttribute("ctr");
                                        List<Paciente> listaPaciente = ctr.traerPaciente();
                                        for (Paciente pac : listaPaciente) {
                                    %>
                                    <td><%=pac.getNombre() %></td>
                                    <td><%=pac.getApellido() %></td>
                                    <td><%=pac.getEdad() %></td>
                                    <td><%=pac.getDireccion() %></td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="pantilla/documento-cierre.jsp"%>