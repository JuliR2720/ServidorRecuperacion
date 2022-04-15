/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.japo.java.libraries;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesPerfiles {

    //Codigos de Perfiles
    public static final int BASIC_CODE = 100;
    public static final int ADMIN_CODE = 800;

    // Nombre de Perfiles 
    public static final String BASIC_NAME = "Usuario";
    public static final String ADMIN_NAME = "Administrador";

    // Info de Perfiles
    public static final String BASIC_INFO = "Perfil para Usuarios";
    public static final String ADMIN_INFO = "Perfil para Administradores";

    // Valores por Defectos (constantes publicas)
    public static final int DEF_ID = 0;
    public static final String DEF_NOMBRE = "Indefinido";
    public static final String DEF_INFO = "Perfil Indefinido";

    // Expresiones Regulares
    public static final String REG_NOMBRE = "\\w{3,30}";
    public static final String REG_INFO = "[\\w áéíóúñÁÉÍÓÚÑçÇ]{3,100}";

    private UtilesPerfiles() {
    }

    public static final boolean validarId(int id) {
        return id >= DEF_ID;
    }

    public static final boolean validarNombre(String nombre) {
        return nombre.matches(REG_NOMBRE);
    }

    public static final boolean validarInfo(String info) {
        return info.matches(REG_INFO);

    }
}
