/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.japo.java.libraries;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.japo.java.bll.commands.ICommand;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesComando {

    private UtilesComando() {
    }

    public static void procesar(
            ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response) {

//        // Request > Nombre del Comando
//        String cmdName = request.getParameter("cmd");
//
//        // Nombre Comando > Objeto que lo represente 
//        ICommand cmd = obtenerComando(cmdName);
//
//        // Objeto Comando > Inicializar Comando
//        cmd.init(config, request, response);
//
//        //Ejecutar Proceso Comando
//        cmd.process();

    }

}
