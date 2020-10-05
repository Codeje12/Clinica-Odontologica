<%@include file="pantilla/documento-apertura.jsp" %>


<div class="text-center">  
    <h1>Registro de turno</h1>
    <h3>Datos del Paciente</h3>
</div>

<div class="centrar text-center">
    <div>
        <form action="ServletsPaciente" method="POST">
            <p><input class="input-password text-center" type="text" name="nombre" placeholder="Nombre " ></p>
            <p><input class="input-password text-center" type="text" name="apellido" placeholder="Apellido"></p>
            <p><input class="input-password text-center" type="text" name="dni" placeholder="Dni"></p>
            
            <p><input class="input-password text-center" type="text" name="direcion" placeholder="Direccion"></p>
            <p><input class="input-password text-center" type="date" name="edad" placeholder="Fecha Nacimiento" ></p>
            <p><select class="select-login text-center" name="sexo">
                    <option>Seleccionar sexo</option>
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