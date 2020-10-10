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
                    Turnos
                </div>
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover" id="tablaTurnos">
                            <thead>
                                <tr>
                                    <th>Dia</th>
                                    <th>Hora</th>
                                    <th>Diagnostico</th>
                                    <th>Tratamiento</th>
                                    <th>Odontologo</th>
                                    <th>Paciente</th>
                                    <th></th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr>
                                    <%  Clinica ctr = (Clinica) sesionActual.getAttribute("ctr");
                                        List<Turno> listaTurno = ctr.traerTurnos();
                                        for (Turno tur : listaTurno) {
                                    %>
                                    <td><%=tur.getDia()%></td>
                                    <td><%=tur.getHora()%></td>
                                    <td><%=tur.getDiagnostico()%></td>
                                    <td><%=tur.getTratamiento()%></td>
                                    <td><%=tur.getOdontologo().getNombre()%></td>
                                    <td><%=tur.getPacient().getNombre()%></td>
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