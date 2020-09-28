<%@include file="pantilla/documento-apertura.jsp"%>


<div class="login-page">
    <div class="form">
        <form action="carga-Pacientes.jsp" class="login-form" method="POST">
            <p class="title-login">Login</p>
            <p>
                <select class="select-login" name="usuario" >
                    <option>Seleccionar usuario</option>
                    <option>Odontólogo</option>
                    <option>Secretaria</option>
                </select>
            </p>    
            <p><input class="input-password text-center" type="password" placeholder="Password"/></p>
            <p><button class="btn-ingreso">Ingresar</button></p>
        </form>
    </div>
</div>


<%@include file="pantilla/documento-cierre.jsp"%>