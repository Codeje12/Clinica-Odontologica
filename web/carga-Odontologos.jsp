<%@include file="pantilla/documento-apertura.jsp" %>

<div class="text-center">  
    <h1>Registro</h1>
    <h3>Datos del Odontologo</h3>
</div>

<div class="centrar text-center">
    <div class="col-md-4">
    </div>
    <div  class="col-md-4">
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
            <p class="col-md-2">
                <label>Desde las:</label>
            </p>
            <p class="col-md-4">
                <select class="select-login text-center" name="horarioInicioTrabajo">
                    <option value="error">Hora</option>
                    <option value="7" >7</option>
                    <option value="8" >8</option>
                    <option value="9" >9</option>
                    <option value="10" >10</option>
                    <option value="11" >11</option>
                    <option value="12" >12</option>
                </select>
            </p>
            <p class="col-md-2">
                <label>Hasta las:</label>
            </p>      
            <p class="col-md-4">
                <select class="select-login text-center" name="horarioFinTrabajo">
                    <option value="error">Hora</option>
                    <option value="13">13</option>
                    <option value="14" >14</option>
                    <option value="15" >15</option>
                    <option value="16" >16</option>
                    <option value="17" >17</option>
                    <option value="18" >18</option>
                    <option value="19" >19</option>
                    <option value="20" >20</option>
                </select>
            </p>

            <p><input class="input-password text-center" type="text" name="costo" placeholder="$precio" ></p>
            <input type="submit" class="btn-ingreso" value="Registrar">
        </form>
    </div>
</div>
<%@include file="pantilla/documento-cierre.jsp" %>