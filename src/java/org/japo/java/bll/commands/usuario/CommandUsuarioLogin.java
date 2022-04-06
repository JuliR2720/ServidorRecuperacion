package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;
import org.japo.java.dll.usuario.DLLUsuario;
import org.japo.java.entities.Usuario;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public class CommandUsuarioLogin extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida
        String out = "usuario/usuario-login";

        //Operacion
        String op = request.getParameter("op");

        // Discriminacion de Operacion
        if (op == null) {
            // Lanzar el formulario

        } else if (op.equals("captura")) {
            // Lanzar el formulario

        } else if (op.equals("proceso")) {
            // Procesar Formulario
            
            // Obtener Campos Formulario
            String user = request.getParameter("user");
            
            // Capa de Acceso a Datos
            DLLUsuario dllUsuario = new DLLUsuario();
            
            Usuario usuario = dllUsuario.consultar(user);
//            out = "message/credencial-incorrecta";
            out = "message/credencial-correcta";
        } else {
            // Lanzar el formulario

        }

        // Redireccion
        forward(out);

    }

}
