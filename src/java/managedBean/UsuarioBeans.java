/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import Dao.UsuariosDao;
import entidades.Usuarios;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author USUARIO
 */
@ManagedBean
@ViewScoped
public class UsuarioBeans {
    
    private Usuarios usuario;
    private boolean banderaSelect = false;
    
    public UsuarioBeans(){
        this.usuario = new Usuarios();
    
}
    
    public ArrayList<Usuarios> listarUsuarios() {
        ArrayList<Usuarios> milista = new ArrayList<>();
        UsuariosDao dao = new UsuariosDao();
        milista = dao.listarUsuarios();
        return milista;

    }
    
      public String guardarUsuarios() {
        UsuariosDao dao = new UsuariosDao();
        boolean respuesta = dao.guardarUsuarios(usuario);
        if (respuesta) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se guardo correctamente"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se pudo registrar"));
        }
        return "/MantenimientoUsuario";

    }

    public String ActualizarUsuarios() {
        try {
            UsuariosDao mascotadao = new UsuariosDao();
            boolean resp = mascotadao.ActualizarUsuarios(usuario);
            if (resp) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se actualizo correctamente"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se Pudo Actualizar"));

            }
            mascotadao.ActualizarUsuarios(usuario);
        } catch (Exception e) {
            System.out.println("Error::" + e);
        }
        return "/MantenimientoUsuario";
    }
    
        public String limpiar() {
        banderaSelect=false;
        return "/MantenimientoUsuario.xhtml";
    }
        
          public String eliminar(Usuarios data) {
        UsuariosDao usadao = new UsuariosDao();
        boolean respuesta = usadao.eliminarUsuarios(data);
        if (respuesta) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se elimino correctamente"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se pudo eliminar"));
        }

        return "/MantenimientoUsuario.xhtml";
    }

    public void selectBandera() {
        banderaSelect = true;
    }
     public boolean isBanderaSelect() {
        return banderaSelect;
    }

    public void setBanderaSelect(boolean banderaSelect) {
        this.banderaSelect = banderaSelect;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

 
    
    
    
}
