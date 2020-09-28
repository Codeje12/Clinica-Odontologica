<%@include file="pantilla/documento-apertura.jsp" %>


<div class="centrar">  
    <h1>Registro del Paciente</h1>
    <h2>Datos del Paciente</h2>
</div>

<div class="centrar">
    <div class="form-paciente">
        <form action="ServletsPaciente" method="POST">
            <p><input class="input-generales" type="text" name="nombre" placeholder="Nombre " ></p>
            <p><input class="input-generales" type="text" name="apellido" placeholder="Apellido"></p>
            <p><input class="input-generales" type="text" name="dni" placeholder="Dni"></p>
            <p><input class="input-generales" type="text" name="contacto" placeholder="Contacto"></p>
            <p><input class="input-generales" type="text" name="direcion" placeholder="Direccion"></p>
            <p><input class="input-generales" type="date" name="edad" placeholder="Fecha Nacimiento" ></p>
            <p><select name="sexo">
                    <option>Seleccionar sexo</option>
                    <option value="femenino">Femenino</option>
                    <option value="Masculino" >Masculino</option>
                    <option value="Otro"> Otros</option>
                </select></p>
            <p>Obra social: <input type="radio" name="obra" value="true">Si<input type="radio" name="obra" value="false">No</p>
            <p>Tutor: <input type="radio" name="tutor" value="true">Si<input type="radio" name="tutor" value="false">No</p>


            <input type="submit" value="Guardar">
        </form>
    </div>
</div>


<%@include file="pantilla/documento-cierre.jsp" %>