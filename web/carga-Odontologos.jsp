<%@include file="pantilla/documento-apertura.jsp" %>

<div class="text-center">  
    <h1>Registro</h1>
    <h3>Datos del Odontologo</h3>
</div>

<div class="centrar text-center">
    <div>
        <form action="ServletsOdontologo" method="POST">
            <p><input class="input-password text-center" type="text" name="nombre" placeholder="Nombre " ></p>
            <p><input class="input-password text-center" type="text" name="apellido" placeholder="Apellido"></p>
            <p><input class="input-password text-center" type="text" name="dni" placeholder="Dni"></p>
            <p><input class="input-password text-center" type="date" name="edad"></p>
            <p><select class="select-login text-center" name="especialidad">
                    <option value="error">*Seleccionar especialidad*</option>
                    <option value="odontopediatria">Odontopediatr�a</option>
                    <option value="ortodoncia" >Ortodoncia</option>
                    <option value="odontologia preventiva"> Odontolog�a preventiva</option>
                    <option value="patologia bucal"> Patolog�a bucal</option>
                    <option value="cirug�ai maxilofacial" >Cirug�a maxilofacial</option>
                    <option value="odontologia forense">Odontolog�a forense</option>
                    <option value="rehabilitacion oral">Rehabilitaci�n oral</option>
                </select></p>
            <p><input class="input-password text-center" type="text" name="horarioTrabajo" placeholder="Horario disponibles" ></p>
            <input type="submit" class="btn-ingreso" value="Registrar">
        </form>
    </div>
</div>
<%@include file="pantilla/documento-cierre.jsp" %>