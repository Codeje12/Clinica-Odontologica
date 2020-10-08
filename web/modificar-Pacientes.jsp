<%@include file="pantilla/documento-apertura.jsp"%>
<!-- Interfaz para el eliminado o modificado del paciente-->
<div class="text-center">  
    <h1>Modificacion del Paciente</h1>
    <h3>Digite el dni del Paciente que quiera modificar o eliminar</h3>
</div>

<div class="centrar text-center">
    <div>
        <form action="ServletsPaciente" method="POST">
            
            
            <p><input type="text" name="dni" placeholder="Digite el dni"> </p>

            <input type="submit" class="btn-ingreso" value="Ejecutar">
        </form>
    </div>
</div>

<%@include file="pantilla/documento-cierre.jsp"%>