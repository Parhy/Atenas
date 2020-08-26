import java.util.ArrayList;

/**
 * Clase encargada de gestionar el historial de importación/ventas realizadas. Permite mostrar información detallada de las operaciones.
 * 
 * @author Atenas
 * @version 23/08/2020
 */
public class Historial
{
    // instanciar variables
    private ArrayList<Operacion> operaciones;

    /**
     * Constructor de objetos de la clase Historial
     */
    protected Historial()
    {
        // initialise instance variables
        operaciones = new ArrayList();
        cargarHistorial();
    }

    /**
     * Añade operaciones al historial.
     * 
     * @param  operacion Nueva operación realizada.
     */
    protected void añadirOperacion(Operacion operacion)
    {
        operaciones.add(operacion);
    }
    
    protected void setOperaciones(ArrayList<Operacion> operaciones)
    {
        this.operaciones = operaciones;
    }
    
    /**
     * Método para obtener las operaciones realizadas.
     * 
     * @return  Las operaciones ya realizadas.
     */
    protected ArrayList<Operacion> getOperaciones(){
        return operaciones;
    }
    
    /**
     * Método para cargar el historial.
     */
    protected void cargarHistorial()
    {
        // put your code here
    }
    
    /**
     * Método para guardar la operación realizada.
     */
    protected void guardarOperacion(Operacion operacion)
    {
        añadirOperacion(operacion);
        //guardar como documento de texto
    }
}
