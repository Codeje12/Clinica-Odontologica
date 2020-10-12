<%@include file="pantilla/documento-apertura.jsp" %>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<br>
<div class="text-center">  
    <h1>Modificar Odontologo</h1>
</div>

<div class="centrar text-center">
    <div class="col-md-4">
    </div>
    <div  class="col-md-4">
        <form action="ServletsOdontologo" method="POST">
            <select class="input-password select-login text-center" style=" background-color:black; color:white" name="accion">
                <option value="modificar">Modificar datos del Odontologo</option>
            </select>
            <p><input class="input-password text-center" type="text" name="nombre" placeholder="Nombre " required></p>
            <p><input class="input-password text-center" type="text" name="apellido" placeholder="Apellido" required></p>
            <p><input class="input-password text-center" type="text" name="dni" value="" placeholder="Dni" required></p>
            <p><input class="input-password text-center" type="date" name="edad"></p>
            <p class="col-md-2">
                <label>Desde las:</label>
            </p>
            <p class="col-md-4">
                <select class="select-login text-center" name="horarioInicioTrabajo" required >
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
                <select class="select-login text-center" name="horarioFinTrabajo" required>
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
            <input type="submit" class="btn-ingreso" value="Registrar">
        </form>
    </div>
</div>
<%@include file="pantilla/documento-cierre.jsp" %>