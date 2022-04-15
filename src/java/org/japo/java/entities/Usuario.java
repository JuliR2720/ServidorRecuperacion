package org.japo.java.entities;

import java.io.Serializable;
import java.util.Objects;
import org.japo.java.libraries.UtilesPerfiles;
import org.japo.java.libraries.UtilesUsuarios;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class Usuario implements Serializable {

    // Campos
    private int id;
    private String user;
    private String pass;
    private String avatar;
    private int perfil;

    // Constructor Predeterminado
    public Usuario() {
        id = UtilesUsuarios.DEF_ID;
        user = UtilesUsuarios.DEF_USER;
        pass = UtilesUsuarios.DEF_PASS;
        avatar = UtilesUsuarios.DEF_AVATAR;
        perfil = UtilesPerfiles.DEF_ID;
    }

    // Constructor Parametrizado
    public Usuario(int id, String user, String pass, String avatar, int perfil) {
        if (validarId()) {
            this.id = id;
        } else {
            this.id = UtilesUsuarios.DEF_ID;
        }
        if (validarUser()) {
            this.user = user;
        } else {
            this.user = UtilesUsuarios.DEF_USER;
        }
        if (validarPass()) {
            this.pass = pass;
        } else {
            this.pass = UtilesUsuarios.DEF_PASS;
        }
        if (validarAvatar()) {
            this.avatar = avatar;
        } else {
            this.avatar = UtilesUsuarios.DEF_AVATAR;
        }
        if (validarPerfil()) {
            this.perfil = perfil;
        } else {
            this.perfil = UtilesPerfiles.DEF_ID;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (validarId()) {
            this.id = id;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        if (validarUser()) {
            this.user = user;
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        if (validarPass()) {
            this.pass = pass;
        }
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        if (validarAvatar()) {
            this.avatar = avatar;
        }
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        if (validarPerfil()) {
            this.perfil = perfil;
        }
    }

    private boolean validarId() {
        return UtilesUsuarios.validarId(id);
    }

    private boolean validarUser() {
        return UtilesUsuarios.validarUser(user);
    }

    private boolean validarPass() {
        return UtilesUsuarios.validarPass(pass);
    }

    private boolean validarAvatar() {
        return UtilesUsuarios.validarAvatar(avatar);
    }

    private boolean validarPerfil() {
        return UtilesPerfiles.validarId(perfil);
    }

    @Override
    public boolean equals(Object o) {
        boolean testOK = false;
        if (o instanceof Usuario) {
            Usuario u = (Usuario) o;
            testOK = id == u.getId()
                    && user.equals(u.getUser())
                    && pass.equals(u.getPass())
                    && avatar.equals(u.getAvatar())
                    && perfil == u.getPerfil();
        }

        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.user);
        hash = 79 * hash + Objects.hashCode(this.pass);
        hash = 79 * hash + Objects.hashCode(this.avatar);
        hash = 79 * hash + this.perfil;
        return hash;
    }

}
