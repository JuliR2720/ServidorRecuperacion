package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public class CommandUsuarioRegistro extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida

        String out = "usuario/usuario-registro";

        // Redireccion
        forward(out);

    }

}
