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
                    <option value="odontopediatria">Odontopediatría</option>
                    <option value="ortodoncia" >Ortodoncia</option>
                    <option value="odontologia preventiva"> Odontología preventiva</option>
                    <option value="patologia bucal"> Patología bucal</option>
                    <option value="cirugíai maxilofacial" >Cirugía maxilofacial</option>
                    <option value="odontologia forense">Odontología forense</option>
                    <option value="rehabilitacion oral">Rehabilitación oral</option>
                </select></p>
            <p><input class="input-password text-center" type="text" name="horarioTrabajo" placeholder="Horario disponibles" ></p>
            <input type="submit" class="btn-ingreso" value="Registrar">
        </form>
    </div>
</div>
<%@include file="pantilla/documento-cierre.jsp" %>