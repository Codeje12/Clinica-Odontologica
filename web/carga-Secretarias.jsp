<%@include file="pantilla/documento-apertura.jsp" %>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<div class="text-center">  
    <h1>Registro Empleados</h1>
    <h3>Datos de la secretaria</h3>
</div>

<div class="centrar text-center">
    <div>
        <form action="ServletsPaciente" method="POST">
            <select name="accion">
                <option value="crear" class="select-login centrar" >Agregar</option>
            </select>
            <p><input class="input-password text-center" type="text"  name="nombre" onkeypress="return sololetras(event)" placeholder="Nombre " ></p>
            <p><input class="input-password text-center" type="text" name="apellido" placeholder="Apellido"></p>
            <p><input class="input-password text-center" type="text" name="dni" placeholder="Dni" required></p> 
            <p>Turno de trabajo: <input type="radio" name="horario" value="mañana">mañana<input type="radio" name="horario" value="tarde">tarde</p>
            <input type="submit" class="btn-ingreso" value="Guardar">
        </form>
    </div>
</div>


<%@include file="pantilla/documento-cierre.jsp" %>