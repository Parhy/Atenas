import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OfertaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OfertaTest
{
    /**
     * Default constructor for test class OfertaTest
     */
    public OfertaTest()
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
    public void calcularVentaVehiculos()
    {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        Vehiculo v1 = new Vehiculo("Chevrolet", "Spark GT", 30000000);
        Vehiculo v2 = new Vehiculo("Mitsubishi", "Eclipse", 50000000);
        Vehiculo v3 = new Vehiculo("Porsche", "Carrera 911", 70000000);
        
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        
        Oferta oferta = new Oferta(vehiculos, new Concesionario());
        
        assertEquals(oferta.calcularValorVehiculos(), v1.getValor() + v2.getValor() + v3.getValor());
    }
}
