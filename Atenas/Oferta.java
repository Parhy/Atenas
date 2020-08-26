import java.util.ArrayList;

/**
 * Esta clase es uno de los tipos de operaciones realizables; encargada de almacenar los datos de las ofertas realizadas por los concesionarios..
 * 
 * @author Atenas
 * @version 23/08/2020
 */
public class Oferta extends Operacion
{
    // instanciar variables
    private Concesionario concesionario;

    /**
     * Constructor de objetos de la clase Oferta.
     * 
     * @param vehiculos Vehículos solicitados por el concesionario.
     * 
     * @param concesionario Concesionario que pide la oferta.
     */
    protected Oferta(ArrayList<Vehiculo> vehiculos, Concesionario concesionario)
    {
        // inicializar variables
        super(0, vehiculos);
        this.concesionario = concesionario;
    }
    
    /**
     * Constructor de objetos de la clase Oferta.
     */
    protected Oferta()
    {
        // inicializar variables
        this(new ArrayList(), new Concesionario());
    }
    
    protected Concesionario getConcesionario()
    {
        return concesionario;
    }
    
    @Override
    public String toString()
    {
        String info = super.toString() + concesionario.getNombre() + "\n";
        return info;
    }
}
