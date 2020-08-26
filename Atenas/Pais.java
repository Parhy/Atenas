
/**
 * Esta clase maneja los tipos de transporte disponibles en cada país.
 * 
 * @author Atenas 
 * @version 23/08/2020
 */
public class Pais
{
    // instance variables - replace the example below with your own
    private String nombre;
    private boolean[] transporte = new boolean[3];

    /**
     * Constructor de la clase Pais.
     * 
     * @param nombre Nombre del país.
     * 
     * @param transporte Tipos de transporte disponibles.
     */
    protected Pais(String nombre, boolean[] transporte)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.transporte = transporte;
    }
    
    /**
     * Constructor de la clase Pais.
     * 
     * @param nombre Nombre del país.
     */
    protected Pais(String nombre)
    {
        // initialise instance variables
        this.nombre = nombre;
    }
    
    /**
     * Método para obtener el nombre del país.
     */
    protected String getNombre()
    {
        // initialise instance variables
        return this.nombre;
    }
    
    /**
     * Método para obtener los tipos de transporte del país.
     */
    protected boolean[] getTransporte()
    {
        // initialise instance variables
        return this.transporte;
    }
    
    protected void setTransporte(boolean b, int i)
    {
        // initialise instance variables
        transporte[i] = b;
    }
    
    @Override
    public String toString()
    {
        String info = nombre + "\n" + transporte[0] + ":" + transporte[1] + ":" + transporte[2];
        return info;
    }
}
