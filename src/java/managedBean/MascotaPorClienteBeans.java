/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import Dao.ClienteDao;
import Dao.MascotaDao;
import Dao.MascotaporclienteDao;
import entidades.ClienteHasMascota;
import entidades.ClienteHasMascotaId;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author USUARIOWIN10
 */
@ManagedBean
@ViewScoped
public class MascotaPorClienteBeans {
    private ArrayList listaclientes;
    private ArrayList listamascotas;
    
    private int idCliente;
    private int idMascota;
    
    private ClienteHasMascota mascotaporcliente;
    ClienteHasMascotaId mascotaporclienteid;

    public MascotaPorClienteBeans() {
        listaclientes = new ArrayList();
        mascotaporcliente = new ClienteHasMascota();
        mascotaporclienteid = new ClienteHasMascotaId();
     listarCombos();
        
    }
     public void listarCombos(){
         ClienteDao clientedao = new ClienteDao();
         MascotaDao mascotadao = new MascotaDao();
         listaclientes = clientedao.listarCliente();
         listamascotas = mascotadao.listarMascotas();
     }
     
     public String guardar() {
         MascotaporclienteDao dao = new MascotaporclienteDao();
         mascotaporclienteid.setClienteIdCliente(idCliente);
         mascotaporclienteid.setMascotaIdMascota(idMascota);
         mascotaporcliente.setId(mascotaporclienteid);
         dao.guardarMascotaPorCliente(mascotaporcliente);
       return "/RegistroMascotaPorCliente";
    }
    
        public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList getListamascotas() {
        return listamascotas;
    }

    public void setListamascotas(ArrayList listamascotas) {
        this.listamascotas = listamascotas;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public ArrayList getListaclientes() {
        return listaclientes;
    }

    public void setListaclientes(ArrayList listaclientes) {
        this.listaclientes = listaclientes;
    }

    public ClienteHasMascota getMascotaporcliente() {
        return mascotaporcliente;
    }

    public void setMascotaporcliente(ClienteHasMascota mascotaporcliente) {
        this.mascotaporcliente = mascotaporcliente;
    }

    
    
    
}
