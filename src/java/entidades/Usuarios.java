package entidades;
// Generated 14/07/2019 08:22:38 PM by Hibernate Tools 4.3.1



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private int idUsuario;
     private String nombreUsuario;
     private String passwordUsuario;
     private String emailUsuario;

    public Usuarios() {
    }

    public Usuarios(int idUsuario, String nombreUsuario, String passwordUsuario, String emailUsuario) {
       this.idUsuario = idUsuario;
       this.nombreUsuario = nombreUsuario;
       this.passwordUsuario = passwordUsuario;
       this.emailUsuario = emailUsuario;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPasswordUsuario() {
        return this.passwordUsuario;
    }
    
    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }
    public String getEmailUsuario() {
        return this.emailUsuario;
    }
    
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }




}

