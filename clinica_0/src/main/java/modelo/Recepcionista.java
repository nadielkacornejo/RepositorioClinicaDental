
package modelo;

public class Recepcionista {

    private String id_recp;
    private String nombre;
    private String usuario;
    private String contrasenia;

    // constructor
    public Recepcionista() {
    }

    public Recepcionista(String id_recp, String nombre, String usuario, String contrasenia) {
        this.id_recp = id_recp;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    } 
    
    // metodos get and set
    public String getId_recp() {
        return id_recp;
    }
    public void setId_recp(String id_recp) {
        this.id_recp = id_recp;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
