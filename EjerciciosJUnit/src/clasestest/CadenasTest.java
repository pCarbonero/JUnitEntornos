package clasestest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {

	@ParameterizedTest
	@MethodSource("cuentaEspacios")
	void testCuentaEspacios(String frase, int expected) {
		Cadenas cad = new Cadenas(frase);
		int res = cad.cuentaEspacios();
		assertEquals(expected, res);
	}
	private static Stream<Arguments> cuentaEspacios(){
		return Stream.of(
				Arguments.of("Soy Pablo", 1),
				Arguments.of("Vivan las campanas de la campana", 5),
				Arguments.of("Welinton", 0)
		);
	}
	
	
	@ParameterizedTest
	@MethodSource("delReves")
	void testDelReves(String frase, String expected) {
		Cadenas cad = new Cadenas(frase);
		String res = cad.delReves();
		assertEquals(expected, res);
	}
	private static Stream<Arguments> delReves(){
		return Stream.of(
				Arguments.of("Hola", "aloH"),
				Arguments.of("Pablo", "olbaP"),
				Arguments.of("campana", "anapmac")
		);
	}
	
	
	@ParameterizedTest
	@MethodSource("contarPalabra")
	void testContarPalabra(String frase, String palabra, int expected) {
		Cadenas cad = new Cadenas(frase);
		int res = cad.contarPalabra(palabra);
		assertEquals(expected, res);
	}
	private static Stream<Arguments> contarPalabra(){
		return Stream.of(
				Arguments.of("Hola que tal", "Hola", 1),
				Arguments.of("Hola yo soy yo y tu", "yo", 2),
				Arguments.of("Pepe el mejor", "Ternario", 0)
		);
	}
}
