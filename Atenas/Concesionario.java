
/**
 * Esta clase se encarga de almacenar la información de los concesionarios.
 * 
 * @author Atenas 
 * @version 23/08/2020
 */
public class Concesionario
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String ciudad;
    private String direccion;
    private String marca;

    /**
     * Constructor de la clase Concesionario.
     * 
     * @param nombre Nombre del concesionario.
     * 
     * @param ciudad Sede del concesionario.
     * 
     * @param dirección Dirección del concesionario.
     * 
     * @param marca Marca de vehículo a solicitar (Si está vacío, entonces puede pedir de cualquier marca).
     */
    protected Concesionario(String nombre, String ciudad, String direccion, String marca)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.marca = marca;
    }
    
    /**
     * Constructor de la clase Concesionario
     */
    protected Concesionario()
    {
        // initialise instance variables
        this("", "", "", "");
    }

    protected String getNombre()
    {
        return nombre;
    }
    
    protected String getCiudad()
    {
        return ciudad;
    }
    
    protected String getDireccion()
    {
        return direccion;
    }
    
    protected String getMarca()
    {
        return marca;
    }
    
    protected void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    protected void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }
    
    protected void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    
    protected void setMarca(String marca)
    {
        this.marca = marca;
    }
}
