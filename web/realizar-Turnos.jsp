<%@include file="pantilla/documento-apertura.jsp"%>
<div class="text-center">  
    <h1>Registro de turno</h1>
    <h3>Datos del turno</h3>
</div>

<div class="centrar text-center">
    <div class="col-md-4">
    </div>
    <div class="col-md-4">
        <form action="ServletsTruno" method="POST">
            <p><select class="select-login text-center" name="dia">
                    <option value="error">Seleccionar Dia</option>
                    <option value="lunes">Lunes</option>
                    <option value="martes" >Martes</option>
                    <option value="miercoles" >Miercoles</option>
                    <option value="jueves" >Jueves</option>
                    <option value="viernes" >Viernes</option>
                </select></p>

            <p class="col-md-4">
            </p>
            <p class="col-md-4">
                <select class="select-login text-center" name="hora">
                    <option value="error">Hora</option>
                    <option value="7" >7</option>
                    <option value="8" >8</option>
                    <option value="9" >9</option>
                    <option value="10" >10</option>
                    <option value="11" >11</option>
                    <option value="12" >12</option>
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
            <p class="col-md-4">
            </p>
            <p><textarea class="input-password text-center" name="diagnostico" placeholder="Escriba el diagnostico del paciente" ></textarea></p>      
            <p><textarea class="input-password text-center" name="tratamiento" placeholder="Excriba el tratamiento que se realizará" ></textarea></p>      
            <p><input class="input-password text-center" type="text" name="costo" placeholder="$" ></p>
            <div>
                <p><input type="submit" class="btn-ingreso" value="Guardar"></p>
            </div>
        </form>
    </div>
</div>

<%@include file="pantilla/documento-cierre.jsp"%>