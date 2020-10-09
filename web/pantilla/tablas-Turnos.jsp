<div class="col-md-3">
</div>
<div class="col-md-6">
    <div class=" tex-center panel panel-default">
        <div class="panel-heading text-center">
            Tablas de especialidades
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" name="tablita" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID Usuario</th>
                            <th>Usuario</th>
                            <th>Contraseña</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                            <%
                                Controladora control = (Controladora) misession.getAttribute("control");
                                List<Usuario> listaUsuario = control.getListaUsuarios();
                                for (Usuario usua : listaUsuario) {
                            %>
                            <td><%=usua.getId_usuario()%></td>
                            <td><%=usua.getUser()%></td>
                            <td><%=usua.getContrasenia()%></td>

                        </tr>

                        <% }%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>