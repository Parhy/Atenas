import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal de la aplicación. Encargada de llevar a cabo los procesos solicitados por los usuarios.
 * 
 * @author Atenas
 * @version 23/08/2020
 */
public class Main
{
    // instance variables - replace the example below with your own
    private Historial historial;
    private ArrayList<Oferta> ofertas;
    private ArrayList<Concesionario> concesionarios;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Vehiculo> vehiculos;
    private int comision = 10;
    private int dinero;
    
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        ofertas = new ArrayList();
        concesionarios = new ArrayList();
        proveedores = new ArrayList();
        historial = new Historial();
        vehiculos = new ArrayList();
        dinero = 2000000000;
    }
    
    /**
     * Método para ejecutar la aplicación por medio de la consola.
     */
    public void ejecutarConsola()
    {
        cargarDemo();
        int opMenu = 0;
        do{
            opMenu = 0;
            System.out.println("Bienvenido a Atenas");
            System.out.println("Saldo: " + dinero);
            System.out.println("Elige la opción deseada:");
            System.out.println("1. Importar.");
            System.out.println("2. Ver ofertas.");
            System.out.println("3. Ver historial.");
            System.out.println("4. Ver lista vehiculos.");
            System.out.println("5. Salir.");
            Scanner scan = new Scanner(System.in);
            try{
                opMenu = Integer.parseInt(scan.nextLine());
            }catch(NumberFormatException e)
            {
                System.out.println("Por favor, ingrese un número válido.");
            }
            System.out.println("\n");
            int i = 1;
            switch(opMenu)
            {
                case 1:
                    System.out.println("Menú: Importar\n");
                    for(Proveedor proveedor: proveedores)
                    {
                        System.out.println("Proveedor " + i + ": " + proveedor.getNombre());
                        System.out.println("País: " + proveedor.getNombrePais());
                        System.out.println("Representante: " + proveedor.getRepresentante());
                        System.out.println("===============================");
                        i++;
                    }
                    System.out.println("Selecciona un proveedor:\n");
                    int opProveedor = 0;
                    try{
                        opProveedor = Integer.parseInt(scan.nextLine());
                        Proveedor proveedor1 = proveedores.get(opProveedor - 1);
                        ArrayList<Vehiculo> vehiculos1 = proveedor1.getVehiculos();
                        i = 1;
                        for(Vehiculo vehiculo : vehiculos1)
                        {
                            System.out.println("Vehiculo " + i + ": " + vehiculo.getMarcaModelo());
                            int valorV = vehiculo.getValor() + Math.round(vehiculo.getValor()*proveedor1.getComision()/100);
                            System.out.println("Precio: " + valorV);
                            System.out.println("===============================");
                            i++;
                        }
                        System.out.println("Elige un vehiculo para importar:");
                        int opVehiculo = 0;
                        opVehiculo = Integer.parseInt(scan.nextLine());
                        ArrayList<Vehiculo> vehiculo1 = new ArrayList();
                        Vehiculo vehiculoComprado = vehiculos1.get(opVehiculo - 1);
                        vehiculo1.add(vehiculoComprado);
                        importar(1, vehiculo1, proveedor1);
                        System.out.println(vehiculoComprado.getMarcaModelo() + " importado con éxito.");
                        System.out.println("===============================\n");
                    }catch(Exception e)
                    {
                        System.out.println("Por favor, ingrese un número válido.");
                    }
                    break;
                case 2:
                    System.out.println("Menú: Ver ofertas");
                    for(Oferta oferta: ofertas)
                    {
                        System.out.println("Concesionario " + i + ": " + oferta.getConcesionario().getNombre());
                        System.out.println("===============================");
                        i++;
                    }
                    System.out.println("Selecciona una oferta:\n");
                    try{
                        int opOferta = Integer.parseInt(scan.nextLine());
                        ArrayList<Vehiculo> vehiculosOferta = ofertas.get(opOferta - 1).getVehiculos();
                        for(Vehiculo vehiculo : vehiculosOferta)
                        {
                            System.out.println(vehiculo.getMarcaModelo());
                        }
                        System.out.println("===============================");
                        int cantidad = 0;
                        for(int j = 0; j < vehiculosOferta.size(); j++)
                        {
                            for(int k = 0; k < vehiculos.size(); k++)
                            {
                                if(vehiculos.get(k).getMarcaModelo().contentEquals(vehiculosOferta.get(j).getMarcaModelo()))
                                {
                                    cantidad++;
                                    k = vehiculos.size();
                                }
                            }
                        }
                        if(cantidad == vehiculosOferta.size())
                        {
                            System.out.println("¿Deseas vender los vehículos al concesionario?");
                            System.out.println("1. Si.");
                            System.out.println("2. No.");
                            int opVender = Integer.parseInt(scan.nextLine());
                            if(opVender == 1)
                            {
                                vender(ofertas.get(opOferta - 1));
                                System.out.println("Venta realizada con éxito.");
                            }
                        }
                        else
                        {
                            System.out.println("No posees los vehículos para realizar la venta.");
                        }
                    }catch(Exception e)
                    {
                        System.out.println("Por favor, ingrese un número válido.");
                    }
                    break;
                case 3:
                    System.out.println("Menú: Historial\n");
                    ArrayList<Operacion> operaciones = historial.getOperaciones();
                    if(operaciones.size() != 0)
                    {
                        i = 1;
                        for(Operacion operacion : operaciones)
                        {
                            System.out.println("Operación " + i);
                            if (operacion instanceof Importacion)
                            {
                                System.out.println("Importación");
                            }
                            else
                            {
                                System.out.println("Oferta");
                            }
                            System.out.println("===============================");
                            i++;
                        }
                        System.out.println("Escoge una operación:");
                        try{
                            int opOperacion = Integer.parseInt(scan.nextLine());
                            if (operaciones.get(opOperacion - 1) instanceof Importacion)
                            {
                                Importacion importacion = (Importacion)operaciones.get(opOperacion - 1);
                                System.out.println("Detalles importación");
                                System.out.println("Proveedor: " + importacion.getProveedor().getNombre());
                                System.out.println("País de origen: " + importacion.getProveedor().getNombrePais());
                                System.out.println("Costo total: " + importacion.calcularValorVehiculos());
                                ArrayList<Vehiculo> vehiculosImportados = importacion.getVehiculos();
                                for(Vehiculo vehiculo : vehiculosImportados)
                                {
                                    System.out.println(vehiculo.getMarcaModelo());
                                    System.out.println("===============================");
                                }
                            }
                            else
                            {
                                Oferta oferta = (Oferta)operaciones.get(opOperacion - 1);
                                System.out.println("Detalles de venta");
                                System.out.println("Vendido a: " + oferta.getConcesionario().getNombre());
                                System.out.println("Precio total venta: " + oferta.calcularValorVehiculos());
                                ArrayList<Vehiculo> vehiculosVendidos = oferta.getVehiculos();
                                for(Vehiculo vehiculo : vehiculosVendidos)
                                {
                                    System.out.println(vehiculo.getMarcaModelo());
                                    System.out.println("===============================");
                                }
                            }
                        }catch(Exception e)
                        {
                            System.out.println("Por favor, ingrese un número válido.");
                        }
                    }
                    else
                    {
                        System.out.println("No se han realizado operaciones\n");
                    }
                    break;
                case 4:
                    System.out.println("Menú: Lista de vehículos");
                    System.out.println("Cantidad: " + vehiculos.size() + "\n");
                    i = 1;
                    for(Vehiculo vehiculo : vehiculos)
                    {
                        System.out.println("Vehiculo " + i + ": " + vehiculo.getMarcaModelo());
                        int valorV = vehiculo.getValor() + Math.round(vehiculo.getValor()*comision/100);
                        System.out.println("Precio de venta: " + valorV);
                        System.out.println("===============================");
                        i++;
                    }
                    break;
                case 5:
                    System.out.println("Adios.");
                    break;
                default:
                    System.out.println("Por favor, ingrese un número válido.");
                    break;
            }
        }while(opMenu != 5);
    }
    
    /**
     * Genera una oferta con vehículos aleatorios dependiendo de la marca del concesionario.
     * 
     * @param  concesionario Concesionario que pide los vehículos.
     * @return Una nueva oferta.
     */
    public Oferta generarOferta(Concesionario concesionario)
    {
        ArrayList<Vehiculo> v = new ArrayList();
        ArrayList<Vehiculo> listaVehiculos = Fabrica.cargarVehiculos();
        for(Vehiculo vehiculo : listaVehiculos)
        {
            if(vehiculo.getMarca() == concesionario.getMarca())
            {
                if(Math.random() < 0.3)
                {
                    v.add(vehiculo);
                }
            }
            else if(concesionario.getMarca() == "")
            {
                if(Math.random() < 0.3)
                {
                    v.add(vehiculo);
                }
            }
        }
        if(v.size() == 0)
        {
            for(int i = 0; i < listaVehiculos.size(); i++)
            {
                if(listaVehiculos.get(i).getMarca() == concesionario.getMarca())
                {
                    v.add(listaVehiculos.get(i));
                    i = listaVehiculos.size();
                }
                else if(concesionario.getMarca() == "")
                {
                    v.add(listaVehiculos.get(i));
                    i = listaVehiculos.size();
                }
            }
        }
        Oferta oferta = new Oferta(v, concesionario);
        return oferta;
    }
    
    /**
     * Genera ofertas para cada concesionario (sólo si no hay una oferta por cada concesionario).
     */
    public void generarOfertas()
    {
        for(Concesionario concesionario : concesionarios)
        {
            ofertas.add(generarOferta(concesionario));
        }
    }
    
    /**
     * Rellena con datos de prueba que provienen de la clase Fabrica.
     */
    public void cargarDemo()
    {
        concesionarios = Fabrica.cargarConcesionarios();
        proveedores = Fabrica.cargarProveedores();
        historial = Fabrica.generarHistorial();
        if(ofertas.size() == 0)
        {
            generarOfertas();
        }
    }
    
    /**
     * Añade una lista de vehículos resultante de una importación.
     * 
     * @param  vehículos Nuevos vehículos importados.
     */
    public void añadirVehiculos(ArrayList<Vehiculo> vehiculos)
    {
        for(Vehiculo vehiculo : vehiculos)
        {
            this.vehiculos.add(vehiculo);
        }
    }
    
    /**
     * Importa vehículos a partir de un proveedor dado.
     * 
     * @param  transporte Tipo de transporte utilizado.
     * 
     * @param vehículos Vehículos a importar.
     * 
     * @param proveedor Proveedor que ofrece los vehículos.
     */
    public void importar(int transporte, ArrayList<Vehiculo> vehiculos, Proveedor proveedor)
    {
        for(Vehiculo vehiculo : vehiculos)
        {
            vehiculo.setValor(vehiculo.getValor() + Math.round(vehiculo.getValor()*proveedor.getComision()/100));
        }
        Importacion importacion = new Importacion(transporte, vehiculos, proveedor);
        dinero = dinero - importacion.calcularValorVehiculos();
        añadirVehiculos(vehiculos);
        historial.añadirOperacion(importacion);
    }
    
    /**
     * Vende vehículos a un concesionario a partir de una oferta.
     * 
     * @param  oferta Oferta de venta.
     */
    public void vender(Oferta oferta)
    {
        for(Vehiculo vehiculo : oferta.getVehiculos())
        {
            for(int i = 0; i < vehiculos.size(); i++)
            {
                Vehiculo v = vehiculos.get(i);
                if(v.getMarcaModelo().contentEquals(vehiculo.getMarcaModelo()))
                {
                    vehiculo.setValor(v.getValor());
                    vehiculos.remove(v);
                    i = vehiculos.size();
                }
            }
            vehiculo.setValor(vehiculo.getValor() + Math.round(vehiculo.getValor()*comision/100));
        }
        dinero = dinero + oferta.calcularValorVehiculos();
        historial.añadirOperacion(oferta);
        ofertas.remove(oferta);
        ofertas.add(generarOferta(oferta.getConcesionario()));
    }
    
    /**
     * Ejecuta la aplicación.
     */
    public static void main()
    {
        Main main = new Main();
        main.ejecutarConsola();
    }
}
