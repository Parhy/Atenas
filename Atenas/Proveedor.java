import java.util.ArrayList;

/**
 * Los proveedores poseen una lista de vehículos que se pueden importar.
 * Cobra cierta comisión por los vehículos importados.
 * 
 * @author Atenas
 * @version 23/08/2020
 */
public class Proveedor
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Pais pais;
    private String representante;
    private int comision;
    private ArrayList<Vehiculo> vehiculos;

    /**
     * Constructor de objetos de la clase Proveedor.
     * 
     * @param nombre Nombre de la compañía.
     * 
     * @param pais País donde está ubicado.
     * 
     * @param representante Nombre del representante.
     * 
     * @param comision Valor añadido para cada vehículo (Ej: 10 = 10%).
     * 
     * @param vehículos Lista de vehículos que ofrece el proveedor.
     */
    protected Proveedor(String nombre, Pais pais, String representante, int comision, ArrayList<Vehiculo> vehiculos)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.pais = pais;
        this.vehiculos = vehiculos;
        this.representante = representante;
        this.comision = comision;
    }
    
    /**
     * Constructor de objetos de la clase Proveedor
     */
    protected Proveedor()
    {
        // initialise instance variables
        this("", null, "", 0, new ArrayList());
    }

    protected String getNombre()
    {
        return nombre;
    }
    
    protected String getNombrePais()
    {
        return pais.getNombre();
    }
    
    protected ArrayList<Vehiculo> getVehiculos()
    {
        return vehiculos;
    }
    
    protected String getRepresentante()
    {
        return representante;
    }
    
    /**
     * Método para calcular el precio de uno de los vehículos, incluida la comisión.
     * 
     * @param i Índice del vehículo.
     */
    protected int getValorVehiculo(int i)
    {
        int valor = vehiculos.get(i).getValor();
        return valor + Math.round(valor*comision/100);
    }
    
    protected int getComision()
    {
        return comision;
    }
    
    protected void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    protected void setVehiculos(ArrayList<Vehiculo> vehiculos)
    {
        this.vehiculos = vehiculos;
    }
    
    protected void setRepresentante(String representante)
    {
        this.representante = representante;
    }
    
    protected void setComision(int comision)
    {
        this.comision = comision;
    }
    
    protected void setPais(Pais pais)
    {
        this.pais = pais;
    }
    
    /**
     * Método para añadir un vehículo a la lista.
     * 
     * @param vehiculo Vehículo a añadir.
     */
    protected void añadirVehiculo(Vehiculo vehiculo)
    {
        vehiculos.add(vehiculo);
    }
    
    @Override
    public String toString()
    {
        String info = getNombre() + "\n" + getNombrePais() + "\n" + getRepresentante() + "\n" + getComision() + "\n";
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
