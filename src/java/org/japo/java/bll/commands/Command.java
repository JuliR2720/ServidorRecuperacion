/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.japo.java.bll.commands;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public abstract class Command implements ICommand {

    protected ServletConfig config;
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    @Override
    public void init(
            ServletConfig config,
            HttpServletRequest resquest,
            HttpServletResponse response) {
        this.config = config;
        this.request = resquest;
        this.response = response;

    }

    protected void forward(String out) {
        if (out.startsWith("controller")) {
            //Redireccion de Comando
        } else {
            // Redireccion de Vista
        }
    }

}
