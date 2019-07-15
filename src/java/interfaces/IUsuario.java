/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface IUsuario {
    
     public abstract boolean guardarUsuarios(Usuarios usuarios);

    public abstract ArrayList<Usuarios> listarUsuarios();

    public abstract boolean ActualizarUsuarios(Usuarios usuarios);

    public abstract boolean eliminarUsuarios(Usuarios usuarios);
    
}
