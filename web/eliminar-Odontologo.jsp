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
            <p><input class="input-password text-center" name="dni" placeholder="Digite el dni"></p>
            <input type="submit" class="btn-ingreso" value="Ejecutar">
        </form>
    </div>
</div>

<%@include file="pantilla/documento-cierre.jsp"%>