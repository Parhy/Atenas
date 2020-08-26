import java.util.ArrayList;

/**
 * Clase encargada de generar los datos de prueba.
 * 
 * @author Atenas 
 * @version 23/08/2020
 */
public class Fabrica
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Fabrica
     */
    private Fabrica()
    {
        // initialise instance variables
    }

    /**
     * Método para cargar vehículos que sean japoneses.
     * 
     * @return Vehículos frabicados en Japón.
     */
    protected static ArrayList<Vehiculo> cargarVehiculosJaponeses()
    {
        // put your code here
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        Vehiculo v7 = new Vehiculo("Mazda", "2", 61950000);
        Vehiculo v8 = new Vehiculo("Mazda", "3", 67300000);
        Vehiculo v9 = new Vehiculo("Mazda", "CX-3", 71800000);
        Vehiculo v10 = new Vehiculo("Mazda", "CX-5", 117500000);
        Vehiculo v11 = new Vehiculo("Mazda", "CX-9", 165100000);
        Vehiculo v12 = new Vehiculo("Toyota", "SW4 Fortuner", 179600000);
        Vehiculo v13 = new Vehiculo("Toyota", "Hilux", 128600000);
        Vehiculo v14 = new Vehiculo("Toyota", "Prado", 205500000);
        Vehiculo v15 = new Vehiculo("Toyota", "RAV4", 119900000);
        Vehiculo v16 = new Vehiculo("Toyota", "Corolla", 80300000);
        Vehiculo v40 = new Vehiculo("Nissan", "March", 43990000);
        Vehiculo v41 = new Vehiculo("Nissan", "Frontier", 75490000);
        Vehiculo v42 = new Vehiculo("Nissan", "Kicks", 74490000);
        Vehiculo v43 = new Vehiculo("Nissan", "Versa", 55990000);
        Vehiculo v44 = new Vehiculo("Nissan", "Qashqai", 85990000);
        Vehiculo v45 = new Vehiculo("Nissan", "X-Trail", 101990000);
        Vehiculo v46 = new Vehiculo("Nissan", "Leaf", 140000000);
        Vehiculo v47 = new Vehiculo("Suzuki", "Vitara", 63990000);
        Vehiculo v48 = new Vehiculo("Suzuki", "Swift", 46490000);
        Vehiculo v49 = new Vehiculo("Suzuki", "S-Cross", 64990000);
        Vehiculo v50 = new Vehiculo("Suzuki", "Alto", 32390000);
        Vehiculo v51 = new Vehiculo("Suzuki", "Ertiga", 774990000);
        
        vehiculos.add(v7);
        vehiculos.add(v8);
        vehiculos.add(v9);
        vehiculos.add(v10);
        vehiculos.add(v11);
        vehiculos.add(v12);
        vehiculos.add(v13);
        vehiculos.add(v14);
        vehiculos.add(v15);
        vehiculos.add(v16);
        vehiculos.add(v40);
        vehiculos.add(v41);
        vehiculos.add(v42);
        vehiculos.add(v43);
        vehiculos.add(v44);
        vehiculos.add(v45);
        vehiculos.add(v46);
        vehiculos.add(v47);
        vehiculos.add(v48);
        vehiculos.add(v49);
        vehiculos.add(v50);
        vehiculos.add(v51);
        
        return vehiculos;
    }
    
    /**
     * Método para cargar vehículos que sean surcoreanos.
     * 
     * @return Vehículos frabicados en Corea del Sur.
     */
    protected static ArrayList<Vehiculo> cargarVehiculosSurcoreanos()
    {
        // put your code here
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        Vehiculo v29 = new Vehiculo("Kia", "Picanto", 39000000);
        Vehiculo v30 = new Vehiculo("Kia", "Rio", 41440000);
        Vehiculo v31 = new Vehiculo("Kia", "Eko Taxi", 49900000);
        Vehiculo v32 = new Vehiculo("Kia", "Sportage", 87490000);
        Vehiculo v33 = new Vehiculo("Kia", "Niro", 92990000);
        
        vehiculos.add(v29);
        vehiculos.add(v30);
        vehiculos.add(v31);
        vehiculos.add(v32);
        vehiculos.add(v33);
        
        return vehiculos;
    }
    
    /**
     * Método para cargar vehículos que sean alemanes.
     * 
     * @return Vehículos frabicados en Alemania.
     */
    protected static ArrayList<Vehiculo> cargarVehiculosAlemanes()
    {
        // put your code here
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        Vehiculo v34 = new Vehiculo("Volkswagen", "Gol", 44490000);
        Vehiculo v35 = new Vehiculo("Volkswagen", "Voyage", 50990000);
        Vehiculo v36 = new Vehiculo("Volkswagen", "Jetta", 61970000);
        Vehiculo v37 = new Vehiculo("Volkswagen", "Amarok", 118990000);
        Vehiculo v38 = new Vehiculo("Volkswagen", "Virtus", 50990000);
        Vehiculo v39 = new Vehiculo("Volkswagen", "T-Cross", 72990000);
        
        vehiculos.add(v34);
        vehiculos.add(v35);
        vehiculos.add(v36);
        vehiculos.add(v37);
        vehiculos.add(v38);
        vehiculos.add(v39);
        
        return vehiculos;
    }
    
    /**
     * Método para cargar vehículos que sean franceses.
     * 
     * @return Vehículos frabicados en Francia.
     */
    protected static ArrayList<Vehiculo> cargarVehiculosFranceses()
    {
        // put your code here
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        Vehiculo v17 = new Vehiculo("Renault", "Duster", 56090000);
        Vehiculo v18 = new Vehiculo("Renault", "Sandero", 41790000);
        Vehiculo v19 = new Vehiculo("Renault", "Logan", 45890000);
        Vehiculo v20 = new Vehiculo("Renault", "Kwid", 29990000);
        Vehiculo v21 = new Vehiculo("Renault", "Captur", 145481000);
        Vehiculo v22 = new Vehiculo("Renault", "Twizy Technic", 44850000);
        Vehiculo v23 = new Vehiculo("Renault", "Zoe", 106000000);
        
        vehiculos.add(v17);
        vehiculos.add(v18);
        vehiculos.add(v19);
        vehiculos.add(v20);
        vehiculos.add(v21);
        vehiculos.add(v22);
        vehiculos.add(v23);
        
        return vehiculos;
    }
    
    /**
     * Método para cargar vehículos que sean estadounidenses.
     * 
     * @return Vehículos frabicados en Estados Unidos.
     */
    protected static ArrayList<Vehiculo> cargarVehiculosEstadounidenses()
    {
        // put your code here
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        Vehiculo v1 = new Vehiculo("Chevrolet", "Onix", 48490000);
        Vehiculo v2 = new Vehiculo("Chevrolet", "Beat", 38700000);
        Vehiculo v3 = new Vehiculo("Chevrolet", "Spark", 23990000);
        Vehiculo v4 = new Vehiculo("Chevrolet", "Tracker", 74090000);
        Vehiculo v5 = new Vehiculo("Chevrolet", "Sail", 31990000);
        Vehiculo v6 = new Vehiculo("Chevrolet", "Equinox", 106690000);
        Vehiculo v24 = new Vehiculo("Ford", "EcoSport", 65460000);
        Vehiculo v25 = new Vehiculo("Ford", "Escape", 147990000);
        Vehiculo v26 = new Vehiculo("Ford", "Ranger", 141990000);
        Vehiculo v27 = new Vehiculo("Ford", "Explorer", 190000000);
        Vehiculo v28 = new Vehiculo("Ford", "Fiesta", 34900000);
        
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);
        vehiculos.add(v5);
        vehiculos.add(v6);
        vehiculos.add(v24);
        vehiculos.add(v25);
        vehiculos.add(v26);
        vehiculos.add(v27);
        vehiculos.add(v28);
        
        return vehiculos;
    }
    
    /**
     * Método para cargar unos proveedores de prueba
     */
    protected static ArrayList<Proveedor> cargarProveedores()
    {
        // put your code here
        ArrayList<Proveedor> proveedores = new ArrayList();
        
        ArrayList<Pais> paises = Fabrica.cargarPaises();
        
        ArrayList<Vehiculo> vehiculosJaponeses = cargarVehiculosJaponeses();
        ArrayList<Vehiculo> vehiculosSurcoreanos = cargarVehiculosSurcoreanos();
        ArrayList<Vehiculo> vehiculosAlemanes = cargarVehiculosAlemanes();
        ArrayList<Vehiculo> vehiculosFranceses = cargarVehiculosFranceses();
        ArrayList<Vehiculo> vehiculosEstadounidenses = cargarVehiculosEstadounidenses();
        
        Proveedor proveedor1 = new Proveedor("Proveedor de Japón", paises.get(0), "Akira Toriyama", 8, vehiculosJaponeses);
        Proveedor proveedor2 = new Proveedor("Proveedor de Corea del Sur", paises.get(1), "Ho Lee Shee", 8, vehiculosSurcoreanos);
        Proveedor proveedor3 = new Proveedor("Proveedor de Alemania", paises.get(2), "Manuel Neuer", 8, vehiculosAlemanes);
        Proveedor proveedor4 = new Proveedor("Proveedor de Francia", paises.get(3), "Hugo Lloris", 8, vehiculosFranceses);
        Proveedor proveedor5 = new Proveedor("Proveedor de Estados Unidos", paises.get(4), "Elon Musk", 8, vehiculosEstadounidenses);
        
        proveedores.add(proveedor1);
        proveedores.add(proveedor2);
        proveedores.add(proveedor3);
        proveedores.add(proveedor4);
        proveedores.add(proveedor5);
        
        return proveedores;
    }
    
    /**
     * Método para cargar países de prueba.
     */
    protected static ArrayList<Pais> cargarPaises()
    {
        // put your code here
        ArrayList<Pais> paises = new ArrayList();
        
        boolean[] transporte1 = new boolean[3];
        transporte1[0] = false;
        transporte1[1] = true;
        transporte1[2] = true;
        
        Pais japon = new Pais("Japón", transporte1);
        paises.add(japon);
        
        Pais surcorea = new Pais("Corea del sur", transporte1);
        paises.add(surcorea);
        
        Pais alemania = new Pais("Alemania", transporte1);
        paises.add(alemania);
        
        Pais francia = new Pais("Francia", transporte1);
        paises.add(francia);
        
        Pais eeuu = new Pais("Estados Unidos", transporte1);
        paises.add(eeuu);
        
        return paises;
    }
    
    /**
     * Método para cargar un historial de prueba.
     */
    protected static Historial generarHistorial()
    {
        ArrayList<Proveedor> proveedores = cargarProveedores();
        
        ArrayList<Vehiculo> vehiculos1 = cargarVehiculosJaponeses();
        vehiculos1.remove(0);
        vehiculos1.remove(1);
        vehiculos1.remove(2);
        vehiculos1.remove(3);
        vehiculos1.remove(5);
        vehiculos1.remove(6);
        vehiculos1.remove(7);
        vehiculos1.remove(8);
        vehiculos1.remove(10);
        vehiculos1.remove(11);
        vehiculos1.remove(3);
        vehiculos1.remove(5);
        vehiculos1.remove(5);
        vehiculos1.remove(6);
        vehiculos1.remove(7);
        vehiculos1.remove(6);
        vehiculos1.remove(5);
        vehiculos1.remove(4);
        
        ArrayList<Vehiculo> vehiculos2 = cargarVehiculosSurcoreanos();
        vehiculos2.remove(2);
        vehiculos2.remove(2);
        vehiculos2.remove(2);
        
        Proveedor proveedor1 = proveedores.get(0);
        Proveedor proveedor2 = proveedores.get(1);
        
        Importacion importacion1 = new Importacion(1, vehiculos1, proveedor1);
        Importacion importacion2 = new Importacion(1, vehiculos2, proveedor2);
        
        Concesionario concesionario1 = new Concesionario("Concesionario de Bogotá", "Bogotá", "", "");
        Concesionario concesionario2 = new Concesionario("Concesionario de Bucaramanga", "Bucaramanga", "", "Kia");
        
        Oferta oferta1 = new Oferta(vehiculos1, concesionario1);
        Oferta oferta2 = new Oferta(vehiculos2, concesionario2);
        
        ArrayList<Operacion> operaciones = new ArrayList();
        operaciones.add(importacion1);
        operaciones.add(importacion2);
        operaciones.add(oferta1);
        operaciones.add(oferta2);
        
        Historial historial = new Historial();
        historial.setOperaciones(operaciones);
        
        return historial;
    }
    
    /**
     * Método para cargar concesionarios de prueba.
     */
    protected static ArrayList<Concesionario> cargarConcesionarios()
    {
        // put your code here
        ArrayList<Concesionario> concesionarios = new ArrayList();
        
        Concesionario concesionario1 = new Concesionario("Concesionario de Bogotá", "Bogotá", "", "");
        Concesionario concesionario2 = new Concesionario("Concesionario de Bucaramanga", "Bucaramanga", "", "Kia");
        Concesionario concesionario3 = new Concesionario("Concesionario de Medellín", "Medellín", "", "Chevrolet");
        Concesionario concesionario4 = new Concesionario("Concesionario de Cali", "Cali", "", "Volkswagen");
        Concesionario concesionario5 = new Concesionario("Concesionario de Cartagena", "Cartagena", "", "");
        
        concesionarios.add(concesionario1);
        concesionarios.add(concesionario2);
        concesionarios.add(concesionario3);
        concesionarios.add(concesionario4);
        concesionarios.add(concesionario5);
        
        return concesionarios;
    }
    
    /**
     * Método para cargar los vehículos.
     */
    protected static ArrayList<Vehiculo> cargarVehiculos()
    {
        ArrayList<Vehiculo> vehiculos = Fabrica.cargarVehiculosJaponeses();
        ArrayList<Vehiculo> vehiculos2 = Fabrica.cargarVehiculosSurcoreanos();
        ArrayList<Vehiculo> vehiculos3 = Fabrica.cargarVehiculosAlemanes();
        ArrayList<Vehiculo> vehiculos4 = Fabrica.cargarVehiculosFranceses();
        ArrayList<Vehiculo> vehiculos5 = Fabrica.cargarVehiculosEstadounidenses();
        
        for(Vehiculo vehiculo : vehiculos2)
        {
            vehiculos.add(vehiculo);
        }
        for(Vehiculo vehiculo : vehiculos3)
        {
            vehiculos.add(vehiculo);
        }
        for(Vehiculo vehiculo : vehiculos4)
        {
            vehiculos.add(vehiculo);
        }
        for(Vehiculo vehiculo : vehiculos5)
        {
            vehiculos.add(vehiculo);
        }
        
        return vehiculos;
    }
}
