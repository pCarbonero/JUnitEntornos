package clasestest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("esPrimo")
	void testEsPrimo(int num, boolean expected) {
		Numeros numeros = new Numeros(num);
		numeros.esPrimo();
		boolean res = numeros.esPrimo();
		assertEquals(expected, res);
	}
	private static Stream<Arguments> esPrimo(){
		return Stream.of(
				Arguments.of(7, true),
				Arguments.of(8, false),
				Arguments.of(1, false)
		);
	}
	
	@ParameterizedTest
	@MethodSource("esCapicua")
	void testEsCapicua(int num, boolean expected) {
		Numeros numeros = new Numeros(num);
		numeros.esCapicua();
		boolean res = numeros.esCapicua();
		assertEquals(expected, res);
	}
	private static Stream<Arguments> esCapicua(){
		return Stream.of(
				Arguments.of(1771, true),
				Arguments.of(223, false),
				Arguments.of(-9, false)
		);
	}

}
