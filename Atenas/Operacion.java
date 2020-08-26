import java.util.ArrayList;

/**
 * Clase abstracta Operacion - Esta clase permite tratar las importaciones y ventas como las operaciones a realizar; además de facilitar la visualización en el historial.
 * 
 * @author Atenas 
 * @version 23/08/2020
 */

abstract class Operacion
{
    // instanciar variables
    protected ArrayList<Vehiculo> vehiculos;
    protected int transporte; //(0 = terrestre), (1 = marítimo), (2 = aéreo)
    
    /**
     * Constructor de la clase abstracta Operacion.
     * 
     * @param transporte Tipo de transporte utilizado en la operación.
     * 
     * @param vehículos Lista de vehículos importados o a vender.
     */
    public Operacion(int transporte, ArrayList<Vehiculo> vehiculos)
    {
        // inicializar variables
        this.vehiculos = vehiculos;
        this.transporte = transporte;
    }
    
    /**
     * Constructor de la clase abstracta Operacion.
     * 
     */
    public Operacion()
    {
        // inicializar variables
    }
    
    /**
     * Método para obtener la lista de vehículos importados/vendidos en la operación.
     * 
     * @return  Lista de los vehículos.
     */
    public ArrayList<Vehiculo> getVehiculos()
    {
        return vehiculos;
    }
    
    /**
     * Método para asignar el atributo vehiculos de la operación.
     * 
     * @param  vehiculos.
     */
    public void setVehiculos(ArrayList<Vehiculo> vehiculos)
    {
        this.vehiculos = vehiculos;
    }
    
    /**
     * Método para obtener el tipo de transporte usado.
     * 
     * @return  Tipo de transporte (0 = terrestre), (1 = marítimo), (2 = aéreo).
     */
    public int getTransporte()
    {
        return transporte;
    }
    
    /**
     * Método para calcular el dinero recibido por la oferta o a pagar para importar los vehículos.
     * 
     * @return Dinero.
     */
    protected int calcularValorVehiculos()
    {
        int costo = 0;
        for(Vehiculo vehiculo : vehiculos)
        {
            costo = costo + vehiculo.getValor();
        }
        return costo;
    }
    
    @Override
    public String toString()
    {
        String info = getTransporte() + "\n";
        for(Vehiculo vehiculo : vehiculos)
        {
            info = info + vehiculo.getMarcaModelo() + ":" + vehiculo.getValor();
            if(vehiculos.indexOf(vehiculo) != vehiculos.size() - 1)
            {
                info = info + ";";
            }
        }
        return info;
    }
}
