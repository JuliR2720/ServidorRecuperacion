package org.japo.java.dll.usuario;

import javax.servlet.ServletConfig;
import javax.sql.DataSource;
import org.japo.java.entities.Usuario;
import org.japo.java.libraries.UtilesServlets;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public class DLLUsuario {

    // Acceso a la Base de Datos ( Pool de Conexiones )
    DataSource ds;

    public DLLUsuario(ServletConfig config) {
        ds = UtilesServlets.obtenerDataSource(config);
    }

    public final Usuario consultar(String user) {
        // Referencia
        Usuario usuario = null;

        // Busqueda
        //Return
        return usuario;
    }
}
