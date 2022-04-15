package org.japo.java.libraries;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesServlets {

    private UtilesServlets() {
    }

    public static DataSource obtenerDataSource(ServletConfig config) {

        // dataSource
        DataSource ds;
        try {
            // Contexto Inicial Nombres JNDI
            Context iniCtx = new InitialContext();

            // Situar Contexto Inicial 
            Context envCtx = (Context) iniCtx.lookup("java:/comp/env");

            // Contexto Inicial > DataSource 
            ds = (DataSource) envCtx.lookup("jdbc/" + obtenerNombreBD(config));

            //
        } catch (NamingException ex) {
            ds = null;
        }

        return ds;
    }

    private static Object obtenerNombreBD(ServletConfig config) {
        // Parametros de Contexto ( web.xml )
        String paramName = "base-datos";

        // Servlet Config 
        ServletContext context = config.getServletContext();

        // Retorno: Nombre Base de Datos
        return context.getInitParameter(paramName);

    }
}
