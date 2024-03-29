package entidades;
// Generated 14/07/2019 08:22:38 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Atencion generated by hbm2java
 */
public class Atencion  implements java.io.Serializable {


     private Integer idAtencion;
     private ClienteHasMascota clienteHasMascota;
     private Personal personal;
     private Date fechaAtencion;
     private String diagnostico;
     private Date horaAtencion;

    public Atencion() {
    }

    public Atencion(ClienteHasMascota clienteHasMascota, Personal personal, Date fechaAtencion, String diagnostico, Date horaAtencion) {
       this.clienteHasMascota = clienteHasMascota;
       this.personal = personal;
       this.fechaAtencion = fechaAtencion;
       this.diagnostico = diagnostico;
       this.horaAtencion = horaAtencion;
    }
   
    public Integer getIdAtencion() {
        return this.idAtencion;
    }
    
    public void setIdAtencion(Integer idAtencion) {
        this.idAtencion = idAtencion;
    }
    public ClienteHasMascota getClienteHasMascota() {
        return this.clienteHasMascota;
    }
    
    public void setClienteHasMascota(ClienteHasMascota clienteHasMascota) {
        this.clienteHasMascota = clienteHasMascota;
    }
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public Date getFechaAtencion() {
        return this.fechaAtencion;
    }
    
    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    public String getDiagnostico() {
        return this.diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public Date getHoraAtencion() {
        return this.horaAtencion;
    }
    
    public void setHoraAtencion(Date horaAtencion) {
        this.horaAtencion = horaAtencion;
    }




}


