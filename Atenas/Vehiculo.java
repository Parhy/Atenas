
/**
 * Esta clase almacena información de los vehículos.
 * 
 * @author Atenas
 * @version 23/08/2020
 */
public class Vehiculo
{
    // instanciar variables
    private int valor;
    private String marca;
    private String modelo;
    private String img;
    
    /**
     * Constructor de la clase Vehiculo.
     * 
     * @param valor Valor del vehículo.
     * 
     * @param marca Marca del vehículo.
     * 
     * @param modelo Modelo del vehículo.
     */
    protected Vehiculo(String marca, String modelo, int valor)
    {
        // inicializar variables
        this(marca, modelo, valor, "");
    }
    
    /**
     * Constructor de la clase Vehiculo.
     * 
     * @param marca Marca del vehículo.
     * 
     * @param modelo Modelo del vehículo.
     */
    protected Vehiculo(String marca, String modelo)
    {
        // inicializar variables
        this(marca, modelo, 0);
    }
    
    /**
     * Constructor de la clase Vehiculo.
     * 
     * @param valor Valor del vehículo.
     * 
     * @param marca Marca del vehículo.
     * 
     * @param modelo Modelo del vehículo.
     * 
     * @param modelo Directorio de la imagen de referencia del vehículo.
     */
    protected Vehiculo(String marca, String modelo, int valor, String img)
    {
        // inicializar variables
        this.valor = valor;
        this.marca = marca;
        this.modelo = modelo;
        this.img = img;
    }
    
    /**
     * Método para obtener el precio del vehículo.
     * 
     * @return Valor del vehículo.
     */
    protected int getValor(){
        return valor;
    }
    
    /**
     * Método para obtener la marca del vehículo.
     * 
     * @return Marca del vehículo.
     */
    protected String getMarca(){
        return marca;
    }
    
    /**
     * Método para obtener el directorio de la imagen del vehículo.
     * 
     * @return Marca del vehículo.
     */
    protected String getImg(){
        return img;
    }
    
    /**
     * Método para obtener la marca y modelo del vehículo.
     * 
     * @return Marca y modelo del vehículo.
     */
    protected String getMarcaModelo(){
        return marca + ":" + modelo;
    }
    
    /**
     * Método para cambiar el precio del vehículo.
     * 
     * @param valor Nuevo valor del vehículo.
     */
    protected void setValor(int valor){
        this.valor = valor;
    }
    
    @Override
    public String toString()
    {
        String info = getMarcaModelo() + "\n" + getValor() + "\n" + getImg();
        return info;
    }
}
