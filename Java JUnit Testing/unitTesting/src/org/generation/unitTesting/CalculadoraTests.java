package org.generation.unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTests {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}


class CalculatorTests {
    //Vamos a llamar un objeto de tipo calculadoa, pero modificador privado
    private Calculadora calculadoraTest;
    //Anotación le inidica a Junit que este metodo se ejecutara antes que todo lo demas. 
    @BeforeEach
    void setUp(){
        calculadoraTest = new Calculadora();
    }

    //No retornal, en el body, llevan datos de entrada, datos de salida y afirmaciones
    @Test
    @DisplayName("Sumando dos enteros")
    void sumarTest() {
        assertEquals(10,calculadoraTest.sumar(5, 5));
    }
    
    @Test
    @DisplayName("Restando dos enteros")
    void restarTest() {
        assertEquals(5,calculadoraTest.restar(10, 5));
    }
    
    @Test
    @DisplayName("Multiplicando enteros")
    void  multiplicarTest () {
        assertEquals(2, calculadoraTest.multiplicar(1, 2));
    }
    
    @Test
    @DisplayName("Diviendo dos enteros")
    void dividirTest() {
        assertEquals(3,calculadoraTest.dividir(3,1));
    }

}