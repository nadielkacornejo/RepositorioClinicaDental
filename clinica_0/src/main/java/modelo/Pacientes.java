
package modelo;

public class Pacientes {
    // atributos
    private int id;
    private String dni;
    private String nombre, apellidop,apellidom;
    private String genero, email;
    private String telefono;
    private String ocupacion, direccion;
    
    // constructor
    public Pacientes() {
    }

    public Pacientes(int id, String dni, String nombre, String apellidop, String apellidom, String genero, String email, String telefono, String ocupacion, String direccion) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
    }


    
    // metodos get and set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidop() {
        return apellidop;
    }
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }
    public String getApellidom() {
        return apellidom;
    }
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getOcupacion() {
        return ocupacion;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
}
