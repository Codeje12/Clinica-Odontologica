<%@include file="pantilla/documento-apertura.jsp"%>


<div class="login-page">
    <div class="form">
        <form action="servletsLogin" class="login-form" method="POST">
            <p class="title-login">Login</p>
            <p>
                <select class="select-login" name="usuario" >
                    <option value="">Seleccionar usuario</option>
                    <option value="Odontologo">Odontólogo</option>
                    <option value="Secretaria">Secretaria</option>
                </select>
            </p>    
            <p><input name="password" class="input-password text-center" type="password" placeholder="Password"/></p>
            <p><input type="submit" class="btn-ingreso" value="Ingresar"></p>
        </form>
    </div>
</div>


<%@include file="pantilla/documento-cierre.jsp"%>