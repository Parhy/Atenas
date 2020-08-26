import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProveedorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProveedorTest
{
    /**
     * Default constructor for test class ProveedorTest
     */
    public ProveedorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void obtenerValorVehículo()
    {
        Proveedor proveedor = new Proveedor();
        int comision = 10;
        proveedor.setComision(comision);
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        Vehiculo v1 = new Vehiculo("Chevrolet", "Spark GT", 30000000);
        vehiculos.add(v1);
        proveedor.setVehiculos(vehiculos);
        
        assertEquals(proveedor.getValorVehiculo(0), v1.getValor() + Math.round(v1.getValor()*comision/100));
    }
}
