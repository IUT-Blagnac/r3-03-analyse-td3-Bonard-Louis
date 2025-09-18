package com.iutblagnac.r303trace;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Classe de test unitaire pour App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Constructeur du test.
     * @param testName nom du test
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * Retourne la suite de tests à exécuter.
     * @return la suite de tests
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Vérifie que la méthode hello() retourne "Hello World".
     */
    public void testHelloWorldRequirement() {
        assertEquals("Hello World", App.hello());
    }

    // ...existing code...
}
