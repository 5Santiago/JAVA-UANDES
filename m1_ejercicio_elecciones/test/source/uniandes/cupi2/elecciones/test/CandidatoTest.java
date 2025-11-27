/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: CandidatoTest.java 445 2007-06-25 16:30:28Z camil-ji $
 * Universidad de los Andes (Bogot - Colombia)
 * Departamento de Ingeniera de Sistemas y Computacin 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_elecciones
 * Autor: Carlos Andrs Vega - 29-ene-2007
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.elecciones.test;

import uniandes.cupi2.elecciones.mundo.Candidato;
import junit.framework.TestCase;

/**
 * Esta es la clase usada para verificar que los mtodos de la clase Candidato estn correctamente implementados
 */
public class CandidatoTest extends TestCase
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es la clase donde se harn las pruebas
     */
    private Candidato candidato;

    // -----------------------------------------------------------------
    // Mtodos
    // -------------------------

    /**
     * Construye un nuevo Candidato
     */
    private void setupEscenario1( )
    {
        candidato = new Candidato( "Felipe", "Pitti", "Independiente", 27 );
    }

    /**
     * Prueba 1 - Test del mtodo constructor - Inicializar los datos del candidato correctamente
     */
    public void testInicializar( )
    {
        setupEscenario1( );

        assertTrue( "No se crea con el nombre dado por parmetro", candidato.darNombre( ).equals( "Felipe" ) );
        assertTrue( "No se crea con el apellido dado por parmetro", candidato.darApellido( ).equals( "Pitti" ) );
        assertTrue( "No se crea con el partido poltico dado por parmetro", candidato.darPartidoPolitico( ).equals( "Independiente" ) );
        assertTrue( "No se crea con la edad dada por parmetro", candidato.darEdad( ) == 27 );
        assertTrue( "No se crea con el costo de campaa en 0", candidato.darCostoCampanha( ) == 0 );
        assertTrue( "No se crea con el nmero de votos en 0", candidato.darVotos( ) == 0 );
       
    }

    /**
     * Prueba 2 - Agregar un voto al candidato influenciado por la televisin correctamente
     */
    public void testAgregarVotoTelevision( )
    {
        setupEscenario1( );

        candidato.agregarVotoTelevision( );
        assertTrue( "No aumenta el costo de campaa en 1000", candidato.darCostoCampanha( ) == 1000 );
    }

    /**
     * Prueba 3 - Agregar un voto al candidato influenciado por la radio correctamente
     */
    public void testAgregarVotoRadio( )
    {
        setupEscenario1( );

        candidato.agregarVotoRadio( );
        assertTrue( "No aumenta el costo de campaa en 500", candidato.darCostoCampanha( ) == 500 );
    }

    /**
     * Prueba 4 - Agregar un voto al candidato influenciado por Internet correctamente
     */
    public void testAgregarVotoInternet( )
    {
        setupEscenario1( );

        candidato.agregarVotoInternet( );
        assertTrue( "No aumenta el costo de campaa en 100", candidato.darCostoCampanha( ) == 100 );
    }

    /**
     * Prueba 5 - Reiniciar los votos del candidato correctamente
     */
    public void testReiniciarConteoVotos( )
    {
        setupEscenario1( );

        candidato.agregarVotoTelevision( );
        candidato.agregarVotoRadio( );
        candidato.agregarVotoInternet( );
        candidato.reiniciarConteoVotos( );

        assertTrue( "No inicializa el nmero de votos a 0", candidato.darVotos( ) == 0 );
        assertTrue( "No inicializa el nmero de votos influenciados por internet a 0.", candidato.darVotosInfluenciaInternet()==0 );
    }

    /**
     * Prueba 6 - Reiniciar el costo de campaa del candidato correctamente
     */
    public void testReiniciarCostoCampanha( )
    {
        setupEscenario1( );

        candidato.agregarVotoTelevision( );
        candidato.agregarVotoRadio( );
        candidato.agregarVotoInternet( );
        candidato.reiniciarCostoCampanha( );

        assertTrue( "No inicializa el costo de campaa a 0", candidato.darCostoCampanha( ) == 0 );
    }
    
    /**
     * Prueba 7 - Agregar voto genero masculino.
     */
    public void testAgregarVotoGeneroMasculino()
    {
    	setupEscenario1();
    	candidato.agregarVotoGeneroMasculino();
    	assertEquals("Debera tener 1 voto.", 1, candidato.darVotosGeneroMasculino());
    	candidato.agregarVotoGeneroMasculino();
    	candidato.agregarVotoGeneroMasculino();
    	assertEquals("Debera tener 3 votos.", 3, candidato.darVotosGeneroMasculino());
    }
    
    /**
     * Prueba 8 - Agregar voto genero femenino.
     */
    public void testAgregarVotoGeneroFemenino()
    {
    	setupEscenario1();
    	candidato.agregarVotoGeneroFemenino();
    	assertEquals("Debera tener 1 voto.", 1, candidato.darVotosGeneroFemenino());
    	candidato.agregarVotoGeneroFemenino();
    	candidato.agregarVotoGeneroFemenino();
    	assertEquals("Debera tener 3 votos.", 3, candidato.darVotosGeneroFemenino());
    }
    
    /**
     * Prueba 9 - Agregar voto rango de edad joven.
     */
    public void testAgregarVotoEdadJoven()
    {
    	setupEscenario1();
    	candidato.agregarVotoEdadJoven();
    	assertEquals("Debera tener 1 voto.", 1, candidato.darVotosEdadJoven());
    	candidato.agregarVotoEdadJoven();
    	candidato.agregarVotoEdadJoven();
    	assertEquals("Debera tener 3 votos.", 3, candidato.darVotosEdadJoven());
    }
    
    /**
     * Prueba 10 - Agregar voto rango de edad media.
     */
    public void testAgregarVotoEdadMedia()
    {
    	setupEscenario1();
    	candidato.agregarVotoEdadMedia();
    	assertEquals("Debera tener 1 voto.", 1, candidato.darVotosEdadMedia());
    	candidato.agregarVotoEdadMedia();
    	candidato.agregarVotoEdadMedia();
    	assertEquals("Debera tener 3 votos.", 3, candidato.darVotosEdadMedia());
    }
    
    /**
     * Prueba 11 - Agregar voto rango de edad mayor.
     */
    public void testAgregarVotoEdadMayor()
    {
    	setupEscenario1();
    	candidato.agregarVotoEdadMayor();
    	assertEquals("Debera tener 1 voto.", 1, candidato.darVotosEdadMayor());
    	candidato.agregarVotoEdadMayor();
    	candidato.agregarVotoEdadMayor();
    	assertEquals("Debercla tener 3 votos.", 3, candidato.darVotosEdadMayor());
    }
    
}
