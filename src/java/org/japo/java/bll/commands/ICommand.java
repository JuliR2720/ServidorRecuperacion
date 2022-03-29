/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.japo.java.bll.commands;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public interface ICommand {

    void init(ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response);

    void process();
}
