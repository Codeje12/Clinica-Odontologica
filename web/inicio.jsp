<%@include file="pantilla/documento-apertura.jsp"%>
<jsp:include page="pantilla/barra-top.jsp" /> 
<jsp:include page="pantilla/barra-lado.jsp" /> 
<br>
<br>
<br>
<br>
<div class="conteiner text-center">
    <div >
        <img src="assets/img/bienvenida.png">
    </div>
    <div>
        <jsp:include page="pantilla/tablas-Turnos.jsp" /> 
    </div>
</div>
<%@include file="pantilla/documento-cierre.jsp"%>