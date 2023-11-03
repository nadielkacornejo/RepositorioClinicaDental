
package modelo;

public class Servicios {
    // atributos
    private int id;
    private String codigo, nombre;
    private Double costo;
    
    // constructor
    public Servicios() {
    }

    public Servicios(int id, String codigo, String nombre, Double costo) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
    }
   
    // metodos get and set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
}
