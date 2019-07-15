/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import entidades.ClienteHasMascota;
import entidades.Mascota;

import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author USUARIOWIN10
 */
public interface IMascotaporcliente {

    public abstract boolean guardarMascotaPorCliente(ClienteHasMascota mascotaporcliente);
    public abstract ArrayList<ClienteHasMascota> listarMascotaPorCliente();
     public abstract boolean ActualizarMascotaPorCliente(ClienteHasMascota mascotaporcliente);
     public abstract boolean eliminarMascotaPorCliente(ClienteHasMascota mascotaporcliente);

    
    
}
