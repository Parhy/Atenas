import java.util.ArrayList;

/**
 * Esta clase es uno de los tipos de operaciones realizables, encargada de almacenar los datos de las importaciones realizadas.
 * 
 * @author Atenas 
 * @version 23/08/2020
 */
class Importacion extends Operacion
{
    private Proveedor proveedor;
    
    /**
     * Constructor de objetos de la clase Importacion
     * 
     * @param transporte Tipo de transporte utilizado en la importación (0 = terrestre, 1 = marítimo, 2 = aéreo).
     * 
     * @param vehiculos Vehículos importados en la operación.
     * 
     * @param completada Indicador del estado de la operación.
     */
    protected Importacion(int transporte, ArrayList<Vehiculo> vehiculos, Proveedor proveedor)
    {
        // inicializar variables
        super(transporte, vehiculos);
        this.proveedor = proveedor;
    }
    
    /**
     * Constructor de objetos de la clase Importacion.
     */
    protected Importacion()
    {
        // inicializar variables
        this(0, new ArrayList(), new Proveedor());
    }
    
    /**
     * Método para asignar el atributo transporte de la operación.
     * 
     * @param  transporte.
     */
    protected void setTransporte(int transporte)
    {
        this.transporte = transporte;
    }
    
    protected Proveedor getProveedor()
    {
        return proveedor;
    }
}
