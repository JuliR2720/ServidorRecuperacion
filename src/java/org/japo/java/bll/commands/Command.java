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
    public ICommand obtenerComando(String cmdName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(
            ServletConfig config,
            HttpServletRequest resquest,
            HttpServletResponse response) {
        this.config = config;

    }

//    @Override
//    public void process() {
//    }
}
